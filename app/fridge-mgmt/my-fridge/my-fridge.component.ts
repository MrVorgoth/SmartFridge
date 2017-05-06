import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {ProductService, ProductBase} from "../products.service";


@Component({
  selector: 'my-fridge',
  template: require('./my-fridge.component.html!text'),
  styles: [require('./my-fridge.component.css!text')]
} as Component)
export class MyFrideComponent implements OnInit{
  products : ProductBase[];
  constructor(private productService: ProductService){}

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts(): void {
   this.productService.getAllProducts().then(products => this.products = products);
  }

}
