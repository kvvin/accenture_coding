import java.util.Scanner;

public class ratCountHouse {

    public static int ratCount(int [] arr, int r, int unit, int n){
        if(n==0)
            return -1;
        int sum = 0;
        int count = 0;
        int foodReq = r*unit;
        for(int i = 0; i<n ;i++){
            sum += arr[i];
            count++;
            if(sum>=foodReq)
                break;
        }
        if(sum<foodReq)
            count = 0;
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(ratCount(arr,r,unit,n));
    }
}
