$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/AdactinFeature/adactinTest.feature");
formatter.feature({
  "name": "validate the adactin hotel booking",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "validate login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "select location \"\u003clocation\u003e\"select Hotel\"\u003cHotel\u003e\" RoomType \"\u003cRoomType\u003e\"Number Of Rooms\"\u003cNoOfRooms\u003e\"checkin Date\"\u003cCheckInDate\u003e\"checkOut Date\"\u003cCheckOutDate\u003e\" AdeltsPerRoom\"\u003cadultsPerRoom\u003e\" ChildrensPerRoom\"\u003cchildrensPerRoom\u003e\"click search button",
  "keyword": "When "
});
formatter.step({
  "name": "click radio button click Continue",
  "keyword": "When "
});
formatter.step({
  "name": "Fill First Name\"\u003cfName\u003e\" Fill Second Name\"\u003csName\u003e\"Fill Address \"\u003caddress\u003e\"CreditCard Number\"\u003ccNo\u003e\"CreditCardType\"\u003ccType\u003e\"Expiry DateMonth\"\u003cexpMonth\u003e\" and Expiry DateYear\"\u003cexpYear\u003e\"cvv Number\"\u003ccvNum\u003e\"Click BookNow get orderId",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "Hotel",
        "RoomType",
        "NoOfRooms",
        "CheckInDate",
        "CheckOutDate",
        "adultsPerRoom",
        "childrensPerRoom",
        "fName",
        "sName",
        "address",
        "cNo",
        "cType",
        "expMonth",
        "expYear",
        "cvNum"
      ]
    },
    {
      "cells": [
        "RamAdithyan",
        "3XCL2X",
        "Sydney",
        "Hotel Hervey",
        "Double",
        "2 - Two",
        "20/04/2021",
        "21/04/2021",
        "2 - Two",
        "1 - One",
        "Ram",
        "Adi",
        "xxx",
        "1234567890123456",
        "VISA",
        "January",
        "2022",
        "006"
      ]
    }
  ]
});
formatter.scenario({
  "name": "validate login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "enter \"RamAdithyan\" and \"3XCL2X\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.enter_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select location \"Sydney\"select Hotel\"Hotel Hervey\" RoomType \"Double\"Number Of Rooms\"2 - Two\"checkin Date\"20/04/2021\"checkOut Date\"21/04/2021\" AdeltsPerRoom\"2 - Two\" ChildrensPerRoom\"1 - One\"click search button",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.select_location_select_Hotel_RoomType_Number_Of_Rooms_checkin_Date_checkOut_Date_AdeltsPerRoom_ChildrensPerRoom_click_search_button(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click radio button click Continue",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.click_radio_button_click_Continue()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Fill First Name\"Ram\" Fill Second Name\"Adi\"Fill Address \"xxx\"CreditCard Number\"1234567890123456\"CreditCardType\"VISA\"Expiry DateMonth\"January\" and Expiry DateYear\"2022\"cvv Number\"006\"Click BookNow get orderId",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.fill_First_Name_Fill_Second_Name_Fill_Address_CreditCard_Number_CreditCardType_Expiry_DateMonth_and_Expiry_DateYear_cvv_Number_Click_BookNow_get_orderId(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
});