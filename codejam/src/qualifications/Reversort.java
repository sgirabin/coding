package qualifications;

import java.io.*;
import java.util.Scanner;

public class Reversort {

    private Scanner scanner;
    private PrintWriter writer;

    public Reversort(InputStream in, OutputStream out) {
        scanner = new Scanner((in));
        writer = new PrintWriter(out);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public void solve() {
        int T = scanner.nextInt();

        for (int i=0; i<T; i++) {
            int N = scanner.nextInt();;

            int[] arr = new int[N];
            for (int j=0; j<N; j++) {
                arr[j] = scanner.nextInt();
            }

            int swap = 0;
            for (int j=0; j<N-1; j++) {
                int minValue = arr[j];
                int minIndex = j;
                for (int k=j; k<N; k++) {
                    minValue = Math.min(minValue, arr[k]);
                    if (minValue==arr[k]) {
                        minIndex=k;
                    }
                }
                swap = swap + ( ( minIndex - j) + 1);
                reverse(arr, j, minIndex);
            }

            writer.printf("Case #%d: %d%n", i+1, swap);
        }

        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream in = new FileInputStream("Reversort.in");
        FileOutputStream out = new FileOutputStream("Reversort.out");

        Reversort reversort = new Reversort(in, out);
        reversort.solve();
    }
}
