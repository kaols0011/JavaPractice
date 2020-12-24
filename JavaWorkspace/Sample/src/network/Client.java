package network;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args)  {
        
        try (Socket socket = new Socket("127.0.0.1", 8080);
             InputStream inputStream = socket.getInputStream();
             OutputStream outputStream = socket.getOutputStream();
             OutputStreamWriter osw = new OutputStreamWriter(outputStream,StandardCharsets.UTF_8);
             InputStreamReader isr = new InputStreamReader(inputStream,StandardCharsets.UTF_8);
             BufferedReader br = new BufferedReader(isr);

             
        ) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("請輸入傳送文字，輸入b中斷：");
            String input = scanner.nextLine();
            while ( input != null ){
                //送Hello World出去
                osw.write(input + System.lineSeparator());
                osw.flush();
                String line = br.readLine(); // 讀入Server回應
                System.out.println("接收到="+line);
                System.out.print("請輸入傳送文字，輸入b中斷：");
                input = scanner.nextLine();
                if ( input.equals("b")){
                    break;
                }
            }

            //outputStream.write("你好\r\n".getBytes()); //文字轉byte[]用getBytes()
            /*
            byte[] buffer = new byte[1000];
            int length;
            while ((length = inputStream.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, length, StandardCharsets.UTF_8));//byte[]轉文字用建構方法
            } */

        } catch (UnknownHostException e) {
            System.out.println("找不到主機");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
