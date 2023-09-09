public class CheckPlaindromicString {
    public static boolean checkPalindrome(String str){
        String ns = str.toLowerCase().replaceAll("[^A-Za-z0-9]","");
        for(int i=0; i<str.length()/2; i++){
            if(ns.charAt(i) != ns.charAt(str.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "ABCDCBA";
        System.out.println(checkPalindrome(str));
    }
}

