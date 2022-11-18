Feature: SignIn
  @SignIn
  Scenario: Using valid email and password user can log in


    Given  I am at the walgreens homepage to signIn
    And I click on Account to SignIn
    And I click on Sign In button from the homepage
    And I enter valid Email Address for SignIN
    And I enter valid Password for SignIN
    When I click on SignIn button
    Then I should be able to successfully login

    