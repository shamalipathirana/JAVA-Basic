/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson2typecasting;

/**
 *
 * @author SHAMALI
 */
public class Lesson2TypeCasting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int myNum=5;
         double myNum1 = myNum;
         
         System.out.println(myNum1);
         
         
         double myNum2=9.78d;
         int myNum3 = (int) myNum2;
         System.out.println(myNum3);
    }
    
}
