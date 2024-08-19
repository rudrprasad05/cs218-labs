/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudprasad.threads;
/**
 *
 * @author s11219309
 */
public class TestThread {
    public static void main(String args[]) {
        PrintDemo PD = new PrintDemo();
        ThreadDemo T1 = new ThreadDemo( "Thread - 1 ", PD );
        ThreadDemo T2 = new ThreadDemo( "Thread - 2 ", PD );
        T1.start();
        T2.start();
        // wait for threads to end
        try {
            T1.join();
            T2.join();
        } catch( InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}
