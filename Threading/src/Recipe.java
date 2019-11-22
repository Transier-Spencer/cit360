import java.util.*;

public class Recipe implements Runnable {

    // Create variables for recipe name, the time for the thread, and a random number object
    String recipeName;
    Integer threadTime;
    Random randomNumber = new Random();

    // Constructor for Recipe objects
    public Recipe(String aRecipeName) {
        recipeName = aRecipeName;
        // Calculates and saves a random number for the thread sleep time
        threadTime = randomNumber.nextInt(10000);
    }

    // Create runnable
    @Override
    public void run() {
        try {
            // Print to console the name of the thread (recipe name) and time that it is sleeping
            System.out.printf("%s is sleeping for %d\n", recipeName, threadTime);
            // Sleep the thread for the calculated random time
            Thread.sleep(threadTime);
            // Print to console when the thread is finished
            System.out.printf("%s is done\n", recipeName);
        } catch (Exception e) {
        }
    }
}

