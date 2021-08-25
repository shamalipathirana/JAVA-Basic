/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8methodoverloading;

/**
 *
 * @author SHAMALI
 */
public class Lesson8MethodOverloading {

    static int plusMethod(int x,int y){
        return x+y;
    }
    static double plusMethod(double x,double y){
        return x+y;
    }
    public static void main(String[] args) {
      int myNum1=plusMethod(8,9);
      double myNum2=plusMethod(6.7,2.6);
      
      System.out.println(myNum1);
      System.out.println(myNum2);
    }
    
}
