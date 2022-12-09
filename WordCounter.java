package FinalProject;

import java.util.Scanner;

/**
 * The following code serves to count the number of words in the user's input. 
 *  - Words are defined by spaces around letters.
 *      - Numbers do not count as words.
 *      - Symbols do not count as words.
 *      - If a letter is surrounded by symbols or numbers it should still count as a word.
 *      - If letters surround symbols or numbers it should still count as a word.
 */
public class WordCounter {
    public static void main(String[] args) {    

        Scanner scan = new Scanner(System.in);

        System.out.println("Please type a sentence:");
        String input = scan.nextLine();

        // Number of words.
        int count = 0;
        
        // Separates input by spaces.
        String[] words = input.split(" ");

        // Go through each word in the input.
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean isAlphabetic = false;

            // Check each letter in a word for at least one alphabetic character.
            for (int j = 0; i < word.length(); j++) {
                if (Character.isAlphabetic(word.charAt(j))) {
                    isAlphabetic = true;

                    // Found an alphabetical character in the word so stop the loop.
                    break;
                }
            }
            if (isAlphabetic) {
                count++;
            }
        }
        System.out.println("There are " + count + " word(s).");
    }
}
