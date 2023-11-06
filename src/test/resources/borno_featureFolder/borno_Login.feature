Feature: This is a link functionality



@Orange
Scenario: Verify bornouser cannot signin with invalid data
Given Launch <"url"> borno
Then mouse hover to signin page
Then  Click signin link
Then Enter invalid username passward and click signin button
Then Verify bornouser cannot signin with invalid data
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 