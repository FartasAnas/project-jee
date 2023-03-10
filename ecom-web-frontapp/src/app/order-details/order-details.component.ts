import { Component } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {ActivatedRoute, Router} from "@angular/router";

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent {
  orderDetails :any;
  orderId!: number;
  constructor(private http:HttpClient, private router:Router, private route:ActivatedRoute) {
    this.orderId=route.snapshot.params['orderID']
  }
  ngOnInit():void{
    this.http.get("http://host.docker.internal:8888/BILLING-SERVICE/bills/full/"+this.orderId).subscribe({
      next : (data)=>{
        this.orderDetails=data;
      },
      error:(err)=>{

      }
    })
  }

  getOrderDetails(o: any) {
    this.router.navigateByUrl("/order-dtails/"+o.id);
  }
}
