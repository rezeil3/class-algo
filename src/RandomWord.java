import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {

        //Accepts a line of words
        String wordsString = StdIn.readLine();

        //Converts the line into an array separated by space
        String[] wordsArray = wordsString.split(" ");

        //Variable for the number of words
        int n = wordsArray.length;

        //Variable for the winning word
        String champion = null;

        //Knuth's method using bernoulli as the randomizer
        for (int i = 0; i < n; i++) {
            double p = 1 / ((double) i + 1);
            //Changes the winning word when returned true
            if (StdRandom.bernoulli(p)) {
                champion = wordsArray[i];
            }
        }
        //Prints out the winning word
        StdOut.println(champion);
    }
}