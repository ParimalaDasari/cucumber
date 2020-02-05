

Feature: pixel store pos 
  

  @tag1
  Scenario Outline: SignIn to TestmeApp
    Given user is at login page
    When user provides "<userName>" and "<password>" as credentials 
    Then login is successful 
    Examples:
    |userName | password |
    |admin  | Password456 |

   @tag2
   Scenario Outline: Adding a new category in TestMeApp
   Given admin logged in to the TestMeApp
   Then admin click on "Add Categories" option
   Then enter "<catgName>" and "<catgDesc>" 
   Then click on add
   Examples: 
   |catgName|catgDesc|
   |Sports  |sports|
    
    

   
    