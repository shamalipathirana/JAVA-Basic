/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson8methodparameters;

/**
 *
 * @author SHAMALI
 */
public class Lesson8MethodParameters {

    static void myMethod(String fname,int age){
        System.out.println("My name is "+fname+" and my age is "+age);
    }
    
    static int myMethod2(int x){
        
        return x+8;
    }
    
    static int myMethod3(int k,int y){
        return k*y;
    }
    public static void main(String[] args) {
        myMethod("shamali",25);
        
        System.out.println(myMethod2(5));
        
        System.out.println(myMethod3(2,6));
    }
    
}
