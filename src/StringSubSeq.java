import java.util.ArrayList;

public class StringSubSeq {
    public static void main(String[] args) {
//        String s = "abc";
//        ArrayList<String>  list = new ArrayList<>();
//        subSeqINArg(" ","abc",list);
//        System.out.print(list);
        System.out.print(subSeqArgInBody("","abc"));
    }
    static void subSeqINArg(String p, String un, ArrayList list){
        if(p.isEmpty() && un.isEmpty()) return;
        if(un.isEmpty()){
            list.add(p);
            return ;
        }
        char ch = un.charAt(0);
        subSeqINArg(p+ch , un.substring(1),list);
        subSeqINArg(p,un.substring(1),list);
    }
    static ArrayList<String> subSeqArgInBody(String p, String un){
        if(un.isEmpty()){
            ArrayList<String> listt = new ArrayList<>();
            listt.add(p);
            return listt;
        }
        char ch = un.charAt(0);
        ArrayList<String> left = subSeqArgInBody(p+ch, un.substring(1));
        ArrayList<String> right = subSeqArgInBody(p, un.substring(1));

        left.addAll(right);
        return left;
    }
}
