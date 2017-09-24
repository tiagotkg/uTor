/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Tiago TKG
 */
public class Servidor {
    
    public static void main(String[] args) throws Exception {

        System.out.println("---- Iniciando Servidor ----");
        ServerSocket servidor = new ServerSocket(12345);

        //Criando pool de threads para reutilização
        ExecutorService threadPool = Executors.newCachedThreadPool(); //newCachedThreadPool cresce de acordo com a necessidade, sendo assim se precisarmos de mais threads, será criado.

        //Aceitando conexões
        while (true) {

            //Aceitando a conexão
            Socket socket = servidor.accept();
            System.out.println("Aceitando novo cliente na porta " + socket.getPort());

            //
            Tarefas distribuirTarefas = new Tarefas(socket);
            threadPool.execute(distribuirTarefas);
        }
    }
    
}
