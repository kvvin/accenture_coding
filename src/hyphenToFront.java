public class hyphenToFront {
    public static String hyphen(String str){
        String res = "";
        for(int i=0; i<str.length();i++){
            if(str.charAt(i) =='-'){
                res = str.charAt(i)+res;
            }
            else
                res = res+str.charAt(i);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "String-Compare";
        System.out.println(hyphen(str));
    }

}
