import { CommonModule } from '@angular/common';
import { Component, Input, Output, EventEmitter } from '@angular/core';

type BtnVariants = "primary" | "secondary" // Pesquisar oq é type

@Component({
  selector: 'app-btn-primary',
  imports: [
    CommonModule
  ],
  templateUrl: './btn-primary.html',
  styleUrl: './btn-primary.scss'
})
export class BtnPrimary {
  @Input("btn-text") btnText: string = ""; // Como funciona essa questão dos @inputs e @outputs do angular/core
  @Input() disabled: boolean = false;
  @Input() loading: boolean = false;
  @Input() variant: BtnVariants = "primary";

  @Output("btnSubmit") onSubmit = new EventEmitter; // Pesquisar mais afundo como funciona esse EventEmitter

  submit() {
    this.onSubmit.emit();
  }

}
