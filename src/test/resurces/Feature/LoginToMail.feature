Feature: Login

  Scenario: Login to mail box
    Given Login page is opened
    When I set login 'oOrel@i.ua' and password 'AirJack'
    Then User account should be opened
