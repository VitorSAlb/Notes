import { Component } from '@angular/core';
import { Login } from "./login/login";
import { SingUp } from "./sing-up/sing-up";

@Component({
  selector: 'app-root',
  imports: [Login, SingUp],
  templateUrl: './app.html',
  styleUrl: './app.css'
})
export class App {

}
