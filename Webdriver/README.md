Bug with either Thucydides or Webdriver
============================

This is a project I made to make it easier to reproduce a bug that I am experiencing
when using the Thucydides framework.  I am having trouble figuring out if this bug is in Thucydides itself or in the Selenium Webdriver being referenced.  I created the following postings to try and determine the cause of this bug:

Stackoverflow: http://stackoverflow.com/questions/18838882/element-not-being-added-when-running-test-through-webdriver

Selenium Webdriver: https://code.google.com/p/selenium/issues/detail?id=6287&thanks=6287&ts=1379519170

This project was created using the Thucydides 0.9.205 project and the Thucydides Maven archetype.  The 0.9.205 version of Thucydides references Selenium 2.35.0.  I was able to reproduce this on both OSX and Windows 7.  I ran the project using a JUnit test configuration in Eclipse Kepler.

To reproduce: 

* 1. Go to this url in your own browser: http://fiddle.jshell.net/C3VB5/11/show/
* 2. Run this test (it will fail)
* 3. Put a breakpoint in this method
* 4. Run the project in debug mode as a JUnit test, allowing it to hit this break point
* 5. Hit the button yourself and notice that no green text shows up
* 6. When the browser shows up, hit refresh
* 7. Hit play on the debugger
* 8. The test now passes
* 
* If you use the firefox debugger to investigate this issue, add a javascript break
* point on the method being fired in the onclick event of the button.  Inside that method,
* the "$()" function is called to find an html element to append text to.  If you run 
* through the steps again, you will notice that the '$()' function defined on the page
* is not being called.  Instead a method is being called which the firefox javascript 
* debugger cannot step into.  This method does not have the same behavior and makes
* the test behave differently when running through Thucydides than if the test were ran
* manually.