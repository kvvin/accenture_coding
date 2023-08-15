import java.util.Arrays;

public class product {

    public static int productSumPair(int[] arr, int sum){
        int n = arr.length;
        if(n<=2)
            return -1;
        int check;
        Arrays.sort(arr);
        check = arr[0] + arr[1];
        if(check <= sum){
            return arr[0] * arr[1];
        }
        else return 0;
    }
    public static void main(String[] args) {

        int[] arr = {9, 8, 3, -7, 3, 9};
        int sum = 4;
        System.out.println(productSumPair(arr,sum));

    }
}
