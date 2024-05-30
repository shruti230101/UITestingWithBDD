Feature: Validating multiple webelements on different websites
  Scenario: Search product on amazon and filter products
    Given I am on the amazon website
    When I search for "headphones"
    And I click on the Brands dropdown and on filter checkbox of "Sony" brand
    Then I verify the "Results" text
    And I switch to a new tab

  Scenario: Validate the dynamic content on the page
    Given I am on the heroku website
    Then I validate the dynamic content
    And switch to new second tab

  Scenario: Extract the text from all the links
    Given I am on the webshop website
    Then I extract all the links text
    And I switch to a new third tab

  Scenario: Filter the products based on price
    Given I am on the saucelabs website
    When I login to the website using username as "standard_user" and password as "secret_sauce"
    Then I filter the products on the basis of price $20 and add to cart
    And I switch to a new fourth tab

  Scenario: Handle different alerts on a page
    Given I am on the heroku alerts website
    Then I click on simple alert button to accept alert
    And I click on next alert button to dismiss alert
    And I click on prompt alert button to pass some message
    And I switch to a new fifth tab

  Scenario: Handling authentication popups for websites
    Given I launch the authentication website by passing username and password
    And I verify that the alert is handled and login is successful
    And I switch to a new sixth tab

  Scenario: Performing mouse right click option
    Given I am on the github website
    Then I perform right click action on a button
    And I switch to a new seventh tab

  Scenario: Perform mouse hover actions
    Given I am on opencart website
    Then I hover over the elements and perform click operation
    And I switch to a new eighth tab

  Scenario: Perform drag and drop action
    Given I am on the goodies website
    Then I drag and drop element
    And I switch to a new ninth tab

  Scenario: Perform drag and drop action on images
    Given I am on the globalsqa website
    Then I switch to frame and drag and drop images
    And I switch to a new tenth tab

  Scenario: Switching between windows
    Given I am on the google website
    When I make search for "Selenium"
    Then I open the search result in new window
    And switch back to the previous window
    And I switch to a new eleventh tab
