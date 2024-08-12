/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rudrprasad.rmi;


import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Shamal Prasad
 */
public class CSServer extends UnicastRemoteObject implements ICSServer{
    
    private static final long serialVersionUID = 01;
    int N = 1000;
    
    int[] Ids = new int[N];
    
    public CSServer() throws RemoteException {}
    
    public void Add_Ids(){
        for(int i = 0;i<N;i++){
            Ids[i] = i +(i+1) *10;
        }
    }
    
    @Override
    public int Findnumber(int num) throws RemoteException{
        for(int i = 0;i<N;i++){
            if(num==Ids[i]){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) throws RemoteException  {
        CSServer obj = new CSServer();
        obj.Add_Ids();
        
        try{
            
            Registry registry = LocateRegistry.createRegistry(8);
            registry.rebind("CSServer", obj);
            System.out.println("CS218 Server is running.");
        } catch (Exception e) {
            System.out.println("CS218 Server cannot run: " + e);
            
        }
        
    }
    
}
