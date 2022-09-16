import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = 2;

        while (true) {
            if (a == 1) {
                break;
            }

            if (a % b == 0) {
                a /= b;
                System.out.println(b);
            }
            else {
                b++;
            }
        }
    }
}