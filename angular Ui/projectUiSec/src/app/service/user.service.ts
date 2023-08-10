import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class UserService {
  BASE_URL = "http//localhost:8080";

  constructor(private httpClient:HttpClient) { }

  public login(loginData:any){
    return this.httpClient.post(this.BASE_URL+"/authentication",loginData)
  }
}
