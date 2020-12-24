package network;

import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.charset.StandardCharsets;

public class EchoServer {
    public static void main(String[] args) {


        try (ServerSocket ssc = new ServerSocket(8080);
             Socket socket = ssc.accept();  //在此等候對方的連線，沒有連線程式會停在此行
             InputStream inputStream = socket.getInputStream();
             OutputStream outputStream = socket.getOutputStream();
             //ReadableByteChannel inChannel = Channels.newChannel(inputStream);
             //WritableByteChannel outChannel = Channels.newChannel(outputStream);
             BufferedInputStream bis = new BufferedInputStream(inputStream);
        ) {

            InetSocketAddress remoteSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
            System.out.println("收到來自" + remoteSocketAddress.getHostName());


            //io
            byte[] buffer = new byte[1024];
            int length;
            while ( (length = bis.read(buffer)) != -1 ){
                //當client的outputstream close時，則會收到-1
                String message = new String(buffer,0,length, StandardCharsets.UTF_8);
                System.out.println("接收到:"+message);
                outputStream.write(buffer,0,length);
            }

            /*
            //nio作法
            ByteBuffer buffer = ByteBuffer.allocate(80);
            while (inChannel.read(buffer) != -1) {
                buffer.flip();
                //以下範例可以列印出使用者輸入的字
                byte[] bufferBytes = new byte[buffer.limit()];
                buffer.get(bufferBytes);
                System.out.println(new String(bufferBsocketytes, StandardCharsets.UTF_8));
                可利用rewind復原position游標
                buffer.rewind();
                //end
                outChannel.write(buffer);
                buffer.clear();
            }*/

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Echo Server end");
    }

}
