Feature: Search functionality scenarios

  @Search @One
  Scenario: Verify wether the user is able to search forthe products
    Given I launch the application
    When I serch for a product "Samsung SyncMaster 941B"
    Then I should see the product in the search results

  @Search @Two
  Scenario: Verify wether the user is informed when the product being searched is not available
    Given I launch the application
    When I serch for a product "Apple iPhone"
    Then I should see a message informing "Your shopping cart is empty"
