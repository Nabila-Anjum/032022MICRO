Feature: Validate Amazon Search

Scenario Outline: Validate Amazon Search

Given user visit Amazon homepage
When user type "<productname>" product name and click search icon
Then user should be able to see the expected product

Examples: 
 |productname|
 | iphone 12 promax |