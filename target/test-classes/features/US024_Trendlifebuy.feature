@Project
  Feature: US024

    Scenario:TC01 Notification must be available

    Given Go to the Trendlifebuy homepage.
    Then Login button is clicked
    Then User login is done
    And Dashboard button is clicked
    And Click on the Notification link and test that the page is accessible

      Scenario: TC02

        Given Go to the Trendlifebuy homepage.
        Then Login button is clicked
        Then User login is done
        And Dashboard button is clicked
        Then Click on the Notification link and test that the page is accessible
        And Verifies that incoming notifications are visible

        Scenario: TC03

          Given Go to the Trendlifebuy homepage.
          Then Login button is clicked
          Then User login is done
          And Dashboard button is clicked
          Then Click on the Notification link and test that the page is accessible
          And Verifies that incoming notifications are visible
          And Notifications title and date headers are verified to be present

          Scenario: TC04

            Given Go to the Trendlifebuy homepage.
            Then Login button is clicked
            Then User login is done
            And Dashboard button is clicked
            Then Click on the Notification link and test that the page is accessible
            And Verifies that incoming notifications are visible
            Then Notifications title and date headers are verified to be present
            Then Click on the Viev link
            And Confirms navigating to the page with notifications

            Scenario: TC05

              Given Go to the Trendlifebuy homepage.
              Then Login button is clicked
              Then User login is done
              And Dashboard button is clicked
              Then Click on the Notification link and test that the page is accessible
              And Verifies that incoming notifications are visible
              Then Notifications title and date headers are verified to be present
              Then Click on the Viev link
              And Confirms navigating to the page with notifications
              Then Click on the Viev link

              Scenario: TC06

                Given Go to the Trendlifebuy homepage.
                Then Login button is clicked
                Then User login is done
                And Dashboard button is clicked
                Then Click on the Notification link and test that the page is accessible
                And Verifies that incoming notifications are visible
                Then Notifications title and date headers are verified to be present
                Then Click on the Viev link
                And Confirms navigating to the page with notifications
                Then Click the Setting button
                And Confirm that the type is changeable on the Setting link