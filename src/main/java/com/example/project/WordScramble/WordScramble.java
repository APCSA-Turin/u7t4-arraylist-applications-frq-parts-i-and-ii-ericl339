package com.example.project.WordScramble;
import java.util.ArrayList;
public class WordScramble {
  /** Scrambles a given word.
   *
   *  @param word  the word to be scrambled
   *  @return  the scrambled word (possibly equal to word)
   *
   *  Precondition: word is either an empty string or contains only uppercase letters.
   *  Postcondition: the string returned was created from word as follows:
   *  - the word was scrambled, beginning at the first letter and continuing from left to right
   *  - two consecutive letters consisting of "A" followed by a letter that was not "A" were swapped
   *  - letters were swapped at most once
   */
  public static String scrambleWord(String word) {
    if (word.equals("") || word.indexOf("A") == -1) {
      return word;
    }

    ArrayList<String> arr = new ArrayList<String>();
    for (int n = 0; n < word.length(); n++) {
      arr.add(word.substring(n, n + 1));
    }

    for (int i = 0; i < arr.size(); i++) {
      if (i==arr.size()-1){
        break;
      }
      if (arr.get(i).equals("A") && !(arr.get(i + 1).equals("A"))) {
        arr.set(i, arr.get(i + 1));
        arr.set(i + 1, "A");
        i++;
      }
    }
    String newWord = "";
    for (int a = 0; a < arr.size(); a++) {
      newWord+=(arr.get(a));
    }
    return newWord;
  }

  /** Modifies wordList by replacing each word with its scrambled
   *  version, removing any words that are unchanged as a result of scrambling.
   *
   *  @param wordList the list of words
   *
   *  Precondition: wordList contains only non-null objects
   *  Postcondition:
   *  - all words unchanged by scrambling have been removed from wordList
   *  - each of the remaining words has been replaced by its scrambled version
   *  - the relative ordering of the entries in wordList is the same as it was
   *    before the method was called
   */
  public static ArrayList<String> scrambleOrRemove(ArrayList<String> wordList) {
    for (int i = 0; i < wordList.size(); i++) {
      if (scrambleWord(wordList.get(i)).equals(wordList.get(i))) {
        wordList.remove(i);
        i--;
      } else {
        wordList.set(i, scrambleWord(wordList.get(i)));
      }
    }
    return wordList;
  }
}
