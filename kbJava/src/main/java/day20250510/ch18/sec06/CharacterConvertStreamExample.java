package day20250510.ch18.sec06;

import java.io.*;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception{
        String str = "문자변환 시스템을 사용합니다";
        OutputStream os = new FileOutputStream("c:/temp/test.txt");
        Writer writer = new OutputStreamWriter(os, "UTF-8");
        writer.write(str);
        writer.flush();
        writer.close();

        InputStream is = new FileInputStream("c:/temp/test.txt");
        Reader reader = new InputStreamReader(is, "UTF-8");
        char[] data = new char[100];
        int num = reader.read(data);
        reader.close();
        String str1 = new String(data, 0, num);
        System.out.println(str1);
    }
}
