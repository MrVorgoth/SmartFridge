import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {ProductService, ProductBase} from "../products.service";


@Component({
  selector: 'sanbox',
  template: require('./sandbox.component.html!text'),
  styles: [require('./sandbox.component.css!text')]
} as Component)
export class SandboxComponent implements OnInit{
  products: ProductBase[];

  constructor(private productService: ProductService){
  }

  ngOnInit(): void {
    this.getProductsFromServer();
  }


  getProductsFromServer(): void {
    this.productService.getAllProducts().then(pd => console.log(pd));
  }

  saveProduct(): void {
    console.log("Create product");
    this.productService.createProduct().then(resp => console.log(resp));
  }
}
