import {Routes, RouterModule} from '@angular/router';
import {AddContactComponent} from "./add-contact/add-contact.component";
import {AllContactComponent} from "./all-contact/all-contact.component";

const MAIN_MENU_ROUTES: Routes = [
  {path: '', redirectTo: '/login', pathMatch: 'full'},
  {path: 'addContact', component: AddContactComponent},
  {path: 'allContact', component: AllContactComponent}
];
export const CONST_ROUTING = RouterModule.forRoot(MAIN_MENU_ROUTES);
