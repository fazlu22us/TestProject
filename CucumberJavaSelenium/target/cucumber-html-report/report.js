$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/parallel/login.feature");
formatter.feature({
  "name": "feature to test login funactionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "parallel.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "parallel.LoginSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "parallel.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is nagivated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "parallel.LoginSteps.user_is_nagivated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for gift card under products",
  "keyword": "And "
});
formatter.match({
  "location": "parallel.LoginSteps.search_for_gift_card_under_products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for customer emails display validation",
  "keyword": "Then "
});
formatter.match({
  "location": "parallel.LoginSteps.user_search_for_customer_emails_display_validation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click logout from the page",
  "keyword": "And "
});
formatter.match({
  "location": "parallel.LoginSteps.click_logout_from_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/parallel/login2.feature");
formatter.feature({
  "name": "feature to test login funactionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check login is successful with valid credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "parallel.LoginSteps.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.match({
  "location": "parallel.LoginSteps.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "parallel.LoginSteps.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is nagivated to the home page",
  "keyword": "Then "
});
formatter.match({
  "location": "parallel.LoginSteps.user_is_nagivated_to_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "search for gift card under products",
  "keyword": "And "
});
formatter.match({
  "location": "parallel.LoginSteps.search_for_gift_card_under_products()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user search for customer emails display validation",
  "keyword": "Then "
});
formatter.match({
  "location": "parallel.LoginSteps.user_search_for_customer_emails_display_validation()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click logout from the page",
  "keyword": "And "
});
formatter.match({
  "location": "parallel.LoginSteps.click_logout_from_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});