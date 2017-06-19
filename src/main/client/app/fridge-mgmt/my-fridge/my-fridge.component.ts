import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {Product, ProductBase} from "../Structures";
import {FridgeService} from "../fridge.service";
import {ProductService} from "../products.service";


@Component({
  selector: 'my-fridge',
  template: require('./my-fridge.component.html!text'),
  styles: [require('./my-fridge.component.css!text')]
} as Component)
export class MyFrideComponent implements OnInit{
  productsBase : ProductBase[];
  visibileProductBase : ProductBase[];

  userProducts : Product[] = [];

  filterName : string ="";
  filterCategory : string = "";

  constructor(
    private fridgeService: FridgeService,
    private productService: ProductService,

  ){}

  ngOnInit(): void {
    this.getAvailableProducts();
    this.getUserProducts();
  }

  getAvailableProducts(): void {
   this.productService.getAllProducts().then(products => {this.productsBase = products; this.getFilteredProducts()});
  }

  getFilteredProducts(): void {
    this.visibileProductBase = this.productsBase.slice().filter((p) => (this.filterName.length === 0 || p.name.toLowerCase().includes(this.filterName.toLowerCase())) && (this.filterCategory.length === 0 || p.category.name.toLowerCase().includes(this.filterCategory.toLowerCase())));
  }

  getUserProducts(): void {
      this.fridgeService.getFridgeContentFromServer("a").then(userProducts =>
        {
          this.userProducts = userProducts == null ? [] : userProducts;
          console.log(userProducts)});
  }

  addProductToFridge(productBase : ProductBase): void {
      let found = false;

      this.userProducts.forEach((product) =>{
        if(product.productBase.id === productBase.id) {
          product.quantity++;
          found = true;
          return;
        }
      });

      if(found) return;
      let p = new Product();
      p.quantity = 1;
      p.fresh = true;
      p.productBase = productBase;
      p.insertDate = new Date();

      let exDate = new Date();
      exDate.setDate(p.insertDate.getDate() + 5);
      p.expireDate = exDate;

      this.userProducts.push(p);
      console.log(this.userProducts);
  }

  saveFridge() {
      this.fridgeService.setFridgeContentOnServer("a", this.userProducts);
  }

  reciveProduct(prod : ProductBase) {
      console.log("reciveProducts");
  }

}
