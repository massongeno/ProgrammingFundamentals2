
/**
 * COSC Lab 2
 * @author Mason Doherty
 * 6/22/2022
 * JDK 17.0.2
 */

import java.util.ArrayList;
import java.util.Scanner;


public class CarpetCalculatorApp {


    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        ArrayList<Object> roomCarpetArray = new ArrayList<>(3);
        
        for (int i = 0; i < 3; i++){
        System.out.println("What is the width of room #" + (i+1) + "  in feet?");
        double width = keyboard.nextDouble();
        
        System.out.println("What is the length of room #" + (i+1) + " in feet?");
        double length = keyboard.nextDouble();
        
        System.out.println("What is the price per square foot?");
        double carpetCost = keyboard.nextDouble();
        
        RoomDimension dimensions = new RoomDimension(length, width);
        roomCarpetArray.add(new RoomCarpet(dimensions, carpetCost));
        
        System.out.println("Width: " + width + 
                "\nLength: " + length +
                "\nCost Per Square Foot: " + carpetCost +
                "\n" + dimensions.toString() + " square feet" +
                "\n" + roomCarpetArray.get(i) + 
                "\n-------------------");
        }
        System.out.println(roomCarpetArray);
        
        RoomCarpet a = (RoomCarpet) roomCarpetArray.get(0);
        RoomCarpet b = (RoomCarpet) roomCarpetArray.get(1);
        RoomCarpet c = (RoomCarpet) roomCarpetArray.get(2);
        
        System.out.println("---------------");
        System.out.println("Cost Comparison");
        System.out.println("---------------");
        System.out.print("#1 vs #2: "); 
        a.costCompareTo(b);
        System.out.print("#2 vs #3: "); 
        b.costCompareTo(c);
        System.out.print("#3 vs #1: "); 
        c.costCompareTo(a);
        
        System.out.println("---------------");
        System.out.println("Hashcodes");
        System.out.println("---------------");
        System.out.println("Hashcode #1: " + a.hashCode());
        System.out.println("Hashcode #2: " + b.hashCode());
        System.out.println("Hashcode #3: " + c.hashCode());

        System.out.println("---------------");
        try {
            System.out.print("Cloned Object: " + a.clone());
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
        }
        System.out.println("---------------");
        
        System.out.println();
        a.finalize();
    }
    
}
