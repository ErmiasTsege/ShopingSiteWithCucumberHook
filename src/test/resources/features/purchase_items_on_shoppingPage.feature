Feature: Purchase items on Shoping Site

  Scenario: User login
    Given the user is on the home page
    When the user try to sing in with email ermineger@gmail.com and password el44lb
    Then the user is signined in

  #Scenario Outline: Purchase items and verify the purchase
    #Given the user ermineger@gmail.com with the password el44lb is logged in
    #When the user adds the following items to the cart
#			| Printed Dress	|
#			| Blouse|
    #When the user checks out the items
    #Then the purchase is verified via a confirmation page
