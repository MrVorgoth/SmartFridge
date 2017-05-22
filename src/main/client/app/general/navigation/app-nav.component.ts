import {Component} from '@angular/core';
import {UserService} from "../../user-mgmt/user.service";
import {UserMgmtModule} from "../../user-mgmt/user-mgmt.module";

@Component({
  selector: 'app-nav',
  template: require('./app-nav.component.html!text'),
  providers: [UserMgmtModule, UserService],
  styles: [require('./app-nav.component.css!text')]
} as Component)
export class AppNavComponent {
  navCollapsed: boolean = true;

  constructor(private userService: UserService){
  }

  toggleNavigation(): void {
    this.navCollapsed = !this.navCollapsed;
  };
  whoIsThere() : string {
    //console.log(typeof (this.userService.whoIsLoggedIn));
    //console.log("Why won't it work?");
    console.log(this.userService.getwhoIsLoggedIn());
    return this.userService.getwhoIsLoggedIn();
  }
}
