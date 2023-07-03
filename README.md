# Stadium-Seat-Booking-System

## Overview

A student attendance system is a tool used by teachers to keep track of student
attendance in their classes. The system typically involves using a computer program to
log student attendance data, which can then be easily accessed and analyzed by the
teacher.

## Technology

1. [MySQL Workbench] (https://dev.mysql.com/downloads/workbench/)
- Our project works mainly on MySQL Workbench. MySQL Workbench is a tool that provides
data modeling, SQL development, and intuitive database design, creation, and
management. It is available on Windows, Linux, and Mac OS X.
▪ Make it easy for users to create complex ER models.
▪ Including color syntax highlighting, autocomplete, SQL snippet reuse, and SQL execution
history. Users may easily manage conventional database connections, including MySQL
Fabric, using the Database Connections Panel. The Object Browser allows you to view
the database schema and objects right away.
▪ Easily manage MySQL environments and obtain better visibility into the database.

2. [Netbean] (https://netbeans.apache.org/)
- NetBeans has a number of code analyzers, editors, and converters that support Java
technologies, making it easier to create applications rapidly. The system works on any
operating system and requires no user code changes. It comes with a plethora of editing
tools that operate in a variety of languages, including JavaScript, XML, and HTML.
▪ For quick reworking, it includes powerful tools, code generators, code examples, and
coding hints. The system's capabilities may be expanded with plugins, and the editor
works well with drag-and-drop tools. This makes GUI development for PHP, JAVA SE,
JAVA EE, Java ME, HTML5, and C/C++ much easier.
▪ Static analysis capabilities in NetBeans help users to save money on error codes. There's
also a NetBeans Profiler function that may help developers get support to optimize
application performance and memory utilization. It also aids users in the development
of dependable and adaptable Java SE, JavaFX, and Java EE applications.

3. [Java] (https://www.java.com/en/)
- The main language we use is java. Java is an object-oriented programming language that
aids in the development of programs and applications on any platform.
▪ Java has a fairly basic syntax that is simple to develop, learn, maintain, and comprehend,
and the code is straightforward to debug.
▪ Assist us in making the code more flexible and reusable. It also aids in security by
combining data and functions into a single unit that is not accessible from the outside. It
also aids in the organization of big sections into smaller modules for easier
comprehension.
▪ Avoid explicit points to reduce security concerns and hazards.
▪ The Write Once Run Anywhere (WORA) functionality ensures platform independence.
▪ Ones written in Java are more stable than programs written in other languages.

## Project Details and requirements

- This program is based on three key themes. Each user/teacher of the system is given
their own account. User/Teacher are provided distinct functions based on their job
through the first login interface:
1. Teacher
User gets account from admin, admin creates an account through the information
given by the teacher. User will provide basic information such as their names, email
(which will be used as a login account), address, phone number, and so on....
Teachers may then log into the system using the newly established account.
2. Admin
When an administrator logs in, they will see a list of goods that have been published.
In addition, our system will provide the vendor with various management functions:
Add/Delete list, as well as other functions like as managing users, managing list, and
keeping track students.

## Execution
1. Register Function
- Admin create an account for the teacher based on the information that
the teacher has given personal information like name, address, gender,
age, phone number, subject, class, email, password to create an
account. Then click the “Register” button to sign up.
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/28e84ae1-ea1c-4da8-bf2e-fc02512d00ee)
2. Sign Up Success 
- When the user fills in all the information that is valid, then the register will succeed and jump back to the Login Page.
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/09e82157-dca2-4e23-ae2a-d8e54d9cc886)
3. Login Function 
-	User input email and the password, then press Login Button to process. 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/2d0d03fc-e1e2-438a-99af-4e08d50e257c)
-	Login Success: An announcement will be displayed with a message “Successfully Login” then the Homepage will be displayed. 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/e9c78fee-6b5e-41c5-8fbc-4ba028710a8a)
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/a0bc69d6-1414-4164-b53a-709372ced90c)
4. Checking attendance: 
a. Show all list 
- After users log in to the system, they will be able to watch all the list after clicking the “Show All List” button. 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/7a0510b6-bcba-4882-bdc4-dab6fbf1536e)
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/4422ab20-6841-42a4-bde5-8f2f667e1b25)
b. Search and Filter List By Categories 
-	Users can filter and search for list by Teacher, Subject, Week, and Class that they want to find. 
-	Example: We will search list by teacher name categories 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/edbaaca4-0533-4bac-a4a6-6a6208b1c77c)
c. Check attendance by choosing ID’s list: 
-	After teacher know all about the list then they can choose the list that they want to check student attendance by choosing the ID’s list and then click the “Next” button to process. 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/169e67f6-612e-44ff-98e3-9a30cfb0189a)
5. Checking students: 
- After choosing the list as teacher want, the student names of the class through this ID will be displayed in the Confirm Page. Teacher read attendance names of students in turn to take attendance by click into the check box and save information. 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/ff47617c-19aa-4963-8fc9-50d5fbac2495)
6. Teacher profile page 
- After registering, teacher can click to the “Profile” button to go through the page then click to the “Show Profile '' to see their all their information and update it. 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/dc357b3a-2bb2-4e83-ac02-56dc87328068)
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/5d994b77-4537-4649-89d4-700eb865b6b7)
7. History Checking Function 
- When teacher finish the checking step, they can see all the list that they transact via the “History checking” function. 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/ccff35ea-bf27-478b-8a28-6836582734b7)
Administrator Function 
a.	Home Page 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/3ed7c6a5-b433-423c-80a2-8302304f6d86)
b.	Add new list 
- Admin can add new lists to the system by filling in all information and then click the “Add new list” button. 
 ![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/4c3842e2-fa28-42cf-8d3c-bc2ed2e83330)
c. Edit the list 
-	Admin can update and delete list by searching the id of the list then the information of that list will be displayed by clicking the “Search” button. 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/552c1315-e987-4a51-bb51-c902d9d84484)
d.	Show all list 
-	Admin can easily manage and watch all list through the “All List” function. 
 ![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/c84f295e-d8da-44fa-9cd8-6896f7acd454)
e.	Show all teacher 
-	Admin can also know all about how many teachers they have in the system through the “All teacher” function. 
![image](https://github.com/Trungtruc410/Student-Attendance-Management/assets/85205181/407e965f-f99d-442c-9bd6-366f9d485709)








