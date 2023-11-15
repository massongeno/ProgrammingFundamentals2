/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ShipDemo;

import java.util.ArrayList;

/**
 * 6/29/2022
 * Lab 3
 * @author Mason
 * JDK 17.0.2
 */
public class ShipDemo {

    public static void main(String[] args) {
        
        
        ArrayList<Object> shipArray = new ArrayList<>(3);
        
        shipArray.add(new Ship("Serendipity", "1994"));
        shipArray.add(new CruiseShip("Gale", "1992", 520));
        shipArray.add(new CargoShip("SS Florida", "2003", 12000));
        
        System.out.println(shipArray);
        
    }
    
}
