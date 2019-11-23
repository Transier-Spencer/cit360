import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        // Create a new executor to run the threads
        Executor executor = Executors.newCachedThreadPool();

        // Create new atomic variable
        AtomicInteger counter = new AtomicInteger(0);

        // Create array of recipes
        String[] recipes = {"French Toast", "Chicken Tenders", "Club Sandwich", "Biscuits and Gravy"};

        // Loop through recipe array
        for (String recipe : recipes) {
            // Create a new thread for each recipe
            Thread thread = new Thread(new Recipe(recipe));
            // Use the executor to execute each thread
            executor.execute(thread);
            // Increment atomic variable
            counter.incrementAndGet();
            // Print to console the atomic counter value
            System.out.println(counter);
        }
    }
}


