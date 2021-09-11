package qualifications;

import java.io.*;
import java.util.Scanner;

public class ReversortEngineering {

    private Scanner scanner;
    private PrintWriter writer;

    public ReversortEngineering(InputStream in, OutputStream out) {
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
            int C = scanner.nextInt();

            int[] arr = new int[N];
            for (int j=0; j<N; j++) {
                arr[j] = j+1;
            }

            int max = (N*(N+1))/2;
            if (C > max || C < N-1) {
                writer.printf("Case #%d: IMPOSSIBLE%n", i+1);
            } else {
                int swap = 0;
                for (int j=0; j<N-1 && swap < C; j++) {
                    int maxValue = arr[j];
                    int maxIndex = j;
                    for (int k=j; k<N; k++) {
                        maxValue = Math.max(maxValue, arr[k]);
                        if (maxValue==arr[k]) {
                            maxIndex=k;
                        }
                    }
                    swap = swap + ( ( maxIndex - j) + 1);
                    reverse(arr, j, maxIndex);
                }

                writer.printf("Case #%d: ", i+1);
                for (int j=0;j<N;j++) {
                    writer.printf("%d ", arr[j]);
                }
                writer.println();;
            }

        }

        writer.flush();
        writer.close();
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream in = new FileInputStream("ReversortEngineering.in");
        FileOutputStream out = new FileOutputStream("ReversortEngineering.out");

        ReversortEngineering reversortEngineering = new ReversortEngineering(in, out);
        reversortEngineering.solve();
    }
}
