@Project02

    Feature: US025

      Background:
        Given Go to the Trendlifebuy homepage.
        Then User login is done

        Scenario: TC01
        Given Check that the LOGOUT link is visible
          And Closes the page

          Scenario: TC02
            Given Check that the LOGOUT link is visible
            Then Click on the LOGOUT link
            And Successfully logged out of account
            And Closes the page

            Scenario: TC03
              Given Check that the LOGOUT link is visible
              Then Click on the LOGOUT link
              Then Successfully logged out of account
              And User login is done
              Then Dashboard button is clicked
              And There must be a logout link in the list
              And Closes the page

              Scenario: TC04
                Given Check that the LOGOUT link is visible
                Then Click on the LOGOUT link
                Then Successfully logged out of account
                And User login is done
                Then Dashboard button is clicked
                And There must be a logout link in the list
                And Logs out by pressing the logout link in the list
                And Closes the page

