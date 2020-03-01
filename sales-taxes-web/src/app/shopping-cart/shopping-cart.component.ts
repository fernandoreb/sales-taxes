import { ShoppingCartService } from './../service/shopping-cart.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: ['./shopping-cart.component.css']
})
export class ShoppingCartComponent implements OnInit {
  shoppingCarts;

  constructor(private shoppingCartService: ShoppingCartService) { }

  ngOnInit() {

    this.shoppingCartService.getAll()
    .subscribe(resp => {
      this.shoppingCarts = resp;
    });

  }

}
