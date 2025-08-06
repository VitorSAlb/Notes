import { NgOptimizedImage } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-header',
  imports: [
    NgOptimizedImage // Optimiza e ajuda a configurar uma imagem para o angular
  ],
  templateUrl: './header.html',
  styleUrl: './header.scss'
})
export class Header {

}
