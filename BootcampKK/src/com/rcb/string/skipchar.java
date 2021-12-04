package com.rcb.string;

public class skipchar {
    public static void main(String[] args) {
      skip("abbadbag", "");
    }

    static void skip(String up, String p){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

            if(ch == 'a'){
                  skip(up.substring(1), p);
            }
            else {
              skip(up.substring(1), p+ch);
            }

    }
}
