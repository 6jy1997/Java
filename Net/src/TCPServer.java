
/*
*   TCP通信的服务端：接受客户端的请求，读取客户端的发送的数据，给客户端回写数据
*   表示服务端的类：java.net.ServerSocket（服务器套接字）
*   构造方法
*   ServerSocket(int port) 创建绑定到特定端口的服务器套接字
*
    多个客户端同时和服务器进行交互 服务器端必须明确和哪个客户端进行交互-accept方法
    成员方法：
        Socket accept（）

*   实现步骤
*   1、创建一个客户端对象ServerSocket，构造方法向系统要指定的端口号
*   2、使用ServerSocket中的accept方法获取请求的客户端对象Socket
* * 3：使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
*   4：使用网络字节输入流InputStream对象中的read方法，获取客户端发送的数据
*   5：使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream对象
*   6：使用网络字节输出流OutputStream对象中的write方法，给客户端回写数据
*   7：释放资源（Socket ServerSocket）
*
*
* */
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];

        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));

        OutputStream os = socket.getOutputStream();
        os.write("谢谢".getBytes());
        socket.close();
        server.close();
    }
}
