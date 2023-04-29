Feature: User in HomePage of BrandAlley
Scenario Outline: User Selecting Product

Given User Entering Text in Search Box
When User Entering product name "<MensShirts>" and Click Enter 
And User Selecting the First product MilkSilkPatch by Clicking
Then User Clicking Add TO Cart Basket AddToBasket.

Examples:
| MensShirts | 
| Mens Shirts | 