package com.rcb.permuntationrecursion;

public class perm {
    public static void main(String[] args) {
         String q = "abc";
         permuntations("", q);
    }

    static void permuntations(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for (int i=0; i<= p.length(); i++){
            String f = p.substring(0,i);
            String s = p.substring(i, p.length());
            permuntations(f+ch+s, up.substring(1));

        }
    }
}
