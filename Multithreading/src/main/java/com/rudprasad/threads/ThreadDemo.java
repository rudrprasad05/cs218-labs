/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudprasad.threads;

/**
 *
 * @author s11219309
 */

class ThreadDemo extends Thread {
    private Thread t;
    private final String threadName;
    PrintDemo PD;
    ThreadDemo( String name, PrintDemo pd){
        threadName = name;
        PD = pd;
    }
    @Override
    public void run() {
        synchronized(PD) {
            PD.printCount();
        }
        System.out.println("Thread " + threadName + " exiting.");
    }
    @Override
    public void start (){
        System.out.println("Starting " + threadName );
        if (t == null){
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
