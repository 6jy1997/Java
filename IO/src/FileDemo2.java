import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File file1 = new File("C:\\Users\\Jy\\Music\\timg.jfif");
            File file2 = new File("timg.jfif");
            fis = new FileInputStream(file1);
            fos  = new FileOutputStream(file2);
            byte[] buffer = new byte[5];
            int len;
            while((len=fis.read(buffer))!= -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(fos !=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis !=null){
                    fis.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
