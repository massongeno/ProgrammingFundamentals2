package lab7;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mason
 */
public class Employee {
    public int id;
    public String name;
    
    public Employee(){
        id = 0;
        name = "";
    }
    
    public Employee(String employeeName, int idnumber){
        id = idnumber;
        name = employeeName;
    }
    
    public void setIDNumber(int idnumber){
        id = idnumber;
    }
    public void setName(String employeeName){
        name = employeeName;
    }
    public int getIDNumber(){
        return id;
    }
    public String getName(){
        return name;
    }
    
}

