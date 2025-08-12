// 2 Steps to creating a variable:
// 1. Declaration
// 2. Assignment


public class Main{
    public static void main(String[] args) {
       // variable = a reusable container for a value and a variable behaves as if it was the value it contains
       int age = 30; // age is a variable of type int, initialized to 30 
       System.out.println("The variable has the number: " +age); // prints the value of age to the console  
       
       double price = 19.99; // price is a variable of type double, initialized to 19.99
       System.out.println("The price is: " + price);

       char symbol = '$'; // symbol is a variable of type char, initialized to '$'
       System.out.println("The price of the item is: " + symbol + price);

       boolean isStudent = true; // isStudent is a variable of type boolean, initialized to true
       System.out.println("Is the Student available? " + isStudent);

       String name = "Krishnaprasath";
       System.out.println("The name is: " + name);
    

    if (isStudent) {
       System.out.println("The student is enrolled");
   }
   else {
       System.out.println("The student is not enrolled");
   }
   }
}


// Data types in Java:
// int - integer (whole number)
// double - floating point number (decimal)
// String - sequence of characters (text)
// boolean - true or false value
// char - single character