/* 
@author: mmariduena
*/

import java.util.Scanner;

class Driver {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
      
    System.out.println("Hello user! This program calculates the gross wages of 5 drivers.");
    
    // Creates an array of 5 Person objects
    Person[] ArrayList = new Person[5];
    
    // Arrays for values which will be passing into the parameters of future Person objects.
    String[] drivers = new String[5];
    String[] addresses = new String[5];
    double[] wages = new double[5];
    int[] hoursWorked = new int[5];
    
    // A for-loop which prompts for the information of the 5 drivers
    for (int i = 0; i < 5; i++) {
      System.out.println("Please enter the name of driver " + (i + 1) + ":");
      drivers[i] = input.nextLine();
    
      System.out.println("Please enter the address of driver " + (i + 1) + ":");
      addresses[i] = input.nextLine();
    
      System.out.println("Please enter the hourly wage of driver " + (i + 1) + ":");
      wages[i] = input.nextDouble();
    
      System.out.println("Please enter the hours worked by driver " + (i + 1) + ":");
      hoursWorked[i] = input.nextInt();
      input.nextLine();
    }

    // A for-loop which assigns the information to each Person object within the ArrayList
    for (int i = 0; i < 5; i++) {
      ArrayList[i] = new Person(drivers[i], addresses[i], wages[i], hoursWorked[i]);
    }
    
    // A for-loop which prints the gross salaries of each driver 
    for (int i = 0; i < 5; i++){
      System.out.println(ArrayList[i].toPhrase());
    }
    
    input.close();
  }
}