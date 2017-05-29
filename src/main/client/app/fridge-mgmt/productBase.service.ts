import {Injectable} from "@angular/core";

import {Headers, Http, URLSearchParams} from '@angular/http';
import 'rxjs/add/operator/toPromise';
import {ProductBase} from "./Structures";

@Injectable()
export class ProductBaseService {
  private postHeaders = new Headers({'Content-Type': 'application/json'});

  private getBaseProductsUrl : string = "http://localhost:8080/productBase/all";
  private searchProductsUrl : string = "http://localhost:8080/productBase/search";
  private createProductUrl : string = "http://localhost:8080/productBase";

  constructor(private http: Http) { }

  getAllProducts() : Promise<ProductBase[]> {
    return this.http.get(this.getBaseProductsUrl, {headers:this.postHeaders})
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

  updateProduct(product: ProductBase) : Promise<any> {
    return this.http.put(this.createProductUrl, JSON.stringify(product),{headers:this.postHeaders})
      .toPromise()
      .then(response => response.json() as ProductBase)
      .catch(this.handleError);
  }

  deleteProduct(id: number) : Promise<any> {
    let params = new URLSearchParams();
    params.append("id", id.toString());

    return this.http.delete(this.createProductUrl, {headers:this.postHeaders, search: params})
      .toPromise()
      .then(response => response.status)
      .catch(this.handleError);
  }

  searchProducts(name: string, categoryId : string) : Promise<ProductBase[]> {
    let params = new URLSearchParams();
    params.append("name", name);
    params.append("categoryId", categoryId);

    return this.http.get(this.searchProductsUrl, {headers:this.postHeaders, search:params})
      .toPromise()
      .then(response => response.json() as ProductBase[])
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  };
}
