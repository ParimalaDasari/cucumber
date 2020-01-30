Feature: Pixel store pos
Background:
  Given sales executive logged into the machine
@RegressionTest
Scenario: Executive signup
   Given executive is at the signup registration
   When executive provides "admin" and "admin"
   Then signup successful          
 @Smoke @RegressionTest          
 Scenario: shopping cart
 Given executive added the items to cart
 When items price is calculated
 Then bill is generated with final amount  
 
                   
  @FunctionalTest
Scenario Outline: Sales executive signIn
When sales executive provides "<user>" and "<password>" as credentials
Then Login is successful


Examples:
  |user|password|
  |Lalitha|password123|
  |john|Ravi123|
  
  
  @data-driven
Scenario: Search the product
When Larry searches for product in the search field
|Head|
|Hand|
|Lap|
Then searches for the  availability
  