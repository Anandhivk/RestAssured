Feature: Program-Get Requests

  Scenario: Verifying GET request to retrieve all program data in valid URL
    Given User sets request for Program module with valid base URL
    When User sends GET request 
    Then Request should be successfull with status code "200" for GET All programs