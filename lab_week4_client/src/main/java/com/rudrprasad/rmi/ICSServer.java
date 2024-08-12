/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rudrprasad.rmi;

import java.rmi.*;

/**
 *
 * @author Shamal Prasad
 */
public interface ICSServer extends Remote{
    
    public int Findnumber(int num)throws RemoteException;
    
}
