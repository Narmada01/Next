Feature: Add item to Bag
  @bag
  Scenario: Choose item from leggings and add to bag
    Given I'm on leggings collection page
    When Click on a specific legging
    And Choose color
    And Choose size
    And Add to bag
    And Click on Basket icon on top
    And Click on Edit bag
    Then validate added items in the result page