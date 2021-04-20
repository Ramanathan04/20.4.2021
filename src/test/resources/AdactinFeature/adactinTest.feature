Feature: validate the adactin hotel booking

  Scenario Outline: validate login with valid credentials
    Given enter "<username>" and "<password>"
    When select location "<location>"select Hotel"<Hotel>" RoomType "<RoomType>"Number Of Rooms"<NoOfRooms>"checkin Date"<CheckInDate>"checkOut Date"<CheckOutDate>" AdeltsPerRoom"<adultsPerRoom>" ChildrensPerRoom"<childrensPerRoom>"click search button
    When click radio button click Continue
    And Fill First Name"<fName>" Fill Second Name"<sName>"Fill Address "<address>"CreditCard Number"<cNo>"CreditCardType"<cType>"Expiry DateMonth"<expMonth>" and Expiry DateYear"<expYear>"cvv Number"<cvNum>"Click BookNow get orderId
    
    
    

    Examples: 
      | username    | password | location | Hotel       | RoomType | NoOfRooms| CheckInDate|CheckOutDate| adultsPerRoom |childrensPerRoom  |fName|sName|address|cNo             |cType|expMonth|expYear|cvNum|
      | RamAdithyan | 3XCL2X   | Sydney   | Hotel Hervey| Double   | 2 - Two  |  20/04/2021|21/04/2021	|  2 - Two      |1 - One           |Ram  |Adi  |xxx    |1234567890123456|VISA |January |2022   |006  |
      
			