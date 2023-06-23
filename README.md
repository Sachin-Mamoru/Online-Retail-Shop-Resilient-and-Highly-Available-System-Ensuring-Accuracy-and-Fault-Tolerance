# Online-Retail-Shop-Resilient-and-Highly-Available-System-Ensuring-Accuracy-and-Fault-Tolerance
Scenario -> The scenario involves designing a distributed system for a globally distributed online retail platform.

The scenario involves designing a distributed system for a globally distributed online retail platform with the following requirements:
The system administrator updates goods quantities upon new shipments.
Shoppers from different locations log in and add items to their shopping carts.
Multiple shoppers try to check out limited quantity items, based on a first-come-first-serve basis.
The system should handle multiple checkouts requiring the same item, preventing double assignments.

The system needs to be highly available, scalable, and accurate in processing orders. In the article, we will explore how to address these requirements effectively.

# System Design

![Picture 1](https://github.com/Sachin-Mamoru/Online-Retail-Shop-Resilient-and-Highly-Available-System-Ensuring-Accuracy-and-Fault-Tolerance/assets/59449070/a2253a03-d8b7-49bd-b1ed-c03a5315d3a8)

The system works with 3 zookeeper nodes of the bank server and 2 zookeeper nodes of the product server.
The administrator can set the product and the quantity. And the clients can set account balances using the bank server.
When a customer wanted to buy a product, he/she will pass the product code and the amount to be bought. If the requested amount is equal to or less than the stock count, then it'll check for the bank balance of that particular customer. If the bank balance is also sufficient, then the system will proceed with the payment and bank balance and the inventory will get reduced accordingly.
