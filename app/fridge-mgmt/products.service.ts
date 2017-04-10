import {Injectable} from '@angular/core';
import { PRODUCTS } from './mockProducts'

import 'rxjs/add/operator/toPromise';

@Injectable()
export class ProductService {
  private products: Product[] = [];
  private sequencer: number = 1;

  getAllProducts(): Promise<Product[]> {
    return Promise.resolve(PRODUCTS);
  }

  private handleError(error: any): Promise<any> {
    console.error('An error occurred', error); // for demo purposes only
    return Promise.reject(error.message || error);
  };
}

export class Product {
  _id: number;
  _name: string;
  _quantity: number;
}
