
/*
* 套接字：包含了IP和端口号的网络单位
*
*
* 构造方法：
*   Socket(String host, int port)
*
*
*
* 实现步骤:
*   1：创建一个客户端对象socket 构造方法绑定服务器的IP地址和端口号
*   2：使用Socket对象中的getOutputStream()获取网络字节输出流OutputStream对象
*   3：使用网络字节输出流OutputStream对象中的write方法，给服务器发送数据
*   4：使用Socket对象中的getInputStream()获取网络字节输入流InputStream对象
*   5：网络字节输入流InputStream对象中的对象中的方法read 读取服务器回写的数据
*   6： 关闭socket资源
* */

import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {

    public static void main(String[] args) {

        Socket socket  = new Socket("127.0.0.1",8888);
        OutputStream os = socket.getOutputStream();

        os.write("你好".getBytes());


        socket.close();


    }
}
