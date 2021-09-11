package qualifications;

import java.io.*;
import java.util.Scanner;

public class MoonAndUmbrellas {

    private Scanner scanner;
    private PrintWriter writer;

    public MoonAndUmbrellas(InputStream in, OutputStream out) {
        scanner = new Scanner((in));
        writer = new PrintWriter(out);
    }

    public void solve() {
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int X = scanner.nextInt();
            int Y = scanner.nextInt();
            String S = scanner.next();

            int totalCost = 0;
            char last = S.charAt(0);
            for (int j = 1; j < S.length(); j++) {
                if (S.charAt(j) == 'J' && last == 'C') {
                    totalCost = totalCost + X;
                } else if (S.charAt(j) == 'C' && last == 'J') {
                    totalCost = totalCost + Y;
                }
                if (S.charAt(j) != '?') {
                    last = S.charAt(j);
                }
            }
            writer.printf("Case #%d: %d%n", i + 1, totalCost);
        }
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream in = new FileInputStream("MoonsAndUmbrellas.in");
        FileOutputStream out = new FileOutputStream("MoonsAndUmbrellas.out");

        MoonAndUmbrellas moonAndUmbrellas = new MoonAndUmbrellas(in, out);
        moonAndUmbrellas.solve();
    }
}
