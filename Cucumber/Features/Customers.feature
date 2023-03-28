Feature: Customers

Scenario: Add a new Customer
	Given User Launch chrome browser
	When User open URL "http://admin-demo.nopcommerce.com/login"
	And User enter email as "admin@yourstore.com" and password as "admin"
	And Click on login
	Then User van view the dashboard
	When User click on customers menu
	And Click on customers menu item
	And Click on add new button
	Then user can view  add new customers page
	When user enter the customer info
	And click on save button
	Then user can view confirmation message " The new customer has been added successfully."
	And close browser
 

