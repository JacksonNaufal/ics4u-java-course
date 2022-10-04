/*
* The program gets a input from the user to use
* in the JacksonStacks program.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-10-04
*
* This is a JacksonStacks program.
*/

import java.util.Scanner;

final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        int x; //decleration

        x = 123; // assignment
        
        // OR
        
        int z = 123; // initialization
        
        long a = 1000000; // big number
        byte g = 100; // small number (<=127)
        //float y = 3.14f;
        double y = 3.14;

        boolean h = true;
        boolean j = false;
        char symbol = '@';
        String name = "BOB";

        System.out.println(x);
        System.out.println(z);
        System.out.println("Samething, different/easier way to declare it");
        System.out.println("My number is" + x + "and" + z);
        System.out.println(y);
        System.out.println(symbol);
        System.out.println("Hello, my name is " + name);

    }
}
            
