public class FastestRunner {
    /*
  EECS 1510 Object-Oriented Programming
  Project 6 Part 5
  Written by Christopher Pucko
  Uses two given arrays to print a list of names and their corresponding race times.
  This uses the printf() function to space the names and times evenly.
*/
    public static void main(String[] args){
        int fastestIndex;
        int fastestTime;
        int hours;
        int minutes;

        final int numRunners =16;
        String[] names ={"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt",
                "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel",
                "Neda","Aaron", "Kate"};
        int[] times ={341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
                393, 299,343, 317, 265};

        System.out.println("Name      Time(Minutes)");
        System.out.println("_______________________");
        for (int i = 0; i <= numRunners-1; i++){
            System.out.printf("%-10s - %4d\n",names[i],times[i]);
        }
        fastestIndex = returnsFastestIndex(times);
        fastestTime = times[fastestIndex];
        hours = fastestTime / 60;
        minutes = fastestTime % 60;

        System.out.println("The fastest runner is " + names[fastestIndex]);
        System.out.println("They had a time of " + hours + " hours and " + minutes + " minutes.");

    }

    public static int returnsFastestIndex(int[] times){
    //Goes through each time in the times[] array, and returns the lowest time's array index.
        int tempLowest;
        int tempLowestIndex;

        tempLowest = 999;
        tempLowestIndex = 0;

        for (int i = 0; i <= times.length-1; i++){
            if (times[i] < tempLowest){
                tempLowestIndex = i;
                tempLowest = times[i];
            }
        }
        return tempLowestIndex;
    }
}
