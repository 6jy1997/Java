import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {


    public static void main(String[] args) throws IOException {


        File f1 = new File("1.txt");

        FileOutputStream os1 = new FileOutputStream(f1,true);

        os1.write(12);

        os1.close();




    }


}
