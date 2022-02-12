import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * This class contains methods, properties and constructors for main method
 * @author boran
 * @version 1.0 25.07.2021
 */

public class HangHungryMan
{
    // properties
    private StringBuffer secretWord;
    private StringBuffer allLetters;
    private StringBuffer usedLetters;
    private int numberOfIncorrectTries;
    private int maxAllowedIncorrectTries;
    private StringBuffer knownSoFar;
    private String[] wordList = { "burger", "pizza", "salad", "steak", "ketchup", "mayonnaise", "meat", "soup", "fries", "chicken"};
    
    // constructors
    public HangHungryMan()
    {        
        maxAllowedIncorrectTries = 10;
        numberOfIncorrectTries = 0;
        chooseSecretWord();
        allLetters = new StringBuffer ("abcdefghijklmnopqrstuvwxyz");
        usedLetters = new StringBuffer ();
        knownSoFar = new StringBuffer(); 
        for ( int i = 0; i < secretWord.length(); i++)
        {
            knownSoFar.append(".");
        }
    }
    
    // methods
    
    public String getAllLetters()
    {
        return allLetters.toString();
    }

    public String getUsedLetters()
    {
        return usedLetters.toString();
    }
     
    public int getNumOfIncorrectTries()
    {
        return numberOfIncorrectTries;
    }
    
    public String getKnownSoFar()
    {
        return knownSoFar.toString();
    }
    
    public int getMaxAllowedIncorrectTries()
    {
        return maxAllowedIncorrectTries;
    }
    
    public boolean lost()
    {
        if (numberOfIncorrectTries >= maxAllowedIncorrectTries)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isGameOver()
    {
        return (lost() || won());
    }
    
    public boolean won()
    {
        return knownSoFar.toString().equals( secretWord.toString());
    }
    
    public int tryChar( char letter) 
    {
        int occurences;
        if( allLetters.indexOf(letter+"") == -1 ) 
        {
            return -1;
        }
        else 
        {
            if( usedLetters.indexOf(letter+"") == -1) 
            {
                occurences = 0;
                for( int i = 0; i < this.secretWord.length(); i++ ) 
                {
                    if( letter == this.secretWord.charAt(i) ) 
                    {
                        occurences++;
                        knownSoFar.replace(i, i+1, letter+"");
                    }
                }
                usedLetters.append(letter);
                if( occurences == 0 ) 
                {
                    numberOfIncorrectTries++;
                }
                if( isGameOver() == true )
                {
                    return -3;
                }
                return occurences;
            }
            else
            {
                return -2;
            }
        }
    }
    
    private void chooseSecretWord()
    {
        int randomIndex;
        randomIndex = (int) ((Math.random() * wordList.length) + 1);
        secretWord = new StringBuffer (wordList[randomIndex-1]);
    }
    
    public void newGame()
    {
        chooseSecretWord();
        numberOfIncorrectTries = 0;
        usedLetters = new StringBuffer();
        knownSoFar = new StringBuffer();
        for ( int i = 0; i < secretWord.length(); i++)
        {
            knownSoFar.append(".");
        }
    }
}



