/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipDemo;

/**
 *
 * @author Mason
 */
public class Ship{
    
    String shipName;
    String shipYear;
    
    public Ship(){
        shipName = "";
        shipYear = "";
    }
    
    public Ship(String name, String year){
        shipName = name;
        shipYear = year;
    }
    
    public void setShipName(String shipName){
        shipName = this.shipName;
    }
    
    public String getShipName(){
        return shipName;
    }
    
    public void setShipYear(String shipYear){
        shipYear = this.shipYear;
    }
    
    public String getShipYear(){
        return shipYear;
    }
    
    @Override
    public String toString(){
        String str = 
                "\n" +
                "\nShip Name: " + shipName + 
                "\nShip Year: " + shipYear;
        
        return str;
    }
    
}
