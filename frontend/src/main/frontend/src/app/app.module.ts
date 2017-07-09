import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu.component';
import { AddContactComponent } from './add-contact/add-contact.component';
import { AllContactComponent } from './all-contact/all-contact.component';
import {CONST_ROUTING} from './app.routing';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    AddContactComponent,
    AllContactComponent,
    RegistrationComponent,
    LoginComponent
  ],
  imports: [
    BrowserModule,
    CONST_ROUTING
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
