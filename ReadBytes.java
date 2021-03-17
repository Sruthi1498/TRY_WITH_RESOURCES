import java.io.File;
import java.io.FileInputStream;

public class ReadBytes {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text2.txt");
        read(f);

    }

    public static byte[] read(File f)
    {
        FileInputStream file;
        byte[] arr = new byte[(int)f.length()];
        try {
            file = new FileInputStream(f);
            file.read(arr);
            file.close();
            for (int i =0;i<arr.length;i++)
            {
                System.out.println((char)arr[i]);
            }

        }
        catch (Exception e)
        {
            System.out.println("exception");
        }
        return arr;
    }
}
