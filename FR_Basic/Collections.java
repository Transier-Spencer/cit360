// FR: Collections
// Author: Spencer Transier
// Date: 2019-06-26
// Class: CIT 360

import java.util.*;

public class Collections {

	public static void main(String[] args) {
	    /*
	     * LIST
	     * Properties: Unordered and duplicates don't matter.
	     * Expected Output: Every utensil that is added to the list should be printed out. 
	     */

	    // Create new list
	    List<String> kitchenUtensils = new ArrayList<>();

	    // Heading for List
	    System.out.println("LIST of kitchen utensils:");

	    // Add items to list
	    kitchenUtensils.add("Fork");
	    kitchenUtensils.add("Spoon");
	    kitchenUtensils.add("Knife");
	    kitchenUtensils.add("Spatula");
	    kitchenUtensils.add("Spoon");

	    // Print out items in list
	    for (String stringItem : kitchenUtensils) {
	      System.out.println(stringItem);
	    }

	    // Print separator
	    System.out.println("\n########\n########\n");

	    /*
	     * SET
	     * Properties: Unordered, but duplicates will be excluded
	     * Expected Result: Only one instance of "The Doctrine and Covenants" should be printed out because there is a duplicate. 
	     */

	    // Create new set
	    Set<String> bookList = new HashSet<>();

	    // Heading for set
	    System.out.println("SET of books:");

	    // Add items to set
	    bookList.add("The Book of Mormon");
	    bookList.add("The Bible");
	    bookList.add("The Doctrine and Covenants");
	    bookList.add("The Pearl of Great Price");
	    bookList.add("The Doctrine and Covenants");

	    // Print out items in set
	    for (String stringItem : bookList) {
	      System.out.println(stringItem);
	    }

	    // Print separator
	    System.out.println("\n########\n########\n");

	  /*
	     * MAP
	     * Properties: Used for matching one object with a specific value. Duplicates not allowed.
	     * Expected Result: Using the key of "Douglas", the integer 4 will be printed
	     */

	    // Create new map
	    HashMap<String, Integer> airplanes = new HashMap<>();

	    // Heading for map
	    System.out.println("MAP of Airplane Rankings:");

	    // Add items to map
	    airplanes.put("Boeing", 1);
	    airplanes.put("Airbus", 2);
	    airplanes.put("Embraer", 3);
	    airplanes.put("Douglas", 4);
	    airplanes.put("Lockheed", 5);

	    // Print out items in map
	    System.out.println(airplanes);

	    
	    // Print the ranking of a particular airplane manufacturer and header
	    System.out.println("\nRanking of Douglas: " + airplanes.get("Douglas"));

	    // Print separator
	    System.out.println("\n########\n########\n");

	    /*
	     * TREE
	     * Properties: Sorted in ascending order, but duplicates will be excluded
	     * Expected Result: The tree items will be sorted and any duplicates will be removed. 
	     */

	    // Create new tree
	    TreeSet<String> colors = new TreeSet<>();

	    // Heading for tree
	    System.out.println("TREE of colors:");

	    // Add items to tree
	    colors.add("Magenta");
	    colors.add("Red");
	    colors.add("Red");
	    colors.add("Blue");
	    colors.add("Green");

	    // Print out items in tree
	    for (String stringItem : colors) {
	      System.out.println(stringItem);
	    }

	    // Print separator
	    System.out.println("\n########\n########\n");

	  /*
	     * QUEUE
	     * Properties: Elements can be added and removed from the list. Uses First-In-First-Out, so items that are removed are removed from the beginning of the list and any elements that are added get added to the end. 
	     */

	    // Create new queue
	    Queue<Integer> ages = new LinkedList<>();

	    // Heading for queue
	    System.out.println("QUEUE of family member ages:");

	    // Add items to queue
	    ages.add(51);
	    ages.add(24);
	    ages.add(26);
	    ages.add(29);
	    ages.add(50);

	    // Print out items in queue
	    for (int intItem : ages) {
	      System.out.println(intItem);
	    }

	    // Add a new age to the queue
	    ages.add(2);

	    // View the new list. Expected result is that 2 is now at the bottom
	    System.out.println("\nNew list after adding 2:");
	    for (int intItem : ages) {
	      System.out.println(intItem);
	    }

	    // Display number of elements in queue
	    System.out.println("\nNumber of elements in queue: " + ages.size());

	    // Remove head element then display list again
	    ages.remove();
	    System.out.println("\nQueue after removing the head element:");
	    for (int intItem : ages) {
	      System.out.println(intItem);
	    }

	    // Print separator
	    System.out.println("\n########\n########\n");
	}
}
