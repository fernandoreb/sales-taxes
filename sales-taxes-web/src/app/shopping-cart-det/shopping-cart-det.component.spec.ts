import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShoppingCartDetComponent } from './shopping-cart-det.component';

describe('ShoppingCartDetComponent', () => {
  let component: ShoppingCartDetComponent;
  let fixture: ComponentFixture<ShoppingCartDetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShoppingCartDetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShoppingCartDetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
