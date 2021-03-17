import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Demo1 {
    public static void main(String[] args) {
        try(FileOutputStream f =  new FileOutputStream("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text2.txt")) {
        String str = "hello everyone";
        byte[] arr = str.getBytes();
        f.write(arr);

            FileInputStream f1 = new FileInputStream("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text2.txt");
            f1.read(arr);
            String s= new String(arr);
            System.out.println(s);
        }
        catch (Exception e)
        {
            System.out.println("exception");
        }
    }
}
