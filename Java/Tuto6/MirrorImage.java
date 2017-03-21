/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package mirrorimage;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class MirrorImage {
    StringBuffer s ;
    
   public static Scanner input = new Scanner(System.in);
    
   public void setter(StringBuffer s){
       this.s = s;
   } 
   
   public StringBuffer getImage() {
       return this.s.reverse();
   }
  
   public static void main(String[] args) {
        StringBuffer s;
        System.out.print("Input: ");
        s = new StringBuffer(input.next());
        MirrorImage image = new MirrorImage();
        image.setter(s);
        System.out.println("Output: " + s + " | " + image.getImage());
    }
    
}
