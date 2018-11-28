# Payroll-Java-
# Author: Marcelo Mariduena
In this homework, you will create a class named Person with data necessary to do payroll on that person and do all processing related to that person.  This class should have the following member variables. They should not be static and should have an access specifier of private
+ String name
+ String address
+ double hourlyRate
+ int hoursWorked

You must provide at least one constructor, two for extra credit (5 points) One should be a default or no argument constructor while the second should accept all member variables as parameters and initialize them.
In addition to the member variables, create the following methods.  They should not be static and the proper visibility modifier should be used:
    
Getter and setter methods for all 5 member variables
double computeGrossPay() – this should compute the gross pay for the week based on hourlyRate and hoursWorked – no deductions

The Person class should not have a main method nor should it do any input/output. (No Scanner or print/println)
In a second class (the driver class), should have a main method that:
+ handles all communication with the user
+ Creates an array or ArrayList of  5 Person objects
+ Allow the user to enter name, address, hourly rate and hours worked for five (5) employees- enter them one at time- not all on the same line.
+ Create a Person object for each of the five employees and store in the array or ArrayList.
+ Print the name and gross pay for each of the five employees in a user friendly fashion from the array or ArrayList – not as they are being calculated
