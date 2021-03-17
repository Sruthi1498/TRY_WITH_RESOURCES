import java.io.File;

public class DeleteDir {
    public static void main(String[] args) {
        File d = new File("C:\\Users\\sruthi-pt4021\\IdeaProjects\\Text2");

        if(d.isDirectory() == false)
        {
            System.out.println("no directory");
        }
        File[] f = d.listFiles();
        for(File fi:f)
        {
            fi.delete();
        }
        d.delete();
    }
}
