Feature: Login
Scenario: Successful login with vald credentials
Given User Launch chrome browser
When User open URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
And User enter email as "admin@yourstore.com" and password as "admin"
And Click on login
Then Page title should be "Dashboard / nopCommerce administration"
When User click on logout link
Then Page title should be "Your store. Login"
And close browser

Scenario Outline: Login Data Driven
Given User Launch chrome browser
When User open URL "http://admin-demo.nopcommerce.com/login"
And User enter email as "<email>" and password as "<password>"
And Click on login
Then Page title should be "Dashboard / nopCommerce administration"
When User click on logout link
Then Page title should be "Your store. Login"
And close browser

Examples:
   |  email    |   password  |
   |admin@yourstore.com | admin |
   | admin@yourstore.com | admin123|