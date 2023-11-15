/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipDemo;

/**
 *
 * @author Mason
 */
public class CruiseShip extends Ship {
    int numPassengers;
    
    public CruiseShip(){
        shipName = "";
        shipYear = "";
        numPassengers = 0;
    }
    
    public CruiseShip(String name, String year, int passengers){
        shipName = name;
        shipYear = year;
        numPassengers = passengers;
    }
    
    public void setPassengers(int numPassengers){
        numPassengers = this.numPassengers;
    }
    
    public int getPassengers(){
        return numPassengers;
    }
    
    @Override
    public String toString(){
        String str = 
                "\n" +
                "\nShip Name: " + shipName + 
                "\n# of Passengers: " + numPassengers;
        
        return str;
    }
    
}
