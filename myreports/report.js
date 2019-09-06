$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:pack4/pck.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user in the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "pck4.user_in_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"Headphone\" in the search field",
  "keyword": "When "
});
formatter.match({
  "location": "pck4.i_enter_in_the_search_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the find details",
  "keyword": "Then "
});
formatter.match({
  "location": "pck4.i_click_on_the_find_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the item is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "pck4.the_item_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click add to cart",
  "keyword": "Then "
});
formatter.match({
  "location": "pck4.i_click_add_to_cart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the login page is displayed",
  "keyword": "And "
});
formatter.match({
  "location": "pck4.the_login_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});