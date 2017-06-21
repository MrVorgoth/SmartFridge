import {Injectable} from '@angular/core';
import { PRODUCTS } from './mockProducts'
import {Headers, Http, URLSearchParams} from '@angular/http';
import 'rxjs/add/operator/toPromise';
import {Product, ProductBase} from "./Structures";

@Injectable()
export class FridgeService {
  private postHeaders = new Headers({'Content-Type': 'application/json'});

  private getContentURL : string = "http://localhost:8080/services/userFridge/getContent";
  private setContentURL : string = "http://localhost:8080/services/userFridge/setContent";
  products : Product[];

  constructor(private http: Http) { }

  getFridgeContentFromServer(login : string) : Promise<Product[]> {
    let params = new URLSearchParams();
    params.append("login", login);

    return this.http.get(this.getContentURL, {search : params})
      .toPromise()
      .then(response => this.products = response.json() as Product[])
      .catch(this.handleError);
  }

  setFridgeContentOnServer(login : string, products : Product[]) : void {
    let params = new URLSearchParams();
    params.append("login", login);

    this.http.put(this.setContentURL, JSON.stringify(products),{headers:this.postHeaders, search : params})
      .toPromise()
      .then(response => console.log(response.status))
      .catch(this.handleError);
  }

  addProducts(product : ProductBase) : void {

    for(let i in this.products) {
      if (product.name == this.products[i].productBase.name /*&& product.insertDate == this.products[i].insertDate*/) {
        this.products[i].quantity++;
        console.log("quantity increased");
        return;
      }
    }
    let p = new Product();
    p.quantity = 1;
    p.productBase = product;
    p.fresh = true;

    console.log("product added");
    this.products.push(p);
  }



  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  };
}
