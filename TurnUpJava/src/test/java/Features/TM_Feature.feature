Feature:
  As an admin user
  I would like to create, edit and delete time and material records
  So I can manage time and material page

  Scenario Outline:
    Given I log into TurnUp portal
    When I navigate to time and material page
    When I create a new material record with "<code>", "<description>" and "<price>"
    Then I should be able to see a new material record created with "<code>", "<description>" and "<price>"

    Examples:
    |code |description |price|
    |Code1|Description1|$1.00|
    |Code2|Description2|$2.00|
    |Code3|Description3|$3.00|