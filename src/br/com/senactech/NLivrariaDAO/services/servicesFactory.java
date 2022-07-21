/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.NLivrariaDAO.services;

/**
 *
 * @author Marcia
 */
public class servicesFactory {
    private static clienteServices ClienteServices = new clienteServices();
    
    public static clienteServices getclienteServices(){
        return ClienteServices;
    }
    
    
}
