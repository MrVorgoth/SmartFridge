/**
 * Created by lodwr on 29.05.2017.
 */


import {Component, Input, OnInit} from "@angular/core";
import {Headers, Http, URLSearchParams} from '@angular/http';
import {Product, ProductBase} from "../Structures";
import {FridgeService} from "../fridge.service";

@Component({
  selector: 'fridge-content',
  template: require('./fridge-content.component.html!text')
} as Component)
export class FridgeContentComponent implements OnInit {
  userLogin : string; //get value from cookie service
  products : Product[];


  constructor(
    private http : Http,
    private fridgeService : FridgeService) { }

  ngOnInit(): void {
    this.userLogin = "b";
    this.getFridgeContent();
  }

  getFridgeContent() : void {
    this.fridgeService.getFridgeContentFromServer(this.userLogin).then(resp =>{ this.products = resp; console.log(resp)});
  }

  modifyQuantity(i : number, quantity : number) : void {
    this.products[i].quantity = quantity;
    if(quantity == 0)
      this.products.splice(i, 1);
  }

  sync() : void {
    this.fridgeService.setFridgeContentOnServer(this.userLogin, this.products);
  }
}
