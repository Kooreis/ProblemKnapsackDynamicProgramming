import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int n = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];