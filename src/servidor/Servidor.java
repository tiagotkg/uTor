/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Tiago TKG
 */
public class Servidor {
    
    public static void main(String[] args) throws Exception {
        
        //Intanciando servidor para aceitar conexoes
        System.out.println("---- Iniciando Servidor ----");
        ServerSocket servidor = new ServerSocket(12345);

        //Aceitando multiplas conexoes
        while (true) {
            Socket socket = servidor.accept();    
            System.out.println("Aceitando novo cliente na porta " + socket.getPort());
        }
        
        
    }
    
}
