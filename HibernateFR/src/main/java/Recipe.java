import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "recipes_table")
public class Recipe {

    // Create ID column and auto-generate IDs
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "incrementor")
    @GenericGenerator(name = "incrementator", strategy = "increment")
    private Integer id;

    // Getter - ID
    public Integer getId() {
        return id;
    }

    // No Setter needed for ID because ID's are auto-generated

    // Create recipeName column
    @Column(name = "recipeName")
    private String recipeName;

    // Getter - Recipe Name
    public String getName() {
        return recipeName;
    }

    // Setter - Recipe Name
    public void setName(String recipeName) {
        this.recipeName = recipeName;
    }

    // Method for printing object
    public String toString() {
        return "Retrieved from Database:\nID: " + Integer.toString(id) + "\nRecipe Name: " + recipeName;
    }

}

