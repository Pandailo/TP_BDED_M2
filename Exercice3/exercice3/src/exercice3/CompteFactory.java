/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercice3;

import java.sql.Connection;

/**
 *
 * @author Yann
 */
public interface CompteFactory extends UnicastRemoteObject
{
    public Compte getCompte(int num);
    public Compte createCompte(int num,Connection con);
}
