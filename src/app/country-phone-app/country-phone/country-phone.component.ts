import { Component, OnInit } from '@angular/core';
import { CountryNames, StatusName } from 'src/app/ENUMData';
import { CustomerDto } from 'src/app/modules/customer-model';
import { CallServices } from 'src/app/services/call-services';

@Component({
  selector: 'app-country-phone',
  templateUrl: './country-phone.component.html',
  styleUrls: ['./country-phone.component.scss']
})
export class CountryPhoneComponent implements OnInit {

  customerPhones: any;
  countryNames : any;
  status :any ;
  page = 1;
  pageSize =0;
  
  constructor(private callService : CallServices) { }

  ngOnInit(): void {

    this.setAttributes();
    this.getFilterData(new CustomerDto());
  }

  getFilterData(customerDto :CustomerDto){
        this.callService.getFilterCustomersData(customerDto).subscribe((customersData: CustomerDto) => {
          this.customerPhones=customersData;
          this.page= this.customerPhones.length
        },(error: any) => {
          // handel error here
         alert({error});
        });

  }

  setAttributes(){

    this.countryNames = [];
    this.status= [];
    let countryNamesEnum = Object.values(CountryNames);
    countryNamesEnum.forEach(countryName => {
      this.countryNames.push(countryName);
    });

    let statusEnum = Object.values(StatusName);
    statusEnum.forEach(statusName => {
      isNaN(Number(statusName))? this.status.push(statusName):'';
    });

  }


  getValueFromSelect(country:string,status:string){
let customerDto :CustomerDto={
  "country": country.toUpperCase(),
  "phoneStatus": status
}
  this.getFilterData(customerDto);   
  }
}


