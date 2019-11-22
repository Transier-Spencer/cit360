import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        // Create new atomic variable
        AtomicInteger counter = new AtomicInteger(0);

        // Create array of recipes
        String[] recipes = {"French Toast", "Chicken Tenders", "Club Sandwich", "Biscuits and Gravy"};

        // Loop through recipe array
        for (String recipe : recipes) {
            // Create a new thread for each recipe
            Thread thread = new Thread(new Recipe(recipe));
            // Start each thread
            thread.start();
            // Increment atomic variable
            counter.incrementAndGet();
            // Print to console the atomic counter value
            System.out.println(counter);
        }
    }
}
