import {NgModule} from '@angular/core';
import {AppNavComponent} from './navigation/app-nav.component';
import {RouterModule} from '@angular/router';
import {CommonModule} from '@angular/common';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {HomePageComponent} from "./home-page/home-page.component";

@NgModule({
  imports: [CommonModule, RouterModule, NgbModule],
  declarations: [AppNavComponent, HomePageComponent],
  exports: [AppNavComponent, HomePageComponent]
} as NgModule)
export class GeneralModule {
}
