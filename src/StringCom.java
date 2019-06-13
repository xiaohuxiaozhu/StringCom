
//The following code is supposed
// to ask the user their pet's name, breed and age
// Add the 3 lines necessary to make this work...

import java.util.Scanner;

public class StringCom {



        public static void main(String[] args)
        {
            Scanner keyboard = new Scanner(System.in);


            System.out.println( "Greetings. What is your pet's name? " );
            String name = keyboard.next();

            System.out.println( "What kind of animal is " + name + "? " );
            String breed = keyboard.next();

            System.out.println( "How old is " + name + "? ");
            int age = keyboard.nextInt();

            System.out.println( name + " is your " + breed + " and it is " + age );

        }
    }

