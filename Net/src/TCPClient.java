
/*
    TCP通信的客户端：向服务器发送连接请求，给服务器发送数据，读取服务器回写的数据
    表示客户端的类：java.net.Socket（套接字）
    套接字：包含了IP和端口号的网络单位
    套接字构造方法：
    Socket(String host, int port)
        String host：服务器主机的名称、服务器主机的IP地址
        int port：服务器的端口号
    套接字成员方法：
        OutputStream getOutputStream(): 返回此套接字的输出流
        InputStream getInputStream(): 返回此套接字的输入流
        void close(): 关闭套接字

*   实现步骤:
*       1：创建一个客户端对象socket 构造方法绑定服务器的IP地址和端口号
*       2：使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream对象
*       3：使用网络字节输出流OutputStream对象中的write方法，给服务器发送数据
*       4：使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
*       5：网络字节输入流InputStream对象中的对象中的方法read 读取服务器回写的数据
*       6： 关闭socket资源
    注意事项：
        1、客户端与服务器进行交互，必须使用Socket中提供的网络流 不能自己创建
        2、当
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) throws IOException {

        Socket socket  = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();

        os.write("你好".getBytes());
        InputStream is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0,len));


        socket.close();


    }
}
