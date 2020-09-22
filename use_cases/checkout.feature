Feature: Checkout
 Scenario: Checkout a banana
    Given the price of a "banana" is 40c
    When I checkout 1 "banana"
    Then the total price should be 40c
       

    
Scenario: Two bananas scanned separately
    Given the price of a "banana" is 40c
    When I checkout 1 "banana"
      And I checkout 1 "banana"
    Then the total price should be 80c 
    
    
Scenario: A banana and Apple
    Given the price of a "banana" is 40c
       And the price of a "apple" is 25c
    When I checkout 1 "banana"
       And I checkout 1 "apple"
    Then the total price should be 65c