@activity1
Feature: Basic Syntax

Scenario: test the TS home page
	Given the user is on the TS homepage
	When they click on the About Us link
	Then they are redirected to the About Us page
