import { NgModule } from "@angular/core";
import { CallServices } from "../services/call-services";
import { CountryPhoneRoutingModule } from "./country-phone-routing.module";
import { CountryPhoneComponent } from "./country-phone/country-phone.component";

@NgModule({
    declarations: [CountryPhoneComponent],
    imports: [
        CountryPhoneRoutingModule
    ],

    providers: [CallServices],
    entryComponents: [],
    exports: []

})

export class CountryPhoneModule { }
