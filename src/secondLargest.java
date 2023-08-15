import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class secondLargest {
    public static int LargeSmallSum (int[] arr, int n){
        if(n<=3)
            return 0;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        even.add(arr[0]);

        for(int i = 1; i<n; i++){
            if(i%2==0){
                even.add(arr[i]);
            }
            else
                odd.add(arr[i]);
        }
        Collections.sort(even);
        Collections.sort(odd);

        return even.get(even.size()-2) + odd.get(odd.size()-2);
    }

    public static void main(String[] args) {
        int [] arr = {3,2,1,7,5,4};
        int n = arr.length;
        System.out.println(LargeSmallSum(arr,n));
    }
}
