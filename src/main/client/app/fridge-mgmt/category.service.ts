import {Injectable} from "@angular/core";

import {Headers, Http, URLSearchParams} from '@angular/http';
import 'rxjs/add/operator/toPromise';
import {Category} from "./Structures";

@Injectable()
export class CategoryService {
  private postHeaders = new Headers({'Content-Type': 'application/json'});

  private getCategories : string = "http://localhost:8080/services/category/all";

  constructor(private http: Http) { }

  getAllCategories() : Promise<Category[]> {
    return this.http.get(this.getCategories, {headers:this.postHeaders})
      .toPromise()
      .then(response => response.json() as Category[])
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  };
}
