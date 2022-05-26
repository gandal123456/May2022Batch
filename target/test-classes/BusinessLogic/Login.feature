Feature: Login Functionality

Background: User successfully clicked on Initial Login window
When user open "Chrome" browser with exe "G:\\Automation Support\\chromedriver.exe"
When user open url as "https://www.flipkart.com/"
When user cancle initial Login window


@SmokeTest
Scenario: Login functionality by using valid credentials
When user navigate on Login button
When user click on MyProfile
When user enter "916831343" as username
When user enter "abcd@321" as password
When user click on Login button
Then Application shows user profile to user



                    