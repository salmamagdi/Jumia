import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { CountryPhoneComponent } from "./country-phone/country-phone.component";

const countryPhoneRoutes: Routes = [
    {
        path: 'countryPhone', component: CountryPhoneComponent
    }
];

@NgModule({
    imports: [
        RouterModule.forChild(countryPhoneRoutes)
    ],
    exports: [RouterModule]
})
export class CountryPhoneRoutingModule { }