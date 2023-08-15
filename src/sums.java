public class sums {
    public static int differenceOfSum(int n, int m){
        int sum1 = 0 ,sum2=0;
        for(int i =1; i<=m; i++){
            if(i%n == 0){
                sum1+= i;
            }
            else
                sum2+=i;
        }
        return Math.abs(sum2-sum1);
    }
    public static void main(String[] args) {
        int n = 3;
        int m = 10;
        System.out.println(differenceOfSum(n,m));
    }
}
