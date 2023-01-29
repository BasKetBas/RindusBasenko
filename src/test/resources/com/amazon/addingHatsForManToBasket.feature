Feature: An example

  Scenario: Successful adding hats for man to basket
    Given main page is open
    When filling search field "hats for men"
    And  press search button
    Then result page will open

    When chose first hat
    And increased the number of hats to two
    And press add to basket button
    Then added two hats
    And  notification page is open

    When reduce the number of hats to one
    Then price is correctly change

