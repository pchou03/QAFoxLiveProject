Feature: End to End scenarios for placing orders

	@Orders @One
	Scenario: Verity wether the user is able to place Orders
		Given I login to the application
		When I add a product to bag and check
		And I place an order
		Then I should see that the order is placed successfully