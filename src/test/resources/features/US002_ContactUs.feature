@wip
Feature:Checking the Contact Us

  Scenario:Submitting Contact Form

    Given The user goes to the home page
    Then Verify that the contact form is displayed with the following fields
    Then Verify that the Send button is enabled
    And Enter valid data in the Name, Email, and Subject fields
    And Leave the Phone Number and Company Name fields empty
    Then Enter a message in the Message field
    Then Click on the Send button