package qualifications;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *  Google Code Jam 2020
 *  Qualification Round: Vestigium (7pts)
 *  Link: https://codingcompetitions.withgoogle.com/codejam/round/000000000019fd27/000000000020993c
 */

public class Vestigium {

    private Scanner scanner;
    private PrintWriter writer;

    public Vestigium(InputStream in, OutputStream out) {
        scanner = new Scanner(in);
        writer = new PrintWriter(out);
    }

    private void solve() {
        int T = scanner.nextInt();
        for (int i=0;i<T;i++) {
            int N = scanner.nextInt();
            int r = 0;
            int c = 0;
            int trace = 0;

            for (int row=0;row<N;row++) {
                for (int column=0;column<N;column++) {
                    int element = scanner.nextInt();
                    if (row==column) {
                        trace=trace+element;
                    }
                }
            }
            writer.printf("Case #%d: %d %d %d%n", i+1, trace, r, c);
        }
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) {
        Vestigium vestigium = new Vestigium(System.in, System.out);
        vestigium.solve();
    }


}
