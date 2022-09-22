import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BJ_1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = 10;
        int c;
        int[] d = new int[10];
        boolean e = false;

        if (a < 10) {
            System.out.println(a);
            e = true;
        }

        while (true) {
            c = a % b;
            a -= c;
            b *= 10;

            if (c >= 10) {
                while (true) {
                    c /= 10;

                    if (c <= 9) {
                        break;
                    }
                }
            }

            d[c]++;

            if (a == 0) {
                break;
            }
        }

        if (!e) {
            for (int i = 9; i >= 0; i--) {
                if (d[i] != 0) {
                    System.out.print(i);
                    d[i]--;
                    i++;
                }
            }
        }
    }
}