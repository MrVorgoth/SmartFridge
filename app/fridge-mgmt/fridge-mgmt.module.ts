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
import {LoginComponent} from "./login/login.component";
import {RegistrationComponent} from "./registration/registartion.component";
import {SandboxComponent} from "./sandbox/sandbox.component";

@NgModule({
  imports: [
    CommonModule,
    RouterModule,
    FormsModule,
    NgbModule
  ],
  declarations: [MyFrideComponent, ShoppingList, SingleProduct, LoginComponent, RegistrationComponent, SandboxComponent],
  exports: [MyFrideComponent, ShoppingList, SingleProduct, LoginComponent, RegistrationComponent, SandboxComponent],
  providers: [ProductService]
} as NgModule)
export class FridgeMgmtModule {
}
