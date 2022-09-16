import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = a; i <= b; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimeNumber(int a) {
        if (a == 1) {
            return false; // 소수 X
        }

        int b = (int) Math.sqrt(a);

        for (int i = 2; i <= b; i++) {
            if (a % i == 0) {
                return false; // 소수 X
            }
        }
        return true; // 소수 O
    }
}