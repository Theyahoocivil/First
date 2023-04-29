Feature: User In Chrome Browser and Entered url

Scenario Outline: To Verify the User Login in the Website 
Given when user click a product link an Signin Alert will be Popup "<SignupEmail>" and "<SignupPassword>"
When User Clicking signin Button 
And user clicking login

Examples:
| SignupEmail | SignupPassword |
| theyahoo1210@gmail.com | Bigroundofapplause100 | 

Scenario Outline:
When Entering Text in Search Box "Mens Shirt"
And Clicking the First Product 
Then Clicking AddToCart Button
| SignupEmail | SignupPassword | Shirts |
| theyahoo1210@gmail.com | Bigroundofapplause100 | Mens Shirts | 

