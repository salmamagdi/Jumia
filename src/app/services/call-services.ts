import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { CustomerDto } from "../modules/customer-model";

@Injectable()
export class CallServices {
 
    constructor(public http: HttpClient) {
    }


    headers = new HttpHeaders({
        // 'access_token': this.transferState.get('access_token'),
        'Cache-Control': 'no-cache',
        // 'Authorization': this.transferState.get('authorization'),
        'Content-Type': 'application/json'
    });
    

    getFilterCustomersData(body:CustomerDto): any {
        return this.http.post("http://localhost:8085/api/getFilterCustomersData",body,{
            headers: this.headers
        });
    }
 

}
