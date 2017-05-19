import {NgModule} from '@angular/core';
import {RouterModule} from '@angular/router';
import {CommonModule} from '@angular/common';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule }   from '@angular/forms';
import { HttpModule }    from '@angular/http';


import {MyFrideComponent} from "./my-fridge/my-fridge.component";
import {ProductService} from "./products.service";
import {ShoppingList} from "./shopping-list/shopping-list.component";
import {SingleProduct} from "./single-product/product.component";
import {LoginComponent} from "../user-mgmt/login/login.component";
import {RegistrationComponent} from "../user-mgmt/registration/registartion.component";
import {DragulaModule} from "ng2-dragula";
import {ProductDatabaseComponent} from "./product-database/product-database.component";
import {BaseProduct} from "./single-base-product/baseProduct.component";


@NgModule({
  imports: [
    CommonModule,
    RouterModule,
    FormsModule,
    NgbModule,
    HttpModule,
    DragulaModule
  ],
  declarations: [MyFrideComponent, ShoppingList, SingleProduct, LoginComponent, RegistrationComponent, ProductDatabaseComponent, BaseProduct],
  exports: [MyFrideComponent, ShoppingList, SingleProduct, LoginComponent, RegistrationComponent, ProductDatabaseComponent, BaseProduct],
  providers: [ProductService]
} as NgModule)
export class FridgeMgmtModule {
}
