Feature: Check attaching an attachment

  Background: navigate to the webpage
    Given I navigate to the webpage on which file has to be attached
  Scenario: Attach the file which is on the system

    Then upload the file from the System

Scenario: Attach a file from your project folder

  Then upload the file from the project folder