Feature: Testing fb login functionality

  Scenario Outline: fb home page login
    Given naviagte to fb link
    And user is on fb link
    When user enters fb <uname> and <pword>
    And click login button

    Examples: 
      |uname|pword|
      |aru123|123456|
      |xyz|9045|
      
