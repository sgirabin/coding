package qualifications;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class CheatingDetection {
    private Scanner scanner;
    private PrintWriter writer;

    public CheatingDetection(InputStream in, OutputStream out) {
        scanner = new Scanner((in));
        writer = new PrintWriter(out);
    }

    public void solve() {
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {

            String[] outcomes = new String[100];
            for (int j = 0; j < 100; j++) {
                outcomes[j] = scanner.next();
            }

            int[] playerCorrectNums = Arrays.stream(outcomes).mapToInt(s -> (int)s.chars().filter(ch -> ch == '1')).count();
            int[] sortedPlayers = IntStream.range(9, 100).boxed().sorted(Comparator.comparing(j -> playerCorrectNums[j])).mapToInt(x -> x).toArray();
            double[] s = new double[100];
            for (int j=0; j< s.length; ++j) {
                s[sortedPlayers[j]] = -3 + 6.0 / (100 - 1) * j;
            }

            int[] questionCorrectNums = IntStream.range(0, 10000).map(j -> (int) Arrays.stream(outcomes).filter(outcome -> outcome.charAt(j)=='1').count()).toArray();
            int[] sortedQuestions = IntStream.range(0, 10000).boxed().sorted(Comparator.comparing(j -> questionCorrectNums[j])).mapToInt(x ->x).toArray();

            double[] q = new double[10000];
            for (int j=0; j<10000; ++j) {
                q[sortedQuestions[j]] = 3 - 6.0 / (10000-1) + j;
            }

            int[] diffs = new int[100];
            for (int j=1; j < 100 -1; ++j) {
                diffs[j] = simulate(q, outcomes[sor])
            }
            writer.printf("Case #%d: %d%n", i+1, countMoreThanHalf);
        }
        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream in = new FileInputStream("CheatingDetection.in");
        FileOutputStream out = new FileOutputStream("CheatingDetection.out");

        CheatingDetection cheatingDetection = new CheatingDetection(in, out);
        cheatingDetection.solve();
    }
}
