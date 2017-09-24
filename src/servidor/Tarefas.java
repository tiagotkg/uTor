/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Tiago TKG
 */ 
public class Tarefas implements Runnable {
    final private Socket socket;

    public Tarefas(Socket socket) {
            this.socket = socket;
    }

    public void run() {

            try {
                
                //Listando o socket criado
                System.out.println("Distribuindo as tarefas para o cliente " + socket);
                
                //Recebendo comando do cliente
                Scanner entradaCliente = new Scanner(socket.getInputStream());

                while (entradaCliente.hasNextLine()) {
                        String comando = entradaCliente.nextLine();
                        System.out.println(comando);
                }

                entradaCliente.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

    }
}
