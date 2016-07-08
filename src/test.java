import java.io.*;

public class test{
    public static void main(String[] args)throws IOException {
        File f = new File("e:/text.txt");

        FileOutputStream fot = new FileOutputStream(f);
        OutputStreamWriter writer = new OutputStreamWriter(fot, "UTF-8");
        BufferedWriter bout = new BufferedWriter(writer);
        bout.write("please in 撒旦");
        bout.write("\n");
        bout.write("hello world!");
        bout.flush();
        bout.close();
        fot.close();

        FileInputStream fit = new FileInputStream(f);
        InputStreamReader reader = new InputStreamReader(fit, "UTF-8");
        BufferedReader bread = new BufferedReader(reader);
        StringBuffer str = new StringBuffer();
        while(bread.ready()){
            str.append(bread.readLine());
        }
        System.out.println(str.toString());
        reader.close();
        fit.close();
    }
}