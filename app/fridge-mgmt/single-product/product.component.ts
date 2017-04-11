import { Component, Input } from '@angular/core';
import { Product} from "../products.service";


@Component({
  selector: 'single-product',
  template: require('./product.component.html!text'),
  styles: [require('./product.component.css!text')]
} as Component)
export class SingleProduct {
  @Input() product: Product;
  detailsShowed: boolean = false;
  constructor(){
    // if(this.product == null)
      this.product = new Product();
      this.product._name = "New";
  }

  increaseQuantity(): void {
    if(this.product._quantity < 0 || this.product._quantity == null) {
      this.product._quantity = 0;
    }else this.product._quantity++;
  }

  decreasQuantity(): void {
    if(this.product._quantity < 1 || this.product._quantity == null) {
      this.product._quantity = 0;
    }else this.product._quantity--;
  }

  changeDetailsState(): void {
    this.detailsShowed = !this.detailsShowed;
  }
}
