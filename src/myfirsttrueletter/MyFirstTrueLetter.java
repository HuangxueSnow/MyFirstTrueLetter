/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirsttrueletter;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class MyFirstTrueLetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in);
        for(int i = 0; i < 1; i++){
             String input = reader.next();
             String s = MyTrueLetter(input);
             System.out.println(s);
        }
    }

    private static String MyTrueLetter(String input) {
        String output = "";
        char[] in =input.toCharArray();
        int i,j;
        int checknumber;
        for(i = 0; i < input.length(); i++){
            checknumber = 0;
            for(j = i+1; j < input.length(); j++){
                if (Character.isAlphabetic(in[i])) {
                    if(in[i] == in[j]){
                        checknumber++;
                        in[j] = 0;
                    }
                }
            }
            if(checknumber == 0){
                if (Character.isAlphabetic(in[i]))
                    output+=in[i];
            }
            checknumber = 0;
            if(output.length() == 1)
                break;
        }
        return output;
    }
    
}
