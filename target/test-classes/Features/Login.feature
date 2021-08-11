Feature: Facebook LoginPage

#regular expression
@regularexpression
Scenario: Entering Username and Pwd
Given Facebook homepage is displayed
When login in the application with "user" and "pwd" and click login button
Then home page is populated

#parameterizing the test runs with example keyword
@datadriven
Scenario Outline: Entering Username and Pwd
Given Facebook homepage is displayed
When login in the application with "user" and "pwd" and click login button
And home page is populated
Then validate <name> and <ji>
Examples:
|name|ji|
|sharan|12|
|dhina|12|
|jaashvi|15|

#pipleline datatables
@datadriven
Scenario: Pipeline checking
When checking pipepline datattables
| hello | 1234 | welcome | test |
#And check {int} as user1 and {float} as password


      
      
      
      
      
      
      
      
      