package demo5;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File file = new File("file.txt");
        FileOutputStream fop = new FileOutputStream(file);

        OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8);

        writer.append("文件已被成功创建！");
        writer.close();
        fop.close();
    }
}
