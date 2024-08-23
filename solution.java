```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        System.out.println("Enter the values of the items: ");
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println("Enter the weights of the items: ");
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        System.out.println("Enter the maximum weight: ");
        int W = scanner.nextInt();
        System.out.println("The maximum value that can be put in a knapsack of weight " + W + " is " + knapSack(W, weights, values, n));
    }

    static int knapSack(int W, int wt[], int val[], int n) {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
        for (i = 0; i <= n; i++) {
            for (w = 0; w <= W; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (wt[i - 1] <= w)
                    K[i][w] = Math.max(val[i - 1] + K[i - 1][w - wt[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }
        return K[n][W];
    }
}
```