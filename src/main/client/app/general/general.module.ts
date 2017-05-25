import {NgModule} from '@angular/core';
import {AppNavComponent} from './navigation/app-nav.component';
import {RouterModule} from '@angular/router';
import {CommonModule} from '@angular/common';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {HomePageComponent} from "./home-page/home-page.component";
import {Cookie} from "./cookies/cookies.component";

@NgModule({
  imports: [CommonModule, RouterModule, NgbModule],
  declarations: [AppNavComponent, HomePageComponent, Cookie],
  exports: [AppNavComponent, HomePageComponent, Cookie]
} as NgModule)
export class GeneralModule {
}
