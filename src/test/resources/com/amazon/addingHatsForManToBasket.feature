Feature: An example

  Scenario: Successful adding hats for man to basket
    Given main page is open
    When filling search field "hats for men"
    And  press search button
    Then result page will open

    When chose first hat
    And  press chosen hat
    Then on a page with describing the selected hat

    When increased the number of hats to two
    And press add to basket button
    And press process order button
    Then on login page

    When fill "+34633919463"
    And press continue button
    Then on a password page

    When fill password field "Ivanka2022"
    And press login button
    Then on a process order page

    When press amazon area
    And press back to cart button
    Then on a basket page

    When reduce the number of hats to one
    And press checkout button
    Then on a process order page
    And number of hats one








