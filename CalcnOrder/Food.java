import java.util.ArrayList;

import javax.swing.ImageIcon;

import java.awt.Image;

/**
 * A simple Java class!
*/
public class Food
{
    // Properties
    String ingredients;
    private ImageIcon   photo;
    private String  name;
    private int     weight;
    private int     calories;
    private int     price;
    private int     priceInTokens;
    private boolean isGlutenFree;
    private boolean isSugarFree;
    private boolean isLactoseFree;
    private boolean isVegetarian;
    private boolean isVegan;
    private boolean protein;
    private boolean carbs;
    private boolean fat;
    private boolean cholesterol;
    private double ratings;


    
    // Constructors
    public Food(String ingredients, String name, ImageIcon image, int calories, int weight, int price, int priceInTokens, boolean gluten, boolean sugar, boolean lactose, boolean vegetarian, boolean vegan, boolean fat, boolean protein, boolean carbs, boolean cholesterol, double rating)
    {
        ratings=rating;
        this.ingredients = ingredients;
        this.name = name;
        this.calories = calories;
        this.weight = weight;
        this.price = price;
        this.priceInTokens = priceInTokens;
        photo = image;
        isGlutenFree =  gluten;
        isSugarFree =   sugar;
        isLactoseFree = lactose;
        isVegetarian =  vegetarian;
        isVegan =       vegan;
        this.protein = protein;
        this.fat = fat;
        this.cholesterol = cholesterol;
        this.carbs = carbs;
    }
    
    // Methods
    //getters
    public String getName()
    {
        return name;
    }
    
    public ImageIcon getPhoto()
    {
        return photo;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    public int getCalories()
    {
        return calories;
    }
    
    public int getPrice()
    {
        return price;
    }
    
    public int getPriceInTokens()
    {
        return priceInTokens;
    }
    
    public double getRating()
    {
        return ratings;
    }
    
    public boolean getLactoseFree()
    {
        return isLactoseFree;
    }
    
    public boolean getSugerFree()
    {
        return isSugarFree;
    }
    
    public boolean getGlutenFree()
    {
        return isGlutenFree;
    }
    
    public boolean getVegetarian()
    {
        return isVegetarian;
    }
    
    public boolean getVegan()
    {
        return isVegan;
    }
    
    public String getIngredients()
    {
        return ingredients;
    }
    
    //setters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void getPhoto(ImageIcon photo)
    {
        this.photo = photo;
    }
    
    public void setWeight(int weight)
    {
        this.weight = weight;
    }
    
    public void setCalories(int calories)
    {
        this.calories = calories;
    }
    
    public void setPrice(int price)
    {
        this.price = price;
    }
    
    public void setPriceInTokens(int priceInTokens)
    {
        this.priceInTokens = priceInTokens;
    }
    
    public void setRating(int rating)
    {
        ratings = rating;
    }
    
    public void setLactoseFree(boolean isLactoseFree)
    {
        this.isLactoseFree = isLactoseFree;
    }
    
    public void setSugerFree(boolean isSugarFree)
    {
        this.isSugarFree = isSugarFree;
    }
    
    public void setGlutenFree(boolean isGlutenFree)
    {
        this.isGlutenFree = isGlutenFree;
    }
    
    public void setVegetarian(boolean isVegetarian)
    {
        this.isVegetarian = isVegetarian;
    }
    
    public void getVegan(boolean isVegan)
    {
        this.isVegan = isVegan;
    }
    
    public boolean getProtein(){
        return protein;
    }

    public boolean getCarbs(){
        return carbs;
    }

    public boolean getCholestrol(){
        return cholesterol;
    }

    public boolean getFat(){
        return fat;
    }

    // public ArrayList<String> setIngredients()
    // {
    //     return ingredients;
    // }
    
    
    
    public void setRating(double rate)
    {
        ratings = rate;
    }


    
    //methods
    
    public void clearIngredients()
    {
        ingredients = "";
    }
}