/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson10multidimensionalarray;

/**
 *
 * @author SHAMALI
 */
public class Lesson10MultidimensionalArray {

    public static void main(String[] args) {
        int[][] a ={{1,2,3},{4,5,6},{7,8,9}};
        
        System.out.println("Length of row 1:"+a[0].length );
        
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
    
}
