/**
 * Created by lodwr on 15.05.2017.
 */
import {Component, EventEmitter, Output} from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {Product} from "../mocks/Product";
import {ProductService} from "../products.service";

@Component({
  selector: 'product-store',
  template: require('./product-store.component.html!text')
} as Component)
export class ProductStoreComponent implements OnInit{
  filteredProducts: Product[];
  @Output() addProduct: EventEmitter<Product> = new EventEmitter<Product>();

  constructor(private productService: ProductService){}

  ngOnInit(): void {
    this.searchProducts(null);
  }

  searchProducts(pattern : string): void {
    this.productService.getMockedProducts(pattern).then(response => this.filteredProducts = response);
  }

  logFilteredProducts() : void {
    console.log(this.filteredProducts);
  }

  clickOnProduct(p : Product) : void {
    this.addProduct.next(p);
  }

}
