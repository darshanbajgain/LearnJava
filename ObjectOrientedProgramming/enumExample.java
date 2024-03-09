import java.util.Scanner;

public class enumExample {

    /*
     * 
     * In Java, the enum keyword is used to define an enumeration, which is a
     * special type representing a group of constants.
     * An enumeration can contain a fixed set of predefined values, and each value
     * is typically represented as a named constant.
     * 
     * To create an enum, use the enum keyword (instead of class or interface), and
     * separate the constants with a comma.
     * Note that they should be in uppercase letters:
     * 
     *
     * enum Level {
     * LOW,
     * MEDIUM,
     * HIGH
     * }
     * 
     * 
     */

    // define enum called Days of week
    enum daysOfWeek {
        // Define constants representing days of the week
        SUNDAY,
        MONDAY,
        TUEDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

    public static void main(String[] args) {

        daysOfWeek today = daysOfWeek.SATURDAY;
        System.out.println("Today is " + today); // MONDAY

        // or other way to get value from enum
        daysOfWeek myday = daysOfWeek.values()[4];
        // at 4 index we have THURSDAY
        System.out.println("My day is " + myday); // THURSDAY

        System.out.println("Getting days by using enum by entering user gven number of day.");
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the day of week in number (1-7): ");
        int dayNumber = inp.nextInt();

        // validate dayNumber 1st
        if (dayNumber < 1 || dayNumber > 7) {
            System.out.println("Please enter the valid days number between 1-7.");
        }

        else {

            // Convert the user input to an index (0-6) for the enum
            int index = dayNumber - 1;
            // Get the corresponding day of the week from the enum based on the index
            daysOfWeek newday = daysOfWeek.values()[index];

            // Identify the day of the week using a switch statement
            String yourday;
            switch (newday) {
                case SUNDAY:
                    yourday = "Sunday";
                    break;
                case MONDAY:
                    yourday = "Monday";
                    break;
                case TUEDAY:
                    yourday = "Tuesday";
                    break;
                case WEDNESDAY:
                    yourday = "Wednesday";
                    break;
                case THURSDAY:
                    yourday = "Thursday";
                    break;
                case FRIDAY:
                    yourday = "Friday";
                    break;
                case SATURDAY:
                    yourday = "Saturday";
                    break;
                default:
                    yourday = "Invalid";
                    break;

            }
             // Print the identified day of the week
             System.out.println("The day of the week corresponding to the input number is: " + yourday);

        }
                   
        inp.close();
    }


}
