import {Injectable} from '@angular/core';
import { PRODUCTS } from './mockProducts'
import { Headers, Http } from '@angular/http';
import 'rxjs/add/operator/toPromise';

@Injectable()
export class ProductService {
  private products: ProductBase[] = [];
  private sequencer: number = 1;
  private headers = new Headers({'Access-Control-Allow-Origin': '*'});
  private postHeaders = new Headers({'Access-Control-Allow-Origin': '*', 'Content-Type': 'application/json'});

  private getBaseProductsUrl : string = "http://localhost:8080/productBase/all";
  private createProductUrl : string = "http://localhost:8080/productBase/create";

  constructor(private http: Http) { }

  getAllProducts() : Promise<ProductBase[]> {
    return this.http.get(this.getBaseProductsUrl, {headers:this.headers})
      .toPromise()
      .then(response => response.json() as ProductBase[])
      .catch(this.handleError);
  }

  createProduct(product: ProductBase) : Promise<any> {
    console.log(JSON.stringify(product));
    return this.http.post(this.createProductUrl, JSON.stringify(product),{headers:this.postHeaders})
      .toPromise()
      .then(response => response.json() as ProductBase)
      .catch(this.handleError);
  }

  create(): void {
    let args = {};
    args['name'] = 'test';
    args['validityPeriod'] = 2;
    args['unit'] = 'kg';

    this.http.get(this.createProductUrl, {headers:this.headers});
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  };

}

export class ProductBase {
  id: number;
  name: string;
  units: string;
  baseValidityPeriod: number;
}
