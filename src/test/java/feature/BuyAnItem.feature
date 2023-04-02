Feature: Buy an item

@Buy_001   @Regression
Scenario Outline: Buy an item with valid credit card info
Given The user launches the application
When The user searches an item "<items>"
#Then The user add items to cart

#hi this is testing 


Examples:
| items    |
| guitar   |
| drum     |


@Buy_002     @Regression 
Scenario Outline: Buy an item with valid credit card info
Given The user launches the application
When The user searches an item "<items>"
#Then The user add items to cart
Then The user closes the browser


Examples:
| items|
| mobile|





