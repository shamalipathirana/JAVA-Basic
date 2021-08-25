/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson9arrays;

/**
 *
 * @author SHAMALI
 */
public class Lesson9Arrays {

    public static void main(String[] args) {
        int[] marks = new int[100];
        int[] age={12,13,14,15,16};
        //System.out.println(age[0]);
        
        for(int i=0;i<age.length;i++){
            System.out.println(age[i]);
            
        System.out.println("Using for each loop");
        for(int a:age){
            System.out.println(a);
        }
        }
    }
    
}
