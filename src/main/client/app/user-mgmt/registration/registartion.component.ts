import { Component, Input } from '@angular/core';
import { OnInit } from '@angular/core';
import { Router } from '@angular/router'
import {User, UserService} from "../user.service";

@Component({
  selector: 'registration',
  providers: [UserService],
  template: require('./registration.component.html!text'),
  styles: [require('./registration.component.css!text')]
} as Component)
export class RegistrationComponent implements OnInit{
  user: User = new User();
  users: User[];

  constructor(private userService: UserService){
  }

  ngOnInit(): void {
    this.loadUsers();
  }

  loadUsers(): void {
    this.userService.getAllUsers().then(response => this.users = response);
  }

  saveUser(): void {
    this.userService.createUser(this.user).then(response => {
      console.log(response);
      if(response != null) {
        this.users.push(response);
      }
    });
  }

}
