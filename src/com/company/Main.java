package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //variable for user input
        String question = "";
        int count = 0;
        String[] splitStr;

        //random number generator
        Random r = new Random();

        Scanner input = new Scanner(System.in);
        /*
        //Hedgset for hedges
        HashSet<String> hedges = new HashSet<String>();

        hedges.add("Please tell me more");
        hedges.add("Many of my patients tell me the same thing ");
        hedges.add("It is getting late, maybe we had better quit");
        hedges.add("Any thing you want to add more");

        //Hashset for qualifiers
        HashSet<String> qualifiers = new HashSet<String>();
        qualifiers.add("Why do you say that");
        qualifiers.add("You seem to that that");
        qualifiers.add("So, you are concerned that");
 */


        String[] hedges = {
                "Please tell me more", "Many of my patients tell me the same thing",
                "It is getting late, maybe we had better quit"
        };
        String qualifiers[] = {
                "Why do you say that", "You seem to think that",
                "So, you are concerned that"
        };


        // Start the program with a welcome message


        // user input for questions
        System.out.println("Good Day. What is your problem ? Enter your response here Q to quite");
        question = input.nextLine();


        while (!question.equals("quit")) {
            String output = ""; //output variable
            splitStr = question.split(" "); // split the string by each words

            if (question.contains("I") || question.contains("me") ||
                    question.contains("am") || question.contains("my")) {

                //hashset for the replacing strings
                HashMap<String,String> replace = new HashMap<String,String>();
                replace.put("I","you");
                replace.put("me","you");
                replace.put("my","your");
                replace.put("am","are");

                for(int i=0; i<splitStr.length; i++) {
                    if(splitStr[i].equalsIgnoreCase("I")) {
                        splitStr[i] = replace.get("my");
                    }
                    if(splitStr[i].equalsIgnoreCase("me")) {
                        splitStr[i] = replace.get("you");
                    }
                    if(splitStr[i].equalsIgnoreCase("my")) {
                        splitStr[i] = replace.get("your");
                    }
                    if(splitStr[i].equalsIgnoreCase("am")) {
                        splitStr[i].equalsIgnoreCase("are");
                    }
                }// End for

//put everything into one line (concatenate the strings )
                for (int i = 0; i <splitStr.length; i++){
                    output += splitStr[i] + " ";// split each items put them together. space for each words
                }


                int rand = r.nextInt(qualifiers.length);
                System.out.println(qualifiers[rand] + " " + output + "?");
            }
            System.out.println("Enter your response here  or \"quit\" to exit:");
            question = input.nextLine();

        }
        System.out.println("Thank You for running the system");
    }
    // method to create uppercase first letter of the name inputed

    public static String upperCase(String name) {
        name = name.substring(0, 1).toUpperCase() + name.substring(1);
        return name;
    }
}




