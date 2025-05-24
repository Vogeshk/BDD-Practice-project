Feature: Search and  place the order for products
@offerspage
Scenario Outline: Search experince for product search in both home and offers page
Given User in on 	Greencart Landing Page
When User search with short name <list of items> and extract actual name of product
Then User searched for <list of items> in offers page to check if product exists
And validate product and offerpage

Examples:
|list of items|
|TOM|
|BEET|
