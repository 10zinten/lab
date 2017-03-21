/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package replaceconsonants;
import java.util.Scanner;


public class ReplaceConsonants {
    StringBuffer sentence ;
    public static Scanner input = new Scanner(System.in);

    public void setter(StringBuffer s ) {
        this.sentence = s;
    }
    
    public void alterString() {
        String vowels = "aeiouAEIOU";
        
        for(int i = 0; i < this.sentence.length(); i += 1){
            int count = 0;
            char currentChar = this.sentence.charAt(i);
            System.out.println(++currentChar);
            for(int index = 0; index < vowels.length(); index += 1){
                if(!(vowels.charAt(index) == (currentChar))){
                    count++;
                }  
            }
            if(count == vowels.length())
                this.sentence.setCharAt(i, currentChar++);
        }
    }
    
    public StringBuffer getter(){
        return this.sentence;
    }
    
    public static void main(String[] args) {
        StringBuffer s;
        System.out.print("Input: ");
        s = new StringBuffer(input.next());
        ReplaceConsonants replaceConts = new ReplaceConsonants();
        replaceConts.setter(s);
        replaceConts.alterString();
        System.out.println("Output: " + replaceConts.getter());
    }
    
}
