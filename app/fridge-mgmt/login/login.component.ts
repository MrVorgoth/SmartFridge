import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {User} from "../user.service";


@Component({
  selector: 'login',
  template: require('./login.component.html!text'),
  styles: [require('./login.component.css!text')]
} as Component)
export class LoginComponent{
  user: User = new User();

  lgin(): void {

  }
}
