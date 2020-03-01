import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ShoppingCartService } from './../service/shopping-cart.service';

@Component({
  selector: 'app-shopping-cart-det',
  templateUrl: './shopping-cart-det.component.html',
  styleUrls: ['./shopping-cart-det.component.css']
})
export class ShoppingCartDetComponent implements OnInit {
  shoppingCartResume;

  constructor(private route: ActivatedRoute,
              private shoppingCartService: ShoppingCartService) { }

  ngOnInit() {
    this.route.paramMap.subscribe(params => {
      this.shoppingCartService.getResume(params.get('cartId'))
        .subscribe(resp => {
          this.shoppingCartResume = resp;
          console.log(this.shoppingCartResume);
      });

    });
  }

}
