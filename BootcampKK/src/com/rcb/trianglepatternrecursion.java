package com.rcb;

public class trianglepatternrecursion {

    public static void main(String[] args) {
        pattern1(3,0);
    }

    static void pattern1(int col, int row ){
          if(row<col){
              System.out.print('*');
              pattern1(col, row+1);
          }
          else if (col>0) {
              System.out.println(" ");
              pattern1(col - 1, 0);

          }
    }

}
