/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cliente;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Tiago TKG
 */
public class Cliente {
    
    public static void main(String[] args) throws Exception {      
        
        //Efetuando conexao com o servidor
        Socket socket = new Socket("localhost", 12345);
        System.out.println("Conexão Estabelecida");

        //Enviando comando para o servidor
        PrintStream saida = new PrintStream(socket.getOutputStream()); //enviando texto simples
        saida.println("c1");
        
/**
* Parte tensa dos arquivos ainda verei a treta
* 
*        File arquivo = new File("C:\\test.xml");
*        
*        //Pega o tamanho do arquivo
*        long length = file.length();
*        byte[] bytes = new byte[16 * 1024];
*        InputStream arquivoIn = new FileInputStream(file);
*        OutputStream out = socket.getOutputStream();
*
* Fim da parte tensa dos arquivos
*/

        //Bloqueando processo 
        Scanner teclado = new Scanner(System.in);
        teclado.nextLine();

        //Encerrando tudo
        saida.close();
        teclado.close();
        socket.close();        
       
    }
    
}
