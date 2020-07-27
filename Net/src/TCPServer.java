
/*
服务器端必须明确：
1、哪个客户端请求的服务器
成员方法
Socket accept()


构造方法

服务器实现步骤：
    1、创建服务器 ServerSocket对象和制定的端口号
    2、使用ServerSocket中的accept，获取请求的客户端对象socket
    3、使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
    4、网络字节输入流InputStream对象中的对象中的方法read 读取客户端发送的数据
    5、使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream对象
    6、使用网络字节输出流OutputStream对象中的write方法，给客户端回写数据
    7、释放资源socket Serversocket



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
