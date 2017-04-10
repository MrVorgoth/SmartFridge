import {ModuleWithProviders} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {BookOverviewComponent} from './book-mgmt/book-overview/book-overview.component';
import {BookDetailsComponent} from './book-mgmt/book-details/book-details.component';
import {MyFrideComponent} from "./fridge-mgmt/my-fridge/my-fridge.component";
import {ShoppingList} from "./fridge-mgmt/shopping-list/shopping-list.component";

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
    redirectTo: '/book-mgmt/books',
    pathMatch: 'full'
  },
  {
    path: 'myFridge',
    component: MyFrideComponent
  },
  {
    path: 'shoppingList',
    component: ShoppingList
  }
] as Routes;

export const routing: ModuleWithProviders = RouterModule.forRoot(appRoutes);
