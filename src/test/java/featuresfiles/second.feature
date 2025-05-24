Feature: To add product to cart 
@placeorder
Scenario Outline: Search experince for product add to cart and checkout it
Given User in on 	Greencart Landing Page
When User search with short name <list of items> and extract actual name of product
And User select Quantity of product as 3
And user select the checkout 
 Then User validate product <list of items> and quantity in checkout
And validate the buttons apply and place order

Examples:
|list of items|
|TOM|
|cau|