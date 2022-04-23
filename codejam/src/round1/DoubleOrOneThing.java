import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;



public class DoubleOrOneThing {
    
    private Scanner scanner;
    private PrintWriter writer;
    
    public DoubleOrOneThing(InputStream in, OutputStream out) {
        scanner = new Scanner((in));
        writer = new PrintWriter(out);
    }
    
    public void solve() {
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            String s = scanner.next();
            int length = s.length();
            
            StringBuffer sb = new StringBuffer();
            char current = s.charAt(length-1);
            boolean change = false;
            
            sb.append(current);
            for (int j=length-2;j>=0;j--) {
                char c = s.charAt(j);
                sb.append(c);
                if (c<current) {
                    sb.append(c);
                    change = true;
                } else if (c==current && change) {
                    sb.append(c);
                } else {
                    change = false;
                }
                current = s.charAt(j);
            }
            
            writer.printf("Case #%d: %s%n", i+1, sb.reverse());
        }
        writer.flush();
        writer.close();
    }
    
    public static void main(String[] args) {
        DoubleOrOneThing problem = new DoubleOrOneThing(System.in, System.out);
        problem.solve();
    }
    
}
