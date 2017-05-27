import {Component, wtfCreateScope} from '@angular/core';
import { OnInit } from '@angular/core';
import {User, UserService} from "../user.service";
import {Cookie} from "../../general/cookies.service";

@Component({
  selector: 'profile',
  providers: [UserService],
  template: require('./profile.component.html!text'),
  styles: [require('./profile.component.css!text')]
} as Component)
export class ProfileComponent implements OnInit{
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

  myLogin() : string {
    //console.log(this.loadUsers());
    return Cookie.get("cookie1");
  }

  myProfile() : void {
    // Zamiana loginu "anna" na anna (usuniecie cudzyslowow)
    var x = Cookie.get("cookie1");
    var y = x.replace(/"/g, '');
    for(var i = 0; i < this.users.length; i++) {
      if(y == this.users[i].login) {
        console.log("Dame uzytkownika:::");
        console.log("Login: " + this.users[i].login);
        console.log("Password: " + this.users[i].password);
        console.log("Name: " + this.users[i].name);
        console.log("Surname: " + this.users[i].surname);
      }
    }
  }
}
