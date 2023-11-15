/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab5;

/**
 *
 * @author Mason
 */
public class PalindromeDetector {
   public static void main(String[] args)
   {
      // Create an array of strings to test.
      String[] testStrings = { "Civic",
                               "Deified",
                               "Amazing",
                               "Dinner",
                               "Racecar"};
   
      // Test the strings.
      for (int i = 0; i < testStrings.length; i++)
      {
         System.out.print("\"" + testStrings[i] + "\"");
         if (isPalindrome(testStrings[i].toUpperCase()))
            System.out.println(" is a palindrome.");
         else
            System.out.println(" is not a palindrome.");
      }
   }
   /**
    The isPalindrome method determines whether a string
is a palindrome.
@param str The string to test.
@return This method returns true if str contains a
        palindrome. It returns false otherwise.
   */
     
   public static boolean isPalindrome(String str)
   {
      boolean status = false;
      if (str.length() <= 1)
         status = true;
      else if (str.charAt(0) == str.charAt(str.length()-1))
         status = isPalindrome (str.substring (1, str.length()-1));
      return status;
   }
}