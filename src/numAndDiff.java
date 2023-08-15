import java.util.Scanner;

public class numAndDiff {

    public static int findCount(int[] arr, int num, int dif){
        int n = arr.length;
        int count = 0;
        if(arr.length == 0)
            return -1;
        for(int i = 0; i<n; i++){
            if(Math.abs(num - arr[i])<= dif)
                count++;
        }
        return count;

    }
    public static void main(String[] args) {
        int[] arr = {12, 3, 14, 56, 77, 13};
        int num = 13;
        int diff = 2;
        System.out.println (findCount (arr, num, diff));
    }
}
