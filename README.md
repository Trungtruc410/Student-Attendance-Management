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

## Use case Description
1. Register use case
● Brief description
- The register use case allows the admin to register the account for teachers to use
the check attendance system.
● Step by step description
1. Admin fills in Users (teachers)‘s personal information to register and then teachers use
this account to sign up for checking attendance system by clicking on the sign up
button.
2. The system will immediately show the registration form's user interface for admin.
3. Next the admin make a completion of creating the teacher account system by fillling in
some required personal information.
4. Finally, the admin clicks on the checkbox to confirm to all terms and completes the
registration process.
● Possible alternatives:
1. Our system verifies the authenticity of each email since each is unique, therefore if
admin use an available email that has previously been used, the system will print an
error and ask you to re-enter it.
2) Login use case
● Brief description
- The login use case allows the user (teachers) to log in to the system or log out.
● Step by step description
- User (teacher)
1. Users login to the system with their accounts which they recieve from the admin.
2. After login, The validity of users (teachers) account will be checked by the system
3. The Home Page checking students attendance interface will appear.
● Possible alternatives
- Users (teachers)
1. If user's account information is incorrect so they have to re-enter it.
2. If users want to use another account, they can log out of the system with the logout
button.
- Admin
1. If teacher's account information is incorrect so they have to re-enter it.
3) Checking student attendance use case
● Brief description
- User checking attendance at Checking attendance use case.
● Step by step description
1. After the user has logged into the system, The system provides “Checking attendance”
to tick students who joined the class. When teachers finish checking attendance
process. The system will show the table to confirm.
2. Select the ID of the subject wants to check attendance, then click checking to check
attendance of students.
3. User will be redirected to Confirm Page to review checking attendance information
(including subject, time, student name, date).
4. The user selects the number of students to be absent or attend and presses the
Confirm button to assert.
5. The user will be directed to the Transaction Page to confirm the information before
checking attendance. Includes list information, students name, subject name, period.
● Possible alternatives
- If the user chooses to Cancel on the Checking attendance Page and the Confirm
Page, they will be redirected to the Home Page.
- On the Transaction page, the user can return to the Confirmation page to view the
information. When choose to Cancel on this page, users will receive a notification,
if click Yes, they will be redirected to the Home Page Checking attendance.
4) Profile use case
● Brief description
- User view profile at teacher profile use case.
● Step by step description
1. Users select Show to see teacher’s personal information.
2. Entries can be edited including name, address, gender, age, phone number,
username, and password, class, and email
3. Select Update to update.
● Possible alternatives
- Choose Back to return Home Page Checking attendance.
5) Add New List use case
● Brief description
- Admin will create list at Add New List use case.
● Step by step description
1. Admin provides required information comprise class, subject, teacher name, week,
period start, period end, and date.
2. Choose Add New List to add List checking attendance class.
● Possible alternatives
1. Choose Cancel to return Admin Checking attendance Home Page.
6) Edit List use case
● Brief description
- Admin will change information about List at Edit List use case.
● Step by step description
1. Admin searches for list by selecting its ID.
2. Select the features to update including teacher name, subject, period start, period
end, week, and date.
3. Select Update to update list information or Delete to delete list.
● Possible alternatives
- Choose Cancel to return Admin Checking attendance Home Page.
7) All List use case
● Brief description
- All Lists use case allows admin to view list’s information.
● Step by step description
1. list’s information such as subject's id, teacher, period start, period end, week, and
date can be view by admin.
● Possible alternatives
- Choose Back to return Admin Checking attendance Home Page.
8) All User use case
● Brief description
- All user use case allows admin to view user(teacher)'s personal information.
● Step by step description
1. The user's personal information such as user's id, name, address, gender, age,
phone, user's mail, and password can be view by admin.
● Possible alternatives
- Choose Cancel to return Admin Checking attendance Home Page.
9) Transaction Log use case
● Brief description
- Transaction log use case allows admin and user to review checking attendance history.
● Step by step description
- User(teachers)
▪ Users can review checking attendance list including subject, class, date, name of student.
- Admin
▪ Admin can review customer checking attendance history including subject’s id, list’s id, 
checking list’s id, and checking attendance date.
● Possible alternatives
- Users (teachers)
▪ Choose Back to return Admin Checking Attendance Home Page.
- Admin
▪ Choose Back to return Admin Checking Attendance Home Page Booking.
