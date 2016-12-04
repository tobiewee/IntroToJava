/*
 * Step 1.
 * A Basic Hello World Program and a quick introduction to data types in Java.
 *
 * Who is it for?
 * This tutorial is made for beginners, who are new to Java.
 *
 * What it covers:
 * - Hello World program.
 * - Output to console.
 * - Variable declaration.
 * - Variable initialization.
 * - Basic data types.
 *
 * Created by Tobie Wee
 */

public class Step1 {

    public static void main(String[] args) {
        // This method is the main program method.
        // It will be run when the program executes.
        // TODO: Try typing System.out.println("Hello World") below, and run the program.
        System.out.println();


        // Congratulations! You just ran your first Java program!
        // In the line of code above, System.out.println prints a String to the console and puts a line break at the end.
        // A String is a sequence of characters, be it a word, phrase or even a sentence within a set of double quotes.
        // TODO: Create a String variable below, and assign your name to it using the = operator.
        String firstName = "";


        // The '=' operator is used to assign values or objects to variables in Java.
        // Don't worry about objects for now, as you will eventually get to learn more about it.
        // As shown above, creating a variable is easy, choose a data type, provide a variable name for it,
        // and assign a value to initialize it.
        // * NOTE: Variable names in Java have to start with either a letter or an underscore.
        //         Usually, variable names are camelCased in Java by convention.
        // TODO: Create a String variable and assign your last name to it.


        // Now that you've created a String with your name...
        // TODO: Try printing a line of text in the console using the + operator to join two strings.
        System.out.println("Hello " + firstName);

        // TODO: Run the code and see that the program says Hello to you.
        // TODO: Modify the above method code, to print "Hello firstName lastName"


        // Besides strings, there are other data types in Java.
        // Examples are given below in terms of a human being.

        // Integers store whole numbers. (both positive and negative)
        int age = 5;

        // Floats and Doubles store numbers with decimal points.
        double height = 1.78;
        float weight = 50.4f;

        // Booleans store values that are either true or false.
        boolean hasHair = true;
        boolean isAnimal = false;

        // TODO: Try printing the above values to the console using what you already know.
        // TODO: Try changing the values being assigned to the variables to see what is permitted and what each outputs.


        // Hurray. You now have some basic knowledge on Java.
        // Step 2 will introduce conditionals and loops.
    }
}
