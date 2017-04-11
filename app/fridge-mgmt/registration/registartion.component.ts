import { Component } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {User} from "../user.service";


@Component({
  selector: 'registration',
  template: require('./registration.component.html!text')
} as Component)
export class RegistrationComponent{
  user: User = new User();

  register(): void {

  }
}
