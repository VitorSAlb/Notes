import { Component, signal } from '@angular/core';
import { BtnPrimary } from "../btn-primary/btn-primary";
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { NewsletterService } from '../../services/newsletterService';

@Component({
  selector: 'app-newsletter-form',
  imports: [
    BtnPrimary,
    ReactiveFormsModule
  ],
  providers: [
    NewsletterService
  ],
  templateUrl: './newsletter-form.html',
  styleUrl: './newsletter-form.scss'
})
export class NewsletterForm {
  newsletterForm!: FormGroup;
  loading = signal(false);

  constructor(private service: NewsletterService) {
    this.newsletterForm = new FormGroup({
      name: new FormControl('', [Validators.required]),
      email: new FormControl('', [Validators.required, Validators.email]),
    });
  }

  onSubmit() {
    console.log(this.newsletterForm.value);

    this.loading.set(true);

    if(this.newsletterForm.valid) {
      this.service.getData().subscribe((response) => {
        console.log('Resposta da API: ', response)
        this.newsletterForm.reset();
      });
    }
  }
}
