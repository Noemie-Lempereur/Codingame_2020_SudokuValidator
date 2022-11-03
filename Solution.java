import java.util.*;

import java.io.*;
import java.math.*;
import java.sql.JDBCType;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        boolean result =true;
        int [][] grille;
        grille=new int [9][9];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int n = in.nextInt();
                if(n<1||n>9){
                    System.out.println(false);
                    return;
                }
                grille[i][j]=n;
            }
        }
        int [] occurence;
        occurence=new int [9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                occurence[grille[i][j]-1]++;
            }
            for (int j = 0; j < 9; j++) {
                if(occurence[grille[i][j]-1]!=(1+i)){
                    System.out.println(false);
                    return;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                occurence[grille[j][i]-1]++;
            }
            for (int j = 0; j < 9; j++) {
                if(occurence[grille[j][i]-1]!=(10+i)){
                    System.out.println(false);
                    return;
                }
            }
        }

        
        for(int g=0;g<7;g=g+3){
        for(int k=0;k<7;k=k+3){
            int [] occurence2;
            occurence2=new int [9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                occurence2[grille[i+g][j+k]-1]++;
            }
        }
         for (int j = 0; j < 9; j++) {
                
                if(occurence2[j]!=1){
                    System.out.print(false);
                    return;
                }
            }
        }
        }
        System.out.println(true);
    }
}
