# E-Commerce Application

* Framework - springboot 3.0.2 version
* Langauge - Java


* Data Flow -


* 1). Create Models(User, Product, Order, Address)


* 2). Create Controllers(User, Product, Order, Address)


* 3). These controllers calls the service layer where all business logic written


* 4). Service layers implements the ISerivce layers where all methods are Override in service class


* 5). Create Repository(User, Product, Order, Address) just to fetch the data from database and this repository extends the JpaRepository<Model,Integer> where some methods are pre-written that helps us to write the shorter code.


* Database - H2 Database (in Memory Database)