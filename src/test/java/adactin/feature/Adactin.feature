Feature: Login functionality for adactin application

  Scenario: User enter valid username and valid password
    Given User launch url of adactin application
    When User enter "Rkrishna" as username
    And User enter "Qwerty" as password
    And User click login button
    Then User validate valid username and valid password

  Scenario: User search location, hotels, date and roomtype for booking
    Given User click and select location as "Paris"
    When User click and select hotels as "Hotel Sunshine"
    And User click and select roomtype as "Deluxe"
    And User click and select number of rooms for "2"
    And User enters valid check in date as "21/05/2021"
    And User enters valid check out date as "24/05/2021"
    And User click and select adults per room as "1"
    And User click and select children per room "0"
    And User click search button
    Then User validate given details

  Scenario: User click and select the hotel searched to continue the process
    Given User click ans select the hotel details
    When User click continue button

  Scenario: User enters personal details and payment details
    Given User enter "Krishnakumar" as firstname
    When User "Ramachandran" as lastname
    And User enter "125 garten strasse" as billing address
    And User enter "4265 8719 7037 2947" as credit card number
    And User click and select "VISA" as credit card type
    And User click and select "September" as expiry month
    And User click and select "2021" as expiry year
    And User enter "487" as cvv number
    And User click book now button
    Then User validate given details
