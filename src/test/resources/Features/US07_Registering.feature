
Feature: In order to use the services of the website visitor should be able to register

  @US07_TC01
  Scenario: user registers via e-mail

    * user opens the app
    * user ensures that profile icon is visible on the bottom bar
    * user clicks on the profile icon
    * user clicks on signup button
    * user clicks on use email instead button
    * "Name" Email and "Password" values are entered to the related fields
    * user clicks on sign up button
    * user is directed to SignIn page

  @US07_TC02
  Scenario: users register via phone number

    * user opens the app
    * user ensures that profile icon is visible on the bottom bar
    * user clicks on the profile icon
    * user clicks on signup button
    * Name phoneNumber and Password values are entered to the related fields
    * user clicks on sign up button
    * user is directed to SignIn page