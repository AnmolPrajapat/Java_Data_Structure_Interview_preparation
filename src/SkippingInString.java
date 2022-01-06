public class SkippingInString {
    public static void main(String[] args) {
        String s = "sababddas";

//        String ans = Skipping(s,"");
//        System.out.print(ans);
        String str = "sdnapplewwsappleaadgappleyry";
        System.out.print(SkipApple(str));

    }
    static String Skipping(String og , String ans){
       if(og.length()==0){
           return ans;
       }
       char ch = og.charAt(0);
       if(ch != 'a'){
           return Skipping(og.substring(1), ans+ch);
       }
       return Skipping(og.substring(1),ans);
        }
    static String SkipApple(String og){
        if(og.length()==0) return "";
        if(og.startsWith("apple")){
            return SkipApple(og.substring(5));
        }
        else
            return og.charAt(0) + SkipApple(og.substring(1));

    }
}
