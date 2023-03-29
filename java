JAVA

oops

high level

write once run everywhere

JDK-developers

JRE-its the environments

JVM-interpreter

JIT-just in time used for improve perfromance

Robust-exception

Automatic memory management-garbage value

Multi threading-ex:multiple tabs in chrome

Networking

SC->jdk(compiler)->bytecode.class->JRE(jvm(jit))->MC->o/p

CLASS

Encapsulation-bind data and method

Identifiers-used for class,method,variable name as valid name or not

variable must be small letters

variable name is identifier Identifiers are the name given to variables, classes, methods, etc.

final variable are caps

A variable is a location in memory (storage area) to hold data.

To indicate the storage area, each variable should be given a unique name

The value of a variable can be changed in the program, hence the name variable

Literals are data used for representing fixed values. They can be used directly in the code.
        For example,int a = 1;float b = 2.5;char c = 'F';Here, 1, 2.5, and 'F' are literals.

method syntax - public void add(){..}

use camelspace while writing multiple words

why we create a object same name as class is there was a possibity of n number of object

Literals assign a value for the variables

Data types(byte-int-short-long)integers(float-double)floating point-boolean

vatiable are used to hold the data of the address of the value

Automatic type conversion-widening conversion it store the lower value to higher

type casting it is explict type conversion it not the good way to convert-narrowing conversion

Type promotion rules we cannot store lower date type into higher

Arithmetic operators +,-,/,*,%,%-used for getting the reminder of the value

Scanner is the user define class

relational operator

ternary operator-?
        ATM example syntax expression?expression2:expression3;->c=5>4?5:4(same data type must be used because of storing the variable to the output)

OPERATOR Precedence-order of how the operators are working highest to lowest

Selection statements - if, switch case

IF-if else(if there was an multiple statements in the if or else part use->{} if there was an single statement we don't want{})

NESTED IF - we can use multiple if statements in the nested if syntax->if-else if-else. if we write if and if and if it check the all if, if we want another choice we give elseif part for the particular if and finally give the else

Switch statement we don't always use the break statement if we have the condition of don't use the break we skip the break-exmaple flipcart after press buy button they show some additional product of the similar buying item final of the switch is default it shows the messages as default messages

Modelization is a cluster of the project ATM example method writing and call that method when it is needed like what the atm user want deposite or something. using object and calling the method. Method have a body for it function and we write a function is use for jvm because we write all the method at the one the jvm read it all if we write a method the called method is only read by jvm
Iteration Statements - for,while,do-while.

WHILE-while(condition){body of loop}

DO-WHILE-do{body of loop}while(condition)

FOR-for(initialization;condition;iteration){body of loop}

----------------11/03/23------------------------------

Java is an object-oriented programming language. The core concept of the object-oriented approach is to break complex problems into smaller objects.

ARRAYS-it is a collection of an object of same datatype we can store multiple data in the same varibale it is fixed memory it is stored as a index based syntax int a[]={1,2,3}; it is stored based on the index and it give best perfromance

exception is a one type of a class example arrayindexoutofbounds once exception is throws it stop the execution example bank balance is empty and it throws the execption and stop the process if we dont handel the execption

getting input from user 1.comment line arguments using run config we give arguments (String[] args)->is a command line arguments and we give the input to the console

int a[]=new int[4]->we give the memory of the array here if we call the not assigned value to the index it shows output as 0 because of the memory is already allocated

multidimensional arrays int arr[][]=new int[2][3]; print is used to print the output on the same line and println is used for print the statement to the next line for(i=0;i<2;i++){for(j=0;j<3;j++){print}}

Constructoroverloading there was an multiple constructor created in the same class there was an two type of constructor 1.default constructor and 2.parameterized constructor in this constructor we pass the value in the parameter of the class we created in the arguments and default constructor we can create or we leave it to the jvm but if we create the parameterized constructor we must create the default constructor

Methodoverloading in this overloading we can create multiple method of the same name but we give the parameter value different value of the data type

Garbage collection it is used to deallocate the unused object

Finalize() object it is used to print the final messages of the deallocate the object from the memory ATM example before logout it shows the messages oof remove the card

Using static variable we doesn't need to create a object to call the method or value we just write the class name direclty ex:Student.collegeName="msajce" this for data for method Student.display(); this is only for static value of the other class static is also called access modifier

The place we are using the final is before the variable, before the class, before the method- final of the variable is must caps and it can be used  anywhere at the class and it can't be inherited - string is also called final class because the string is written already by java people If there was an method that is parent and that parent do not't want to edit the value by child that place we can make the method as final

Inheritance--reusabilty of the class one class can inherite the another class. the property of the parent class is used by the child and it can alterit but parent doesn't alter the child class property

Methodoverride--it can change the other class to the child class we declear the override @override we can change the same method to the inherite of the class syntax class Child extends parent the same method void display(){} we can change the value of the method at the child class and change the command

------------------------13/03/23------------------------------
inhertance code reusabilty is achieved in it there was
    1.single inheritance
    2.multilevel inheritance
    3.hirarichical inheritance and
    4.multiple inheritance
        but in normal java multiple inheritance is not possible but using the interface we can achieve the multiple inheritance, interface is used for achieve the abstraction when you are trying to declear the variable in the interface it take as a final if we want to get the interface value without the object we can use the class name or the interface name to call the value or statement and we cannot chage or edit the static vlaue

NESTED AND INNER CLASSES--class within another class we can use the static in the inner class if we want to call the inner class we first create the objcet for the inner class in the outer class and call the object of the inner class in the outer class and use the object to the other class if we want to access the method of the inner class we can create the object of the outer class in the inner class

EXCEPTION HANDLING--abnormal condition in this eh we are going to show the message when the exception is arise 1.try 2.catch 3.throw 4.throws 5.finally the good software must have exception handling throw is used to throw the object manually finally is used to run the block whatever it is Throwable class have hirarichical form two kind of exception checked exception and unchecked and the exception and error are the above of the root and the root is throwable

UNCHECKED  exception is found at teh runtime ex: indexoutofboundsexception

CHECKED exception is found at the compiletime ex: classnotfoundexception

If we don't know what exception is going to arise that time we give the super class of Exception

We can give the one or more catch block of one try block and the rule of giving the super class is to give the class at the last-multiple catch block exception the example is first give the child and last we give the parent class if we give the parent before the child it shows error of you already give the parent class

Exception propogation one method call the other and that other method call the another method is called expropogation and it is used for that 3rd or 4th mehtod cannot catch the exception that method give the below method to handle the excption
        ex: call the method -->n() throws IOException 1.output 2.throw object

How to create a runtime exception is to create the classname and extends it to Runtimeexception it is same as the compile time exception extends Exception

--------------------------14/03/23-----------------------------------
STRING--it  is stored in the string constatnt pool it won't create the new memory of the same value and point out the already exisiting memory

LITERALS-- example: assing the value to the varaible is literals int a=10;//it is integer literals  we can create the object in two ways sting literals and new keyword if we want to compare the two strings use ,equals()method

If we create the new objcet to the memory of the string using new keyword new with creating new object it create the new memory space and if we use to compare == it only check the address but using .equals it see the address and the memory what is contract b/w equals and hashcode method

Object class toString method object is a base class of all other class,tostring method if we are going to compare two objcet we can use equals method--tostring method hash method and equal method

Use of getclass it return class name

STRING BUFFER--BUILDER--both are mutable. string literlas is not possible in it and it always create a new memory java.lang is a base package and we donot want to import the base package and the string3 classes are final

STRING CONSTRUCTOR String(char chars[])->char chars[]={'a','b'}->String s = newString(char,2,3)->for the three arugments of constructor

STRING METHOD-
    1,s.length --if we give the output first string and concat the integer and concat the string it change the value to the integer to string and other case we                                     give it last it doesn't add it show the integer
    2.charAt()it get the character at the specified position
    3.getChars() example:void getChars(int sourctstaart,sourceEnd,char target[],store) example:string s="welcome"->s.getChars(3,7,chars,0)->if we give chars.1 it   shows array index out of bounds because the stroge is small then the decleared 3.toCharArray()
    4.equalignorecase()
    5.startsWith()--if we pass the string to and we can search inbetween the string foobar=startsWith("bar",3)true
    6.endWith()
    7.compareTo()->it is used for sorting
    8.equals()
    9.comapareToIgnoreCase()
    10.indexOf() lastIndexOf()->it show the occurance of the character int indexOf(int ch, int startIndex)-> we can choose the index where to start the search 11.substring() substring(int startindex,end)
    12.concat() we can't use the +in real time insted of we can use the cancat()s2=s1.concat("two")
    13.replace()->replace(char org,char replacement)
    14.trim()->it trim the unwanted space it doesn't remove the inbetween space of the string string="  Hello world  ".trim();
    15.toLowerCase();
    16.toUpperCase();..What are the method available in the string it also in the string builder

STRINGBUFFER--
    1.length()and capacity()->length show the data that is stored in the memory and capacity is show the capcity of the memory space
    2.setLength()->it don't used for set the length it just show the length of the character value it just return the value of the string it doesn't deal with the memory length
    3.append()-> it join the end of the word
    4.insert()
    5.reverse()->it reverse the string
    6.delete()->delete particular character
    7.deleteCharAt()->using index
    8.replace()->same as string
    9.substring()

string and StringBuffer--stringbuffer-- is synchronized-- thread safe--fast

COLLECTION--it is used to store multiple object list-allow duplicate set-not allow duplicate queue-fifo map-we use key in this -- inside the list there was an arraylist and linkedlist and vector i.e list is a interface arraylist(ic),linkedlist(ic),vector(ic) list is a interface and array list is dynamic memory it can be extended linkedlist is used for store retrive and delete the object store and delete is for arraylist and synchronized is used for vector

SET--it is also a interface --- and doesn't allow duplicates type-1.hashset--> no oreder 2.linkedHashSet-->insertion order 3.TreeSet-->ascending order

MAP--we can store key pair value
    type-
        1.hashMap
        2.linkedHashMap
        3.Treemap same as set type property

COLLECTION-->CONTAINER-->STORE THE OBJECT-->it will allow all the type of the object-->we have to restrict the type of object that point we need typesaftey but we don't in the collection but GENERIC--->it will provide typesaftey to the continer<>-symbol
    exmaple-->with GENERIC LIST<car> list=new arraylist<car>();

Constructor--Constructor in java is used to create the instance of the class. Constructors are almost similar to methods except for two things - its name is the same as the class name and it has no return type

CONSTRUCTOROVERLOADING--we can pass the multiple arguments in the constructor and we can write the multiple constructor for the single program

--------------------------15/03/23-------------------------------
MAVEN-- bulid tools developement environment-->source code+test case(positive test case and negative test case)(to check teh code adn functionality)  test environment(testing), production environment(server)

JAVA PROJECT-->step 1 download the jar step 2 load the jar in the project

MAVENA PROJECT--> step 1 add the dependency step 2 maven will pull the jar from cloud. in maven project select artifacts if it is core project select quickstart and if it is the web project select the web app

GROUP ID-- it is the common for all project ex:com.eshop

ARTIFACT ID--it is the project name ex:employee-app

Package name--com.eshop.employee

jdbc driver--
    1.ODBC
    2.NATIVE API PARTLY JAVA DRIVER
    3.NET PROTOCOL PURE JAVA DRIVER
    4.NATIVE PROTOCOL PURE JAVA DRIVER
STEPS TO USING JDBC--
    1.load jdbc driver- if the driver not found we donot go to
    step 2 2.define the connection url-give the data base name and set the username and password
    3.establish the connection-to establish the connection use driver manager and give the url,usernaem,password and give the exception
    4.creatte a staement object
    5.execute a query or update
    6.porocess the results
    7.close teh connection.
    execute    query is used to retrive the data from the table     execute update perform insert delete update
dto-- data transfer object

dao-- data access ibjext(persistence or database operation)

service-- business logic

MULTITHREADING--with in the single app we can run multiple thread and thread is class Main thread method for thread currentThread getName setName getPriority setPriority isAlive join run-entry point of thread sleep start

object called by method is invoking the method

if there was an instance varaible in the class we donot allow the variable to access outside the class instead of we can use the method in the class to assing the varibale

CONSTRUCTOR-- if we name the method same name as the class is called constructor most of we use the constructor to get the value to the inside the class and it make easy of assign the value when we create the object ex:Student student = new Student(salman,40); and constructor doesn't return any value

THIS pointer-- it is used to denote which object it is calling and it denote the instance variable of the class

COPY CONSTRUCTOR-- it copy the one object value to other object

NOTE:always end index -1

------------------------17/03/23-----------------------------
DATABASE-DDL DML DTL
DDL-data definition language, first we are going to create the db and inside the db we can create n numbre of table --data redundency is the problem we can store the data in one table
SQL--use classicmodel;
        select * from customer; 
        select customerName,city,creditLimit from customer;    
        select customerName,city,creditLimit from customer where city='san francisco' and creditLimits>650000;   
        select customerName,city,creditLimit from customer where city in('singapore','san francisco)   
        select customerName,city,creditLimit from customer where city not in('singapore','san francisco)    
        select customerName,city,creditLimit from customer where creditLimit between 60000 and 100000;//above 60000 and below 100000       
        select customerName,city,creditLimit from customer where city like 's%';
                //the city start from the s we getting all the cities %means one or more character after s     
        select customerName,city,creditLimit from customer where city like 's_______';
                // underscore means exactly the underscore after that word    
        select customerName,city,creditLimit from customer limit 3;
                // if i need only 3 customer we give limit as a query after the query give the limit         
         select customerName,city,creditLimit from customer order by customerName;
                //it give the customerName as ascending order      
         select customerName,city,creditLimit from customer order by customerName desc
                //it give the name as descnding order      
         select customerName,city,creditLimit from customer order by creditLimit desc;
                //it give the highest creditLimit      
         select customerName,city,creditLimit from customer order by creditLimit desc limit 3;
                //we getting the highest creditLimit of the 3  
         customer select customerName,city,creditLimit from customer order by creditLimit desc limit 3,2;-->it print the value after 3 to 2value of the table ie.after coming 3 and it print next two value      
         select customerName,city,creditLimit from customer group by city        if we want to retrive the row with the with query with sub query first the inner query is executed and the outer query is start extecuted 
         select *from offices; select fN,email,officeCode,jobTitle from employees where officeCode in (select officeCode from where officeCode in (4,5))       
         select *from payment; select *from customer 
                //we can join the two table by using the join query aggrigate function sum,avrage,max,min.
-------------------------------------20/03/23-------------------------
SQL-->

JSP-->
Scripting Elements
    3 types of tag
        1.scriptlet tag<% %>
            declaring the java variable
        2.expression tag <%= %>
            printing the statement
        3.decleration tag <%! %>
            method decleration

------------------------------------24/03/23-------------------------
develop web application using maven we can create a web app wiithout using maven -- develop web application using dynamic web project(servlet+jsp+mysql+jstl)  ---using maven the dependency is the advantage and download the dependency from the cloud  pom.xml--->add dependency when we try to add the dependency it pull from the cloud using dynamic web project we can add jar manually but using maven it create the structure for us using maven we do thread operation

step1--create a maven project --> select archetype webapp

step2--pom.xml-->add necessary dependency

step3--create package for all the layers
        com.eshop.controller
        com.eshop.service
        com.eshop.dto
        com.eshop.util

step4--create interface and classes for all the layers
        com.eshop.controller
            EmployeeController(create servlet)
        com.eshop.dto
            Emoloyee (create pojo class-Encapsulation)
        com.eshop.service
            Employeeservice-->create interface
            EmployeeServiceImpl-->create implemented class for Employeeservice
        com.eshop.service
            Employeeservice-->create interface
            EmployeeDaoImpl-->create implemented class for EmployeeDao
        com.eshop.util
            mysqlconnection-->create class

step5--implements the CURD operation
        1.go to util package
            implement getconnection method to get a connection
        2.go to dto
            add properties
            generate getters and setters
            generate default and parameterized constructor
            generate toString,hashcode(),equals()
        3.go to dao package
            interface
                declare the methods
            implemented class
                implement the interface methods
                    task-->implement CURD operation-->database operation
        4.go to service package
            interface
                declare the methods
            implemented class
                implement the interface methods
                    implement business logic
        5.go to controller
            recieve HTTP request from the server(input-->API,data,headers)
            HTTP response to the client(output-->outputpage,data,headers)

to diplay output in jsp file use
    1.jstl
        rule 1:if we need the jstl in the project we must addd the jstl dependency
        rule 2 add taglib in jsp page to use jstl tag
    2.expression language
    3.table

Auto wire is used

if we want to go display the output of the java program to jsp use request dispatcher


---------------------------------27/03/23--------------------------------------------
servlet and jsp project + maven-->CURD +mvc vs mvc2

developer ---> input --> business logic --->output

spring framework
    1.spring core
    2.spring context
    3.spring webap
    4.spring web mvc
    5.spring aop
    6.spring jdbc
    7.spring rest
    8.spring data jpa
    9.spring security
    10.spring bean
    11.spring batch
    12.spring cloud


servlet and jsp vs spring framework(spring mvc) vs spring boot

problem faced in the servlet and jsp project
1.maven
    a.add dependency manually --->developer
    b.create object manually --->developer
    c.add mysql configuration --->developer
    d.business logic --->developer

2.spring framework + maven +spring mvc
    a.add dependency manually
    b.add configuration -->spring
    c.create object  --->spring
    d.business logic  --->developer(version)


spring configuration file
    1.xml based
    2.annotation based
    3.java based

    xml based--->bean.xml
    <beans>
        <bean id="car" class="com.eshop.dto.car"></bean>
    </beans>

    IOC--->Inversion of control
    ApplicationContext--->IOC container
    ApplicationContext context=new classPathXmlApplicationContext(bean.xml);
    Car car contexxt.getBean(car.class);

    classPathXmlApplicationContext
    fileSystemApplicationContext
    AnnotationConfigApplicationContext


spring boot
    1.no more xml file
    2.configuration file--> annotation based or java based
    3.no need worry about dependency
    4.minimal configuration
    5.production ready application
    6.convention over configuration
    7.support spring rest


Spring MVC +Spring boot + spring data JPA(mysql)
    it is layered architecture
    1.presentation layer (spring mvc | jsp | template | react js| angulaer js ...)
    2.service layer (spring)
    3.persistence layer (java jdbc +spring jdbc + hibernate spring data jpa)


    java jdbc +spring jdbc + hibernate spring data jpa
    -----------------------------------
    java jdbc
        1.load the driver -->developer
        2.connection url -->developer
        3.statement -->developer
        4.CURD -->developer
        5.execption handling manually -->developer
        6.close connection

    spring jdbc
        1.load the driver -->spring
        2.connection url  -->spring
        3.statement  -->spring
        4.CURD -->developer
        5.execption handling manually -->spring
        6.close connection -->spring


    hibernate
     dialect engine
       mysql dialext engine ---> generate query
       mongoDB dialext engine ---> generate query
       save()--> generate insert query


EmployeeDAO
    employee saveemployee(Employee employee);
    list<Product> getAllProduct();
    product getproductById();
EmployeeDAOImpl


spring data JPA
    no need to create the interface
    curdrepository
    pagingandsoringrepository
    jparepository

spring rest + spring mvc + spring boot + spring dddata jpa + lombak
------------------------------------------------------------------
    spring rest
        web service
            communication between app


web service we are trying to use the one website to get the info from another we use web service but there was a case one service use one type like; .net and other use java it can't communicate each other if the one of the web is a service oriented that use the rest service using spring rest we can communicate different application
it was written above the http PROTOCOL exmaple: red bus is a servie oriented web that give the where the other bus are on which location the other buses are there that was on there there app but it get buy the red bus


dispatcher servlet
1.handler mapping --->find out the appropriate controller
2.view resolver---->find the view page


spring boot
    1.create spring boot project
        project-name
        group-id
        artifact-id
        package-name
        select java version
        select dependency
        STS-->file -->new -->spring starter project or https://start.spring.io/


entity class is used for using the pojo class inside
in spring the object are created like object
if we add @repository in the class it will create the object


autowired-->is used to inject the object from IOC continer

class level and method level
@requestmapping(method="post")

class level
@getmapping-->retrieve the resource
@postmapping--> save
@putmapping-->update
@deletemapping-->delete

Annotation
    above the class name
    above the method name
    above the constructor
    above the field




input-->JSON
@requestBody-->JSON convert into the java object

Lombok
    The project Lombok is a popular and widely used Java library that is used to minimize or remove the boilerplate code. It saves time and effort. Just by using the annotations, we can save space and readability of the source code. It is automatically plugging into IDEs and build tools to spice up our Java application.

IOC--In traditional programming, a class instantiates its dependencies using the new keyword. However, in the IOC pattern, a container object creates and injects the dependencies into the class at runtime. This allows for greater flexibility and easier maintenance of code.


dependency injection

componetscan create a objecgt and load into the continer

postmapping--for insert new record
patchmapping---partial update
putmapping---update all exisiting
getmapping---retrieve all, based on the condition
deletemapping---delete resource
-------------------------28/03/23-------------------

spring starter web
    spring MVC---client sent to the request to the server it find the appropriate controller (maven or spring boot)
    view page -- jsp or template
    @controller-----controls the flow of the data. it can't recive the user input
        handlerMapping
        viewResolver
    spring rest (spring MVC)
        @restController =@controller + @responseBody--->The @ResponseBody annotation tells a controller that the object returned is automatically serialized into JSON and passed back into the HttpResponse object

        handlerMapping
        responseBody---> convert java object to JSON object


Responseaentity
    data
    stauts code
    http header

respose ---data stauts code http header

@crossorgin is used to give the retrive access to the third party website and we can set who can access the service of ours i.e header.setAccessControlAllowOrgin("http://google.com")

resource are used by the same entity

MICROSERVICE

MONOLITHIC
    all componets are paert of single unit
    developed,deoloyed and scaled as single unit
    app must be written in the one tech stack
    teams need to be careful to not affect each others works
    single artifact(war file), so you must redeploy the entire application on each update
    if the more request came it get stuck server down
    dificult to understand the flow
    and ide overloaded
    web continer is overloaded
    continuous deployment is difficult
    long term commitment is difficult

MICROSERVICE
    we break down the app into smaller independent app
    it are basically service which exposed by REST

challenges in cloud enable restfull webserivce
    bounded context --spring cloud netflix
    configuration management
    dymanic scale up and scale down
    visiblity --cloud api
    fault tolerance --circuit breaker

advantage new technology

