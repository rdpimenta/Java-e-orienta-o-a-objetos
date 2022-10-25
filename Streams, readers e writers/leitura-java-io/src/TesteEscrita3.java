import java.io.*;

public class TesteEscrita3 {
    public static void main(String[] args) throws IOException {
//        PrintStream ps = new PrintStream("lorem2.txt");
        PrintWriter ps = new PrintWriter("lorem2.txt");
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println("asfasdfsafdas dfs sdf asf assdß");

        ps.close();
    }
}
