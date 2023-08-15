import java.util.Scanner;

public class decToHec {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int num = sc.nextInt();
            String result = Integer.toString(num, n).toUpperCase();
            System.out.println(result);
        }
    }
