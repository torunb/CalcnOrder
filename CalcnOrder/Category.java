import java.util.ArrayList;

/**
 * A simple Java class!
*/
public class Category
{
    // Properties
    private String          name;
    private ArrayList<Food> dishes;
    
    // Constructors
    public Category(String name)
    {
        this.name = name;
        dishes = new ArrayList<Food>();
    }
    
    // Methods
    public String getName()
    {
        return name;
    }
    
    public ArrayList<Food> getDishes()
    {
        return dishes;
    }
    
    public void addDish(Food food)
    {
        dishes.add(food);
    }
    
    public void removeDish(Food food)
    {
        dishes.remove(food);
    }
    
}