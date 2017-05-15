/**
 * Created by lodwr on 15.05.2017.
 */
import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {FridgeService} from "../fridge.service";
import {Product} from "../mocks/Product";

@Component({
  selector: 'fridge-content',
  template: require('./fridge-content.component.html!text')
} as Component)
export class FridgeContentComponent implements OnInit{
  productsInFridge: Product[];

  constructor(private fridgeService: FridgeService){}

  ngOnInit(): void {
    this.loadProductsFromFridge();
  }

  loadProductsFromFridge(): void {
    this.fridgeService.getProductsFromUserFridge('fas').then(products =>
    {
      this.productsInFridge = products;
    });
  }

  logFridgeContent() : void {
    console.log(this.productsInFridge);
  }

  addToFridge(product : Product) : void {
    console.log('Event handled');
    for(let i in this.productsInFridge) {
      if(this.productsInFridge[i].name == product.name) {
        this.productsInFridge[i].quantity++;
        return;
      }
    }
    this.productsInFridge.push(JSON.parse(JSON.stringify(product)));
  }

}
