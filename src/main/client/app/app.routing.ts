import {ModuleWithProviders} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {BookOverviewComponent} from './book-mgmt/book-overview/book-overview.component';
import {BookDetailsComponent} from './book-mgmt/book-details/book-details.component';
import {MyFrideComponent} from "./fridge-mgmt/my-fridge/my-fridge.component";
import {ShoppingList} from "./fridge-mgmt/shopping-list/shopping-list.component";
import {LoginComponent} from "./user-mgmt/login/login.component";
import {RegistrationComponent} from "./user-mgmt/registration/registartion.component";
import {ProductDatabaseComponent} from "./fridge-mgmt/product-database/product-database.component";
import {HomePageComponent} from "./general/home-page/home-page.component";
import {ProfileComponent} from "./user-mgmt/profile/profile.component";

const appRoutes: Routes = [
  {
    path: 'book-mgmt/books',
    component: BookOverviewComponent
  },
  {
    path: 'book-mgmt/book',
    component: BookDetailsComponent
  },
  {
    path: 'book-mgmt/book/:bookId',
    component: BookDetailsComponent
  },
  {
    path: '',
    redirectTo: 'homePage',
    pathMatch: 'full'
  },
  {
    path: 'myFridge',
    component: MyFrideComponent
  },
  {
    path: 'shoppingList',
    component: ShoppingList
  },
  {
    path: 'login',
    component: LoginComponent
  },
  {
    path: 'register',
    component: RegistrationComponent
  },
  {
    path: 'productDatabase',
    component: ProductDatabaseComponent
  },
  {
    path: 'homePage',
    component: HomePageComponent
  },
  {
    path: 'profile',
    component: ProfileComponent
  }
] as Routes;

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
