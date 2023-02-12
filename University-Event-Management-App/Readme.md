# University-Event-Management
* Framework -> SpringBoot 3.0.2 version
* language  -> Java
* Data Flow ->
* Student & Event Management :


* Student Model Class - Data Members (studentId, firstName, lastName, Age, Department) , Parameterized Contructor , Getter & Setters , toString() Method etc. 


* Event Model Class - Data Members (eventId, Name, locationOfEvent, date, startTime, endTime) , Parameterized Contructor , Getter & Setters , toString() Method etc.


* Controller - We have different RESTAPI's endpoints created here shown below :
* Endpoints : 
* AddStudent - http://localhost:8080/api/vi/university-Event-app/add-student
* get all Student - http://localhost:8080/api/vi/university-Event-app/find-all
* get Students By Id- http://localhost:8080/api/vi/university-Event-app/find-student/studentId/2
* update Student - http://localhost:8080/api/vi/university-Event-app/update-student/studentId/4
* delete Student - http://localhost:8080/api/vi/university-Event-app/delete-student/studentId/5


* Add Event - http://localhost:8080/api/vi/university-Event-app/add-event
* get All Events - http://localhost:8080/api/vi/university-Event-app/find-allEvent
* get Events By date - http://localhost:8080/api/vi/university-Event-app/find-event/date/2021-01-21
* update Event - http://localhost:8080/api/vi/university-Event-app/update-event/eventId/1
* delete Event - http://localhost:8080/api/vi/university-Event-app/delete-event/eventId/1


* DataBase - we are storing the data in the ArrayList Because we are adding data Manually in List so that is just for practice not ready for Production but when i'm creating for Production purpose then definitely im Using database and You haven't mentioned to us like which database we have to add so im taking ArrayList.


* DataStructure :- ArrayList ( to store data )


* Project Summary -
* We are Creating Student Class and Event Class which represents the Data Model for University Management Application .
* and Creating the UniversityService Class which holds the data and handles the all CRUD operations and thats the layer where we write our Business logic
* and Creating the UniversityController class which helps to expose/create the RESTAPI's endpoints to get or perform all CRUD (create , read, update, delete) operations. 
* The data is stored in ArrayList using static Block because you haven't mentioned which database i used
