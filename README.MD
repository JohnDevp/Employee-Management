This is an business employee management application developed under Java and Spring Framework.

**Spring Boot Dependencies:** Spring web(build web application), Spring data jpa(deal with DAO layer, it is an abstract of jpa, it internally uses hibernate as JPA provider),
Used Maven as a software project management and comprehension tool to  manage the project's build, reporting and documentation.
**Database:** MySQL Database.

**Controller:** controller layer - process all the requests sent by the client, define all the REST APIs inside Controller. It processes these requests: GET, POST, PUT, DELETE. 
**Service:** service layer - maintain business logics. Third party REST API call will be kept there as well. Building Setter and getter methods using REST API and check elements existence in the database.
**Repository Layer:**  - responsible for the database. It stores all the database logic or persistence logic(how to store data). Anything involving storing data will be found in here.


**EmployeeRepository**
A  mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects. In our case, stores the employee information.

**EmployeeService(Service Layer)**
Define all the methods in EmployeeService which is implemented in the EmployeeServiceImpl class

**EmployeeServiceImpl**
override bunch of methods such as saveEmployee, getEmployeeById, updateEmployee, and deleteEmployee

![Spring](https://user-images.githubusercontent.com/69872931/179311417-ae1ceb0e-a83f-4ea7-a84c-ef917feb5e11.PNG)

![MySQL](https://user-images.githubusercontent.com/69872931/179311445-9627f7bf-4e7b-4df9-8d5f-5f3c89570681.PNG)

![postman2](https://user-images.githubusercontent.com/69872931/179311449-b3f48d3a-6e31-4288-9bf6-221f88d23961.PNG)
