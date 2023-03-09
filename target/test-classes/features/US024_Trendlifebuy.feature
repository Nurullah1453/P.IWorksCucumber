@Project
  Feature: US024

    Background:
      Given Go to the Trendlifebuy homepage.
      Then Login button is clicked
      Then User login is done
      And Dashboard button is clicked


    Scenario:TC01 Notification must be available

      And Click on the Notification link and test that the page is accessible
      And Closes the page

      Scenario: TC02

        Then Click on the Notification link and test that the page is accessible
        And Verifies that incoming notifications are visible
        And Closes the page

        Scenario: TC03

          Then Click on the Notification link and test that the page is accessible
          And Verifies that incoming notifications are visible
          And Notifications title and date headers are verified to be present
          And Closes the page

          Scenario: TC04

            Then Click on the Notification link and test that the page is accessible
            And Verifies that incoming notifications are visible
            Then Notifications title and date headers are verified to be present
            Then Click on the Viev link
            And Confirms navigating to the page with notifications
            And Closes the page

            Scenario: TC05

              Then Click on the Notification link and test that the page is accessible
              And Verifies that incoming notifications are visible
              Then Notifications title and date headers are verified to be present
              Then Click on the Viev link
              And Confirms navigating to the page with notifications
              Then Click on the Viev link
              And Closes the page

              Scenario: TC06

                Then Click on the Notification link and test that the page is accessible
                And Verifies that incoming notifications are visible
                Then Notifications title and date headers are verified to be present
                Then Click on the Viev link
                And Confirms navigating to the page with notifications
                Then Click the Setting button
                And Confirm that the type is changeable on the Setting link
                And Closes the page
