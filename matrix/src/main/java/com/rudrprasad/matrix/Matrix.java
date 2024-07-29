/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.rudrprasad.matrix;

/**
 *
 * @author s11219309
 */
public class Matrix {

    public static void main(String[] args) {
        Integer rows;
        Integer cols;
        Boolean flag = true;
        Integer[][] matrix = {
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        
        rows = matrix.length;
        cols = matrix[0].length;
        
        if(rows != cols){
            System.out.println("Matrix should be sqaure");
            return;
        }
        else{
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++){

                    if(i == j && matrix[i][j] != 1){
                        flag = false;
                        break;
                    }
                    if(i != j && matrix[i][j] != 0){
                        flag = false;
                        break;
                    }
                }
            }
        }
        
        if(flag){
            System.out.println("Matrix is identity");
        }
        else{
            System.out.println("Matrix is not identity");
        }
        
    }
}
