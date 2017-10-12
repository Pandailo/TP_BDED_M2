/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author Yann
 */
public interface CompteFactory extends Remote
{
    public Compte getCompte(int num) throws RemoteException;
    public int createAccount(double solde)throws RemoteException;
}
