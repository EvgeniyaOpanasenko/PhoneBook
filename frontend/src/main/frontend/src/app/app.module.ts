import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { MenuComponent } from './menu.component';
import { AddContactComponent } from './add-contact/add-contact.component';
import { AllContactComponent } from './all-contact/all-contact.component';
import {CONST_ROUTING} from './app.routing';

@NgModule({
  declarations: [
    AppComponent,
    MenuComponent,
    AddContactComponent,
    AllContactComponent
  ],
  imports: [
    BrowserModule,
    CONST_ROUTING
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
