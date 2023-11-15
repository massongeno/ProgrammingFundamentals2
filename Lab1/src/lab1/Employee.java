/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author Mason
 */
public class Employee {
    private String name;
    private int idNumber;
    private String department;
    private String position;

        public Employee(){
            name = "";
            idNumber = 0;
            department = "";
            position = "";
        }

        public Employee(String employeeName, int id, String dept, String pos){
            name = employeeName;
            idNumber = id;
            department = dept;
            position = pos;
        }

        public Employee(String name, int idNumber){
            name = this.name;
            idNumber = this.idNumber;
            department = "";
            position = "";
        }

        public void setName(String name){
            name = this.name;
        }

        public void setIDNumber(int idNumber){
            idNumber = this.idNumber;
        }

        public void setDepartment(String department){
            department = this.department;
        }

        public void setPosition(String position){
            position = this.position;
        }

        public String getName(){
            return name;
        }

        public int getIDNumber(){
            return idNumber;
        }

        public String getDepartment(){
            return department;
        }

        public String getPosition(){
            return position;
        }
}
