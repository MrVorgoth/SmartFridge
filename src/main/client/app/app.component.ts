import {Component} from '@angular/core';

@Component({
  selector: 'app',
  template: '<app-nav></app-nav><router-outlet></router-outlet><app-footer></app-footer>',
} as Component)
export class AppComponent {
}
