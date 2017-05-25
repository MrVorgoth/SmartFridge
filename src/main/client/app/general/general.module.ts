import {NgModule} from '@angular/core';
import {AppNavComponent} from './navigation/app-nav.component';
import {RouterModule} from '@angular/router';
import {CommonModule} from '@angular/common';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import {HomePageComponent} from "./home-page/home-page.component";
import {FooterComponent} from "./footer/footer.component";

@NgModule({
  imports: [CommonModule, RouterModule, NgbModule],
  declarations: [AppNavComponent, HomePageComponent, FooterComponent],
  exports: [AppNavComponent, HomePageComponent, FooterComponent]
} as NgModule)
export class GeneralModule {
}
