/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.rudrprasad.rmi;

/**
 *
 * @author Shamal Prasad
 */

import java.rmi.registry.*;
public class ClientApp {

    public static void main(String[] args) {
        
        
        
        try{
           Registry registry = LocateRegistry.getRegistry(8);
           ICSServer obj = (ICSServer) registry.lookup("CSServer");
            System.out.println(obj.Findnumber(54));
        } catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
