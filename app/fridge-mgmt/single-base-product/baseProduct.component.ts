import { Component, Input } from '@angular/core';
import {ProductBase} from "../products.service";

@Component({
  selector: 'baseProduct',
  template: require('./baseProduct.component.html!text')
} as Component)
export class BaseProduct {
  @Input() product: ProductBase;
}
