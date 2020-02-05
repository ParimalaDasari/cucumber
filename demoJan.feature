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
  |john|Ravi1234 |
  
  
  @data-driven
Scenario: Search the product
When Larry searches for product in the search field
|Head|
|Hand|
|Lap|
Then searches for the  availability

@CaseStudyTest
  Scenario: The one where the user moves to the cart without adding any item in it
    Given User proceeds to payment without adding any item in the cart
    Then TestMeApp doesnot display the cart icon
    When User proceeds to payment with adding any item to the cart
    Then TestMeApp displays cart icon

  