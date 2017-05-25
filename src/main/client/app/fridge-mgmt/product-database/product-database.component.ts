import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {ProductService, ProductBase} from "../products.service";

@Component({
  selector: 'product-database',
  template: require('./product-database.component.html!text')
} as Component)
export class ProductDatabaseComponent implements OnInit {
  newProduct: ProductBase = new ProductBase();
  products: ProductBase[];
  message: string;

  constructor(private productService: ProductService){
  }

  ngOnInit(): void {
    this.loadProducts();
  }

  loadProducts(): void {
    this.productService.getAllProducts().then(response => this.products = response);
  }

  saveProduct(): void {
    this.productService.createProduct(this.newProduct).then(response => {
      console.log(response);
      if(response != null) {
        this.products.push(response);
        this.message = "Product: " + response.name + " added";
      }
    });
  }

  searchProduct(name: string): void{
    this.productService.searchProducts(name).then(response => this.products = response);
  }


  test(): void {
    console.log('Test');
    console.log(this.products);
    console.log(this.newProduct);
  }
}
