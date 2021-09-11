package qualifications;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Indicium {

    private Scanner scanner;
    private PrintWriter writer;

    public Indicium(InputStream in, OutputStream out) {
        scanner = new Scanner(in);
        writer = new PrintWriter(out);
    }

    public void solve() {

    }

    public static void main(String[] args) {
        Indicium indicium = new Indicium(System.in, System.out);
        indicium.solve();
    }
}
