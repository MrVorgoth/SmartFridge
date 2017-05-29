import { Component, Input } from '@angular/core';
import {ProductService} from "../products.service";
import {ProductBase} from "../Structures";

@Component({
  selector: 'baseProduct',
  template: require('./baseProduct.component.html!text')
} as Component)
export class BaseProduct {
  @Input() product: ProductBase;
  modified: boolean = false;

  constructor(private productService: ProductService){
  }

  delete(id: number): void {
    this.productService.deleteProduct(id).then(status => {console.log(status); if(status == 200) this.product.id = -1;});
  }

  update(product: ProductBase): void {
    this.productService.updateProduct(product).then(resp => {console.log(resp); this.modified = false});
  }

  productChange() : void {
    this.modified = true;
  }
}
