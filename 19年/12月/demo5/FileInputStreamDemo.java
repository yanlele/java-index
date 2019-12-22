package demo5;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.FileInputStream;
import java.io.IOException;

/* 字节流读取 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("file.txt");
        byte[] b = new byte[fis.available()];
        int len = fis.read(b);
        fis.close();
//        System.out.println(new String(b));
    }
}
