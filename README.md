Student_ID: 011538215    
Name: Neil Thaker  
email-id: neil.thaker@sjsu.edu , neil10thaker@gmail.com

# SpringApplication
# CMPE-275-Lab-0

Steps:

Created Maven project in eclipse. 
Added all dependencies required for spring in pom.xml 
  
Created interface name Greeter and added 2 methods as per instruction.  
setName  
getGreetings  
  
Created one class-GreeterWorld to implement Greeter interface      
Override all methods and in getGreetings method returned message : "Hello world from "+ name +"!"       
      
Created beans.xml file       
Added one bean with id greeter and class with pkg.GreeterWorld       
Added property name and its value "Alice"           
       
In main execution class World, main method, created ApplicationContext object and given beans.xml        
Got bean with its id.      
Called getGreeting method and printed its returned value.    
Like : Hello world from Alice!      
