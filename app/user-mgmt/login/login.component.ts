import {Component, wtfCreateScope} from '@angular/core';
import { OnInit } from '@angular/core';
import {User, UserService} from "../user.service";

@Component({
  selector: 'login',
  providers: [UserService],
  template: require('./login.component.html!text'),
  styles: [require('./login.component.css!text')]
} as Component)
export class LoginComponent implements OnInit{
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

  loginAttempt(login: String, password: String): void {
    this.userService.login( {login, password} );
  }

  searchUser(login: string): void{
    this.userService.searchUser(login).then(response => this.users = response);
  }
}
