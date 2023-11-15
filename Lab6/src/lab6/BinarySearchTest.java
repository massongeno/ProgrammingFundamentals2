/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Mason
 */
public class BinarySearchTest {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] searchData = {"Jack", "Bob", "Esther", "Zoe", "Al", "Katy" };
        
        ObjectQuickSorter.sort(searchData);
                for (int i=0; i<=searchData.length-1; i++) {
            System.out.println(searchData[i]);
        }
        for (int k = 1; k<=3;k++){
            System.out.println("Enter a string to search for:");
            String str = scanner.nextLine();
            System.out.println("You entered " + str);
            
            int position = ObjectBinarySearcher.search(searchData, str);
            if (position != -1){
                System.out.println(str + " is found at position " + position);
            } else {
                System.out.println(str + " is not in the array.");
            }
        }
    }
    
}
