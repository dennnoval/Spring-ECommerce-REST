# Spring-ECommerce-REST
 Spring based project of E-Commerce REST app

![E-Commerce-Project-Diagrams-Use-Case](https://user-images.githubusercontent.com/19941953/175799960-90ad8a09-de77-4362-9ca0-bbcf68d3dca2.png)

![E-Commerce-Project-Diagrams-ERD](https://user-images.githubusercontent.com/19941953/175799966-9d46e90d-2973-4445-a5cf-6beda454b81d.png)

API Prefix : /api/v1

List of endpoints :
+ [GET] /orders -> To view order history
+ [GET] /products -> To view product list
+ [POST] /carts -> To add a product to cart
+ [DELETE] /cartitems/{id}?{cart_id} -> To remove a product from cart
+ [POST] /orders -> To make an order
+ [PATCH] /orders/{id} -> To cancel an order
+ [PATCH] /customer/edit -> To update customer profile
