import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
public class HelloGoodbye {
    public static void main(String[] args) {
        //name1
        String name1;
        //name2
        String name2;
        //input for name 1
        StdOut.println("Name 1:");
        name1 = StdIn.readString();
        //input for name 2
        StdOut.println("Name 2:");
        name2 = StdIn.readString();
        //outputHello "Hello name1 and name2."
        StdOut.println("Hello " + name1 + " and " + name2 + "." );
        //outputGoodbye "Goodbye name2 and name1."
        StdOut.println("Goodbye " + name2 + " and " + name1 + "." );
    }
}
