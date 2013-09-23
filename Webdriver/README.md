Bug with either Thucydides or Webdriver
============================

This is a project I made to make it easier to reproduce a bug that I am experiencing
when using the Thucydides framework.  I am having trouble figuring out if this bug is in Thucydides itself or in the Selenium Webdriver being referenced.  I created the following postings to try and determine the cause of this bug:

Stackoverflow: http://stackoverflow.com/questions/18838882/element-not-being-added-when-running-test-through-webdriver

Selenium Webdriver: https://code.google.com/p/selenium/issues/detail?id=6287&thanks=6287&ts=1379519170

This project was created using the Thucydides 0.9.205 project and the Thucydides Maven archetype.  The 0.9.205 version of Thucydides references Selenium 2.35.0.  I was able to reproduce this on both OSX and Windows 7.  I ran the project using a JUnit test configuration in Eclipse Kepler.