/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudrprasad.deserializedemo;

/**
 *
 * @author s11219309
 */

public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public int SSN;
    public int number;
    public void mailCheck() {
    
        System.out.println("Mailing a check to"+ name + address);
    }
    
    @Override
    public String toString(){
        return SSN + name + address;
    }
}