/* 
@author: mmariduena
*/

public class Person{
  private String name;
  private String address;
  private double hourlyWage;
  private int hoursWorked;

  // Person Constructor 
  public Person() {
    name = "Unknown";
    address = "Unknown";
    hourlyWage = 0;
    hoursWorked = 0;
  }

  public Person(String newName, String newAddress, double newHourlyWage, int newHoursWorked) {
    name = newName;
    address = newAddress;
    hourlyWage = newHourlyWage;
    hoursWorked = newHoursWorked;
  }

  public void setName(String newName) {
    name = newName;
  }

  public void setAddress(String newAddress){
    address = newAddress;
  }

  public void setHourlyWage(double newWage){
    hourlyWage = newWage;
  }

  public void setHoursWorked(int newHours){
    hoursWorked = newHours;
  }

  public String getName(){
    return name;
  }

  public String getAddress(){
    return address;
  }

  public double getHourlyWage(){
    return hourlyWage;
  }

  public double getHoursWorked(){
    return hoursWorked;
  }

  public double computeGrossPay(){
    return getHourlyWage() * getHoursWorked();
  }

  public String toPhrase(){
    return "Hello " + getName() + " from " + getAddress() + ". Your gross wage for the week is $" + computeGrossPay();
  }
  

}