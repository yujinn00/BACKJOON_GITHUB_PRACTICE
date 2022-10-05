import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BJ_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] c = new int[a];
        int sum = 0;
        int min = 300001;
        int print = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < a; i++) {
            c[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                if (i != j) {
                    for (int k = 0; k < a; k++) {
                        if (j != k && k != i) {
                            sum = c[i] + c[j] + c[k];

                            if (sum > b) {
                                continue;
                            }

                            if (min > b - sum) {
                                min = b - sum;
                                print = sum;
                            }
                        }
                    }
                }
            }
        }

        System.out.println(print);
    }
}