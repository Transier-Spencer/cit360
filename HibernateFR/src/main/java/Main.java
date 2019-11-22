import javax.persistence.*;

public class Main {
    public static void main(String[] args) {

        // Create new session
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");

        // Create Client object and add data
        Client client = new Client();
        client.setId(1);
        client.setName("Wadsworth Bakery");

        // Create Recipe object and add data
        Recipe recipe1 = new Recipe();
        recipe1.setName("French Toast");

        // Create new instance of EntityManager to begin working with the database
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Start the transaction
        entityManager.getTransaction().begin();

        // Store the Client and Recipe objects in the database
        entityManager.persist(client);
        entityManager.persist(recipe1);

        // Manually commit the changes so that they are saved
        entityManager.getTransaction().commit();

        // Demonstrate reading from the database
        EntityManager entityManager1 = entityManagerFactory.createEntityManager();

        // Find the object with a primary key of 1
        Recipe recipe2 = entityManager1.find(Recipe.class, 1);

        // Print out the objects after retrieving them from database
        System.out.println(recipe2.toString());

        // Close the transaction
        entityManagerFactory.close();
    }
}
