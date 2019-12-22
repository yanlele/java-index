package demo5;

import java.io.*;
import java.nio.charset.StandardCharsets;

/*
 * 第二题测试类
 *  */
public class AddressBookTest {
    public static void main(String[] args) throws IOException {
        AddressBook addressBook1 = new AddressBook(
                "张三1",
                1,
                11111,
                11111111,
                "重庆",
                "一个学生"
        );

        AddressBook addressBook2 = new AddressBook(
                "张三2",
                1,
                222222,
                222222222,
                "重庆",
                "一个学生"
        );

        AddressBook addressBook3 = new AddressBook(
                "张三3",
                1,
                33333,
                3333333,
                "重庆",
                "一个学生"
        );

        AddressBook addressBook4 = new AddressBook(
                "张三4",
                1,
                4444,
                44444444,
                "重庆",
                "一个学生"
        );

        AddressBook addressBook5 = new AddressBook(
                "张三",
                1,
                55555,
                55555555,
                "重庆",
                "一个学生"
        );

        File f = new File("addressbook.dat");
        FileOutputStream fop = new FileOutputStream(f);

        OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8);

        writer.append(addressBook1.toString());
        writer.append(addressBook2.toString());
        writer.append(addressBook3.toString());
        writer.append(addressBook4.toString());
        writer.append(addressBook5.toString());

        writer.close();
        fop.close();

        FileInputStream fip = new FileInputStream(f);

        InputStreamReader reader = new InputStreamReader(fip, StandardCharsets.UTF_8);

        StringBuffer sb = new StringBuffer();
        while (reader.ready()) {
            sb.append((char) reader.read());
        }

        System.out.println(sb.toString());
        reader.close();
        fip.close();

    }
}
