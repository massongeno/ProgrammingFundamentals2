
package lab1;

/**
 * Lab 1
 * @author Mason Doherty
 * 6/15/2022
 * JDK 17.0.2
 */

public class EmployeeApp {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee emp2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee emp3 = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer"); 
        
        System.out.println(emp1.getName() + " | " + emp1.getIDNumber() + " | " + emp1.getDepartment() + "    | " + emp1.getPosition());
        System.out.println(emp2.getName() + "   | " + emp2.getIDNumber() + " | " + emp2.getDepartment() + "            | " + emp2.getPosition());
        System.out.println(emp3.getName() + "   | " + emp3.getIDNumber() + " | " + emp3.getDepartment() + " | " + emp3.getPosition());
    }
    
}
