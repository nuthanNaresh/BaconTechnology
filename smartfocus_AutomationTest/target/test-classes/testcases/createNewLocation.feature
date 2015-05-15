Feature: 'New Location Creation'
  As a User 
  I would like to create new location in Smartfocus site
  So that I can verify new location is created succesfully

  Scenario Outline: Creating New Location In SmartFocus site
    Given User is on Smart Focus site
    And User clicks on 'New'
    When User clicks on 'Location'
    Then New location form should appear
    And User fills <Name> <Major> <Description> <Postcode> <Radius> <Catchment>
    When User clicks on Create
    Then New location should be created
    And Screen navigates to the new location

    Examples: 
      | Name                 | Major        | Description                                                      | Postcode   | Radius | Catchment |
      | "Manor Park, London" | 101          | "Manor Park is residential area in the London Borough of Newham" | "EC1A 4HD" | 6      | 10        |
    #  | "London"             | 123456789000 | "London"                                                         | "EC1A 4HD" | 6      | 10        |
