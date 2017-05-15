
import {Injectable} from "@angular/core";
import {Headers, Http, URLSearchParams} from '@angular/http';
import {Product} from "./mocks/Product";
import {FRIDGE_MOCK} from "./mocks/FridgeMock";

@Injectable()
export class FridgeService {
  constructor(private http: Http) { }

  getProductsFromUserFridge(userId : string) : Promise<Product[]> {
    return Promise.resolve(FRIDGE_MOCK);
  }
}
