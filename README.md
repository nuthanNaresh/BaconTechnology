# Cucumber Automation Framework setup for SmartFocus Site

Developed Automation Framework Using Maven Project

  - Cucumber Reports
  - Test Execution Recording
  - Failed Test Case Screenshots

### Location where you can find Reports, Recordings and Screenshots
- /smartfocus_AutomationTest/src/test/java/testsRecordings :
   Which has two files right now 
1.Failed case  2.Passed case
- /smartfocus_AutomationTest/src/test/resources/screenshots
- /smartfocus_AutomationTest/target/cucumber/index.html--->Open with webbrowser
- /smartfocus_AutomationTest/target/cucumber-html-reports/feature-overview.html--->Open with webbrowser
- /smartfocus_AutomationTest/target/cucumber-html-reports/test-resources-testcasescreateNewLocation.feature.html--->Open with webbrowser



### Version
JDK - 1.7
Maven-3.0.5

### Tech

I have used below technologies and editors:

* [EclipseIDE] - awesome for developing automation framework!
* [Maven Project] - for organising framework structure.
* [Cucumber-JVM] - its a tool that executes plain text functional descriptions as automated tests.
* [Cucumber-JUnit] - to run the tests
* [Slenium Webdriver] - it automates browsers. That's it!
* [Recording Jars] - used recording jar file to record test case execution.
* [JDK] - To develop and run the tests.

### Installation and Execution

You have to  clone the Maven project in to your Local Machine:
- First Method through Command Prompt:
```sh
$ git clone [git-repo-url]
$ cd smartfocus_AutomationTest
$ mvn clean install
```
- Second Method through Eclipse IDE :
```sh
Right Click pom.xml and run as -->maven install
```
**Note:** Your system has to setup environment variables for JDK and Maven

### Plugins

Cucumber Framework is currently extended with the following plugins/Jar files

* Cucumber pluging
* Cucumber Reports
* Test Execution Recording

Readmes, how to use them in your own application can be found here:

* [plugins/cucumber/README.md](http://cucumber.github.com/cucumber-eclipse/update-site)
* [plugins/CucumberReports/README.md](https://github.com/masterthought/cucumber-reporting)
* [Jar/testExecutionRecorder/README.md](http://automationtestingutilities.blogspot.co.uk/p/selenium-test.html)


### Development

Developed and Setup Which Includes Reports, Testcase recordings and Screenshots

Open your favorite Terminal and run these commands.

Navigate to pom.xml file and run below command
```sh
mvn clean install
```

### Todo's

 - Write Tests in Gherken language




