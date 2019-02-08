/** @author Thea Therese Rungstad 
 * PERFECTLY BALANCED
 * Oppgave fra 
 * https://www.reddit.com/r/dailyprogrammer/comments/afxxca/20190114_challenge_372_easy_perfectly_balanced/
 */

import java.util.Scanner;


/** Oppgaven fra dailyprogrammer:
 * 
 * "Given a string containing only the characters x and y, 
 * find whether there are the same number of xs and ys." 
 * 
 * */
class PerfectlyBalanced {

    public static void main(String []args) {
        String givenString = null;
        Scanner myCmnd = new Scanner(System.in);
        boolean positive = false;
        
        System.out.println("\n\nPERFECTLY BALANCED\n\nUndersøker om en setning har likt antall x og y i seg.\nOppgi en setning:");
        givenString = myCmnd.nextLine();

        myCmnd.close();

        givenString = givenString.replace("\u00a0", "");
        positive = balanced(givenString);

        if (positive) {
            System.out.println("\nSetningen '" + givenString + "' inneholder like mange x og y.\n");
        } else {
            System.out.println("\nSetningen '" + givenString + "' inneholder ikke like mange x og y.\n");
        }
    }

/**
 * @param givenString
 * @return boolean
 * 
 * Løper igjennom parameteren og teller opp xCount eller yCount ettersom
 * x eller y blir funnet.
 * 
 * Sammenlikner xCount og yCount, returnerer true dersom de er like, ellers false.
 * 
 */
    static boolean balanced(String givenString) {

        int xCount = 0;
        int yCount = 0;

        for (int i = 0; i < givenString.length(); i++) {
            
            if (givenString.charAt(i) == 'x') {
                xCount++;
            } else if (givenString.charAt(i) == 'y') {
                yCount++;
            }
        }

        if (xCount == yCount) {
            return true;
        }

        return false;
    }
}

