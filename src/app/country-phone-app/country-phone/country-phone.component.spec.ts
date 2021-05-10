import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CountryPhoneComponent } from './country-phone.component';

describe('CountryPhoneComponent', () => {
  let component: CountryPhoneComponent;
  let fixture: ComponentFixture<CountryPhoneComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CountryPhoneComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CountryPhoneComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
