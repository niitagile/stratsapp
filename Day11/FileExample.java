package IO_Classes;

import java.io.File;

public class FileExample {
    public static void main(String[] args) {
        File obj=new File("c:\\b1\\abc.txt");
        System.out.println("getName() = "+obj.getName());
        System.out.println("getPath() = "+obj.getPath());
        System.out.println("getParent() = "+obj.getParent());
        System.out.println("lastModified() = "+obj.lastModified());
        System.out.println("length() = "+obj.length());
    }
    
}
