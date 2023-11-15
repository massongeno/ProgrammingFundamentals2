/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class EmployeeMapDemo {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John", 0);
        Employee emp2 = new Employee("Jane", 1);
        Employee emp3 = new Employee("Judith", 2);
        Employee emp4 = new Employee("Josh", 3);
        
        Map<Integer, String> employeeMap = new HashMap<>();
        
        EmployeeMap.add(employeeMap, emp1);
        EmployeeMap.add(employeeMap, emp2);
        EmployeeMap.add(employeeMap, emp3);
        EmployeeMap.add(employeeMap, emp4);
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a Valid ID number:");
        int idLookup = keyboard.nextInt();
        
        System.out.println("Found " + EmployeeMap.lookUp(employeeMap, idLookup) + " under ID " + idLookup + ".");
    }
    
}
