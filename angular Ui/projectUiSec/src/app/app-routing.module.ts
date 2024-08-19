import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CarComponent} from "./components/car/car.component";
import {HomeComponent} from "./components/home/home.component";
import {AdminComponent} from "./components/admin/admin.component";
import {UserComponent} from "./components/user/user.component";
import {LoginComponent} from "./components/login/login.component";
import {ForbiddenComponent} from "./components/forbidden/forbidden.component";
import {SignupComponent} from "./components/signup/signup.component";

const routes: Routes = [
  {path: '',component:SignupComponent},
  {path: 'cars',component:CarComponent},
  {path: 'home',component:HomeComponent},
  {path: 'admin',component:AdminComponent},
  {path: 'user',component:UserComponent},
  {path: 'login',component:LoginComponent},
  {path: 'forbidden',component:ForbiddenComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
