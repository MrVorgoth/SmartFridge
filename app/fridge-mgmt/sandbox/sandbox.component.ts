import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {ProductService, Product} from "../products.service";


@Component({
  selector: 'sanbox',
  template: require('./sandbox.component.html!text'),
  styles: [require('./sandbox.component.css!text')]
} as Component)
export class SandboxComponent implements OnInit{
  products: Product[];
  singleProduct: Product = new Product();

  constructor(private productService: ProductService){
    this.singleProduct._name = 'Something';
    this.singleProduct._quantity = 5;
    this.singleProduct._unit = "l";
    this.singleProduct._imageUrl = "http://www.legendairy.com.au/~/media/legendairy/images/lhp/milk-carton-thumbnail.jpg?h=600&la=en&w=600";
  }

  ngOnInit(): void {
    this.getProducts();
  }

  getProducts(): void {
    this.productService.getAllProducts().then(products => this.products = products);
  }
}
