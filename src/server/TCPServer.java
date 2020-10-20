package server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    private final int port;
    public static final int PORTNUMBER = 9999;

    TCPServer(int port) {
       this.port = port;
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        TCPServer tcpServer = new TCPServer(PORTNUMBER);

        tcpServer.doSomething();
    }

    public void doSomething() throws IOException, InterruptedException {
        ServerSocket srvSocket = new ServerSocket(this.port);
        System.out.println("server socket created");
        Socket socket = srvSocket.accept();
        System.out.println("client connection accepted");

        socket.getInputStream().read();
        System.out.println("read something");

        OutputStream os = socket.getOutputStream();
        os.write(":)".getBytes());
        System.out.println("write something");

        Thread.sleep(5000);
        System.out.println("woke up");
        os.close();
    }

}