import {Injectable} from '@angular/core';
import { PRODUCTS } from './mockProducts'
import {Headers, Http, URLSearchParams} from '@angular/http';
import 'rxjs/add/operator/toPromise';
import {Product} from "./Structures";

@Injectable()
export class FridgeService {
  private postHeaders = new Headers({'Content-Type': 'application/json'});

  private getContentURL : string = "http://localhost:8080/services/userFridge/getContent";
  private setContentURL : string = "http://localhost:8080/services/userFridge/setContent";

  constructor(private http: Http) { }

  getFridgeContent(login : string) : Promise<Product[]> {
    let params = new URLSearchParams();
    params.append("login", login);

    return this.http.get(this.getContentURL, {search: params})
      .toPromise()
      .then(response => response.json() as Product[])
      .catch(this.handleError);
  }

  setFridgeContent(login : string, products : Product[]) : void {
    let params = new URLSearchParams();
    params.append("login", login);

    this.http.put(this.setContentURL, JSON.stringify(products),{headers:this.postHeaders})
      .toPromise()
      .then(response => console.log(response.status))
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  };
}
