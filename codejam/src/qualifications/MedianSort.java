package qualifications;

import java.io.*;
import java.util.Scanner;

public class MedianSort {

    private Scanner scanner;
    private PrintWriter writer;

    public MedianSort(InputStream in, OutputStream out) {
        scanner = new Scanner((in));
        writer = new PrintWriter(out);
    }

    public void solve() {
        int T = scanner.nextInt();
        int N = scanner.nextInt();;
        int Q = scanner.nextInt();

        for (int i=0; i<T; i++) {
            int[] arr = new int[N];
            for (int j=0; j<N; j++) {

            }
            writer.printf("Case #%d: %d", i, i);
        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream in = new FileInputStream("MedianSort.in");
        FileOutputStream out = new FileOutputStream("MedianSort.out");

        MedianSort medianSort = new MedianSort(in, out);
        medianSort.solve();
    }
}
