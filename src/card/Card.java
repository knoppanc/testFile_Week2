/*
*Name:  Jonathan Knopp Anchieta
*Assignment:  [assignment name]
*Program: PROG24178 Object Oriented Programming 2 Java
*Date:  [assignment due date here]
*   
*Description:
*[program description in your own words]
*
*/

package card;

/**
 *
 * @author User
 */
public class Card {

    private String suit;
    private int nvalue;
    
    public Card(String suit, int value){
        this.suit = suit;
        this.nvalue = nvalue;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        if (suit.equals("Hearts")||suit.equals("Diamond")||suit.equals("Aces")
                ||suit.equals("Spades")) {
            
        }
        this.suit = suit;
    }

    public int getValue() {
        return nvalue;
    }

    public void setValue(int value) {
        if (value >= 0 || value <= 10) {
            this.nvalue = value;
        }
        
    }
    
}
