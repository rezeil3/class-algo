import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Scanner;

public class RandomWord {
    public static void main(String[] args) {
        String[] wordsArray = {"a", "b", "c"};
            //String wordsString = StdIn.readString();
            //String[] wordsArray = wordsString.split(" ");
            int n = wordsArray.length;
            String champion = null;

            for (int i = 0; i < n; i++) {
                double p = 1.0 / ((double) i + 1.0);
                if (StdRandom.bernoulli(p)) {
                   champion = wordsArray[i];
                }
            }
            StdOut.println(champion);
    }
}

