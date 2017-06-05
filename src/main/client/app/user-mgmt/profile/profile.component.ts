import {Component} from '@angular/core';
import { OnInit } from '@angular/core';
import {User, UserService, RequiedProducts} from "../user.service";
import {Cookie} from "../../general/cookies.service";

@Component({
  selector: 'profile',
  providers: [UserService],
  template: require('./profile.component.html!text'),
  styles: [require('./profile.component.css!text')]
} as Component)
export class ProfileComponent implements OnInit {
  user: User = new User();
  users: User[];
  requiedProduct: RequiedProducts = new RequiedProducts();
  requiedProducts: RequiedProducts[];

  checkIfFunctionEnded = false;

  constructor(private userService: UserService) {
  }

  ngOnInit(): void {
    this.loadUsers();
    this.loadRequiedProducts();
  }

  loadRequiedProducts(): void {
    this.userService.getAllRequiedProducts().then(response => this.requiedProducts = response);
  }

  loadUsers(): void {
    this.userService.getAllUsers().then(response => this.users = response);
  }

  myLogin(): string {
    return Cookie.get("cookie1");
  }

  myProducts(): void {
    for (var i = 0; i < this.requiedProducts.length; i++) {
      console.log("quantity: " + this.requiedProducts[i].quantity);
    }
  }

  myProfile(): number {
    // Zamiana loginu "anna" na anna (usuniecie cudzyslowow)
    var x = Cookie.get("cookie1");
    var y = x.replace(/"/g, '');
    for (var i = 0; i < this.users.length; i++) {
      if (y == this.users[i].login) {
        console.log("Dane uzytkownika:::");
        console.log("Login: " + this.users[i].login);
        console.log("Password: " + this.users[i].password);
        console.log("Name: " + this.users[i].name);
        console.log("Surname: " + this.users[i].surname);
        this.checkIfFunctionEnded = true;
        return i;
      }
    }
  }

  calculateBMI(): void {
    let height : number = parseFloat((<HTMLInputElement>document.getElementById('BMIHeight')).value);
    let weight : number = parseFloat((<HTMLInputElement>document.getElementById('BMIWeight')).value);
    let result : number = ((weight / (height*height)) * 10000).toFixed(2);

    document.getElementById('BMIResult').innerHTML = result;

    if (result < 18.5) {
      document.getElementById('BMIRange1').style.color = "orange";
      document.getElementById('BMIRange1').style.fontWeight = "bold";
      document.getElementById('BMIRange2').style.color = "black";
      document.getElementById('BMIRange2').style.fontWeight = "normal";
      document.getElementById('BMIRange3').style.color = "black";
      document.getElementById('BMIRange3').style.fontWeight = "normal";
    } else if (result >= 18.5 && result < 24.99) {
      document.getElementById('BMIRange1').style.color = "black";
      document.getElementById('BMIRange1').style.fontWeight = "normal";
      document.getElementById('BMIRange2').style.color = "green";
      document.getElementById('BMIRange2').style.fontWeight = "bold";
      document.getElementById('BMIRange3').style.color = "black";
      document.getElementById('BMIRange3').style.fontWeight = "normal";
    } else {
      document.getElementById('BMIRange1').style.color = "black";
      document.getElementById('BMIRange1').style.fontWeight = "normal";
      document.getElementById('BMIRange2').style.color = "black";
      document.getElementById('BMIRange2').style.fontWeight = "normal";
      document.getElementById('BMIRange3').style.color = "crimson";
      document.getElementById('BMIRange3').style.fontWeight = "bold";
    }
  }

  myInformationLogin(): string {
    if (this.checkIfFunctionEnded) {
      var a = this.users[this.myProfile()].login;
      return a.toString();
    }
  }

  myInformationName(): string {
    if (this.checkIfFunctionEnded) {
      var a = this.users[this.myProfile()].name;
      return a.toString();
    }
  }

  myInformationSurname(): string {
    if (this.checkIfFunctionEnded) {
      var a = this.users[this.myProfile()].surname;
      return a.toString();
    }
  }

}
