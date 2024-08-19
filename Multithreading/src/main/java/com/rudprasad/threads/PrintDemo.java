/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudprasad.threads;

/**
 *
 * @author s11219309
 */
class PrintDemo {
    public void printCount(){
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Counter --- " + i );
            }
        } 
        catch (Exception e) {
            System.out.println("Thread interrupted.");
        }
    }
}
