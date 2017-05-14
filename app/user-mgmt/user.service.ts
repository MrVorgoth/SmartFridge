import {Injectable} from '@angular/core';
import {Headers, Http, URLSearchParams} from '@angular/http';
import 'rxjs/add/operator/toPromise';
import {Observable} from "rxjs";

@Injectable()
export class UserService {
  private users: User[] = [];
  private sequencer: number = 1;
  private isAuthorized: boolean = false;
  private headers = new Headers({'Access-Control-Allow-Origin': '*'});
  private postHeaders = new Headers({'Access-Control-Allow-Origin': '*', 'Content-Type': 'application/json'});

  private getUserUrl: string = "http://localhost:8080/user/all";
  private createUserUrl: string = "http://localhost:8080/user/create";
  private searchUserUrl: string = "http://localhost:8080/user/search";
  private validateUserUrl: string = "http://localhost:8080/user/validate";

  constructor(private http: Http) {
  }

  getAllUsers(): Promise<User[]> {
    return this.http.get(this.getUserUrl, {headers: this.headers})
      .toPromise()
      .then(response => response.json() as User[])
      .catch(this.handleError);
  }

  getAuthorizedStatus() : boolean {
    return this.isAuthorized;
  }

  createUser(user: User): Promise<any> {
    console.log(JSON.stringify(user));
    return this.http.post(this.createUserUrl, JSON.stringify(user), {headers: this.postHeaders})
      .toPromise()
      .then(response => response.json() as User)
      .catch(this.handleError);
  }

  searchUser(login: string): Promise<User[]> {
    let params = new URLSearchParams();
    params.append("login", login);

    return this.http.get(this.searchUserUrl, {headers: this.headers, search: params})
      .toPromise()
      .then(response => response.json() as User[])
      .catch(this.handleError);
  }

  create(): void {
    let args = {};
    args['login'] = 'loginTest';
    args['password'] = 'passwordTest';
    args['name'] = 'nameTest';
    args['surname'] = 'surnameTest';

    this.http.get(this.createUserUrl, {headers: this.headers});
  }

  login(data : User): void {
    this.http.post(this.validateUserUrl, JSON.stringify(data), {headers: this.postHeaders})
      .toPromise()
      .then(response => {
        if (response.status == 200) {
          this.isAuthorized = true;
          window.location.href = "/register";
        } else {
          this.isAuthorized = false;
          window.location.href = "/login";
        }
      }).catch(() => {
      window.location.href = "/login";
      //return Observable.of(false);
    });
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  };
}

export class User {
  login: String;
  password: String;
  name: String;
  surname: String;
}
