/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Tiago TKG
 */
public class Cliente {
    
    public static void main(String[] args) throws Exception {
        
        try ( //Conectando ao servidor
                Socket socket = new Socket("localhost", 12345)) {
            System.out.println("Conexão Estabelecida");
            
            //Leitura basica para teste com threds
            Scanner teclado = new Scanner(System.in);
            teclado.nextLine();
        }
    }
    
}
