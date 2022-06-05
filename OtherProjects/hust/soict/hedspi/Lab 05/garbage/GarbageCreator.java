package hust.soict.hedspi.garbage;

import java.io.*;

public class GarbageCreator {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        String fileLocate = "D:\\D Disk\\Codingz\\Java files\\Helloworld\\OtherProjects\\src\\hust\\soict\\hedspi\\garbage\\text.txt";
        FileInputStream fis = new FileInputStream(fileLocate);
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String s = "";
        while (br.ready()) {
            s += br.readLine();
        }
        System.out.println(System.currentTimeMillis() - start);
        br.close();
        isr.close();
        fis.close();
    }
}
