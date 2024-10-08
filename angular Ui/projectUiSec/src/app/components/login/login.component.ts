import {Component, OnInit} from '@angular/core';
import {NgForm} from "@angular/forms";
import {UserService} from "../../service/user.service";
import {UserAuthService} from "../../service/user-auth.service";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.scss']
})
export class LoginComponent implements OnInit{
  constructor(
    private userService:UserService,
    private userAuthService:UserAuthService){
  }
  ngOnInit(): void {
  }
  login(loginForm:NgForm){
    console.log("form is submitted");
    console.log(loginForm.value);
    this.userService.login(loginForm.value).subscribe(
      (response) =>{
        console.log(response);
      },
      (error =>{
        console.log(error)
      })
    );
  }


}
