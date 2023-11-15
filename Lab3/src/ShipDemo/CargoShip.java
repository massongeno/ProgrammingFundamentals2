/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ShipDemo;

/**
 *
 * @author Mason
 */
public class CargoShip extends Ship {
    int cargoCapacity;
    
    public CargoShip(){
        cargoCapacity = 0;
        shipName = "";
        shipYear = "";
    }
    
    public CargoShip(String name, String year, int capacity){
        shipName = name;
        shipYear = year;
        cargoCapacity = capacity;
    }
    
    public void setCapacity(int cargoCapacity){
        cargoCapacity = this.cargoCapacity;
    }
    
    public int getCapacity(){
        return cargoCapacity;
    }
    
    @Override
    public String toString(){
        String str = 
                "\n" +
                "\nShip Name: " + shipName +  
                "\nCargo Capacity(in tons): " + cargoCapacity;
        
        return str;
    }
    
}
