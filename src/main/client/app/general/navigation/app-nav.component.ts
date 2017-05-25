import {Component} from '@angular/core';
import {UserService} from "../../user-mgmt/user.service";
import {UserMgmtModule} from "../../user-mgmt/user-mgmt.module";
import {Cookie} from "../cookies/cookies.component";

@Component({
  selector: 'app-nav',
  template: require('./app-nav.component.html!text'),
  providers: [UserService, Cookie],
  styles: [require('./app-nav.component.css!text')]
} as Component)
export class AppNavComponent {
  navCollapsed: boolean = true;

  constructor(private userService: UserService, private cookies: Cookie){
  }

  toggleNavigation(): void {
    this.navCollapsed = !this.navCollapsed;
  };
  whoIsThere() : string {
    console.log(Cookie.checkIfExists('cookie1'));
    //console.log(typeof (this.userService.whoIsLoggedIn));
    //console.log("Why won't it work?");
    //console.log(this.userService.getwhoIsLoggedIn());
    return Cookie.get("cookie1");
  }

  checkIfEmpty() : boolean {
    if (Cookie.get("cookie1") != "") {
      return false;
    } else {
      return true;
    }
  }
}
