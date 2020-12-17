package game;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;


public class Model {

    public Model(){
    }

    Scanner scan = new Scanner(System.in); // Scanner Object for input

    // Accepts and returns a char entered by the user
    public char charFromUser() {
        char input = scan.next().charAt(0);
        return input;
    }

    public int intFromUser(){
        int input = scan.nextInt();
        return input;
    }

    // Generates and returns a random value
    public int randomRoll(int min, int max){
        return (int)(Math.random()*(max-min+1)+min);
    }

    public void switchWith4Cases(char input, String case1, String case2, String case3, String case4){
        switch (input) {
            case 'a':
            case 'A':
                System.out.println(case1);
                break;
            case 'b':
            case 'B':
                System.out.println(case1);
                break;
            case 'c':
            case 'C':
                System.out.println(case1);
                break;
            case 'd':
            case 'D':
                System.out.println(case1);
                break;
            default:
        }
    }

    // Generate a dynamic array of unique random numbers
    public ArrayList randomUniqueNumbers(int min, int max, int totalNumbers){
        // Dynamic array holding all random numbers generated with no duplicates
        ArrayList<Integer> uniqueRandomNumbers = new ArrayList<Integer>();

        // Random number variable
        int rand1;
        // arrayCounter used for stepping through array elements
        int arrayCounter;
        // arrayIndex points at individual array elements
        int arrayIndex;

        // While unique random numbers are needed
        while (uniqueRandomNumbers.size() < totalNumbers){
            // Generate random value
            rand1 = randomRoll(min,max);
            //System.out.println("Random val: " + rand1);

            // If list is empty, add first element
            if (uniqueRandomNumbers.size() == 0){
                // Add first element to empty list
                uniqueRandomNumbers.add(rand1);
            }

            // compare new value to existing list elements
            else{
                arrayCounter = 0;
                arrayIndex = 0;
                // Loop moves through every element in list
                while (arrayCounter < uniqueRandomNumbers.size()){
                    // Compare new element to list elements
                    if (rand1 == uniqueRandomNumbers.get(arrayIndex)){
                        // If match is found break out of loop
                        break;
                    }
                    // If the end of the list is reached, add new element to list
                    if (arrayIndex == uniqueRandomNumbers.size() - 1){
                        uniqueRandomNumbers.add(rand1);
                    }
                    arrayCounter++;
                    arrayIndex++;
                }
            }
        }
        /*
        // Print contents of array list
        System.out.println();
        arrayCounter = 0;
        arrayIndex = 0;
        System.out.print("Contents of No Dups Array: ");
        while (arrayCounter < uniqueRandomNumbers.size()){
            System.out.print(uniqueRandomNumbers.get(arrayIndex) + " ");
            arrayCounter++;
            arrayIndex++;
        }
        */
        return uniqueRandomNumbers;
    }

    public ArrayList pathOptions(){
        Paths paths = new Paths();
        return paths.getPathList();
    }


}
