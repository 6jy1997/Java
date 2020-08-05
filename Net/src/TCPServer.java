


/*
*   TCP通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
*   java.net.Socket
*
*   构造方法
*
*
*   实现步骤
*   1、创建一个客户端对象Socket，构造方法绑定服务器的IP地址
*
*
* */
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();


        byte[] bytes = new byte[1024];

    }
}
