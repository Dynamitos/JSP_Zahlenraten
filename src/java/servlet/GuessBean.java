/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

/**
 *
 * @author Sabrina
 */
public class GuessBean
{
    private boolean guessRight;
    
    public GuessBean()
    {
    }

    public boolean isGuessRight()
    {
        return guessRight;
    }

    public void setGuessRight(boolean guessRight)
    {
        this.guessRight = guessRight;
    }

    public GuessBean(boolean guessRight)
    {
        this.guessRight = guessRight;
    }
    
    
}
