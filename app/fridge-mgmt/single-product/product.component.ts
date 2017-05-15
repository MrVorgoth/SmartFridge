import { Component, Input } from '@angular/core';
import {Product} from "../mocks/Product";


@Component({
  selector: 'single-product',
  template: require('./product.component.html!text'),
  styles: [require('./product.component.css!text')]
} as Component)
export class SingleProduct {
  @Input() product: Product;
  detailsShowed: boolean = false;
  constructor(){
  }

  increaseQuantity(): void {
    if(this.product.quantity < 0 || this.product.quantity == null) {
      this.product.quantity = 0;
    }else this.product.quantity++;
  }

  decreasQuantity(): void {
    if(this.product.quantity < 1 || this.product.quantity == null) {
      this.product.quantity = 0;
    }else this.product.quantity--;
  }

  changeDetailsState(): void {
    this.detailsShowed = !this.detailsShowed;
  }
}
