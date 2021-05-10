import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CountryPhoneComponent } from './country-phone-app/country-phone/country-phone.component';

const routes: Routes = [
  {
    path: 'countryPhone', component: CountryPhoneComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
