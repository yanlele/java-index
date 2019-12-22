package demo5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class InputIntoFile {
    public static void main(String[] args) throws IOException {
        String value = "又添加了一行文字\n";
        FileWriter fw = new FileWriter("file.txt", true);
        BufferedWriter writer = new BufferedWriter(fw);
        writer.append(value);
        writer.close();
    }
}
