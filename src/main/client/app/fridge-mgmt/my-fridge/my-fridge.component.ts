import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {Product, ProductBase} from "../Structures";
import {FridgeService} from "../fridge.service";


@Component({
  selector: 'my-fridge',
  template: require('./my-fridge.component.html!text'),
  styles: [require('./my-fridge.component.css!text')]
} as Component)
export class MyFrideComponent implements OnInit{
  products : Product[];
  constructor(
    private fridgeService: FridgeService,

  ){}

  ngOnInit(): void {
    // this.getProducts();
  }

  // getProducts(): void {
  //  this.productService.getAllProducts().then(products => this.products = products);
  // }

  reciveProduct(prod : ProductBase) {
      console.log("reciveProducts");
  }

}
