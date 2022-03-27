Feature: Hotel_Booking Adactin Application
Scenario: Login_Functionality
Given user Launch The Adactin Application
When user Enters The Username In the InputBox
And user Enters The Password In The InputBox
Then user Clicks The Login Button And The Page Gets Navigated To Search_Hotel Page

Scenario: Search_Hotel Functionality
When user Selects The Location From The Dropdown
And user Selects The Hotels From The Dropdown
And user Selects The Roomtype From The Dropdown
And user Selects The Roomnos From The Dropdown
And user Selects The Adultroom From The Dropdown
And user Selects The Childroom From The Dropdown
Then user Clicks The Submit Button And The Page Gets Navigated To Select_Hotel Page

Scenario: Select_Hotel Functionality
Then user Clicks The Radio Button To Select The Hotel
Then user Clicks The Continue Button And The Page Gets Navigated To Book_Now Page

Scenario: Book_Now Functionality
When user Enters The Firstname In The Inputbox
And user Enters The Lastname In The Inputbox
And user Enters The Address In The Inputbox
And user Enters The CreditCardnumber In The Inputbox
And user Selects The CreditCardtype From The Dropdown
And user Selects The ExpiryMonth Of The CreditCard From The Dropdown
And user Selects The ExpiryYear Of The CreditCard From The Dropdown
And user Enters The CVV Of The CreditCard In The Inputbox
Then user Clicks The Booknow Button And The Page Gets Navigated To Myiternary_Page

Scenario: Myiternary_Functionality
Then user Clicks The Myiternary Button

Scenario: Logout_Functionality
Then user Clicks The Logout Button And Displays The Loggedout Successfully





