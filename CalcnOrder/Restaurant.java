import java.util.ArrayList;

import javax.swing.ImageIcon;

import java.awt.Image;

/**
 * A simple Java class!
*/
public class Restaurant
{
    // Properties
    private String              name;
    private String              address;
    private ArrayList<Category> categories;
    
    // Constructors
    public Restaurant(String name, String address)
    {
        this.name = name;
        this.address = address;
        categories = new ArrayList<Category>();
    }
    
    // getters
    public String getName()
    {
        return name;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public ArrayList<Category> getCategories()
    {
        return categories;
    }
    
    public Food getFood(String foodName)
    {
        Food food = null;
        
        for (Category a : categories) 
        {
            for (Food b : a.getDishes()) 
            {
                if(b.getName() == foodName)
                {
                    food = b;
                }
            }
        }
        
        return food;
    }
    
    public Food[] getRandomFoods(){
        
        Food[] randomFoods = new Food[4];
        
        for(int i = 0; i < 4; i++){
            int iRandom = (int) (Math.random() * categories.size() - 1);
            int jRandom = (int) (Math.random() * categories.get(iRandom).getDishes().size() - 1);
            Food temp = categories.get(iRandom).getDishes().get(jRandom);
            randomFoods[i] = temp;
        }
        
        return randomFoods;
        
    }
    
    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setAdress(String address)
    {
        this.address = address;
    }
    
    //methods
    public void addCategory(String name)
    {
        categories.add(new Category(name));
    }
    
    public void removeCategory(String name)
    {
        for (int i = 0; i < categories.size(); i++) 
        {
            if(categories.get(i).getName() == name)
            {
                categories.remove(i);
            }
        }
    }
    
    public void addFood(String ingredients, String name, ImageIcon image, int calories, int weight, int price, int priceInTokens, boolean gluten, boolean sugar, boolean lactose, boolean vegetarian, boolean vegan,boolean fat, boolean protein, boolean carbs, boolean cholesterol,  String categoryName, double rate)
    {
        for(Category a: categories)
        {
            if(a.getName() == categoryName)
            {
                a.addDish(new Food(ingredients, name, image, calories, weight, price, priceInTokens, gluten, sugar, lactose, vegetarian, vegan, fat, protein, carbs, cholesterol, rate));
            }
        }
    }
    
    public void removeFood(String foodName)
    {
        for(Category a: categories)
        {
            
            for(int i = 0; i < a.getDishes().size(); i++)
            {
                if(a.getDishes().get(i).getName() == foodName)
                {
                    a.getDishes().remove(a.getDishes().get(i));
                }
            }
        }
    }
    
    public boolean contains(String foodName)
    {
        boolean result = false;
        
        for (Category a : categories) 
        {
            for (Food b : a.getDishes()) 
            {
                if(b.getName() == foodName)
                {
                    result = true;
                }
            }
        }
        
        return result;
    }
}