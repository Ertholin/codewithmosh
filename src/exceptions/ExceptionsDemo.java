package exceptions;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

    public static void show(){
        //sayHello(null);

//        // Catching Exception
//        try {
//            var fileReader = new FileReader("file.txt");
//            System.out.println("File Opened");
//        }catch (FileNotFoundException ex){
//            System.out.println(ex.getMessage());
//        }

//        // Catching Multiple Exceptions
//        try {
//            var fileReader = new FileReader("file.txt");
//            var value = fileReader.read();
//            new SimpleDateFormat().parse("");
//        }catch (IOException | ParseException e){
//            System.out.println("");
//        }

//        // Finally Block
//        FileReader fileReader = null;
//        try {
//            fileReader = new FileReader("file.txt");
//            var value = fileReader.read();
//        }catch (IOException e){
//            System.out.println("");
//        }finally {
//            if (fileReader != null) {
//                try {
//                    fileReader.close();
//                } catch (IOException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }

//        // The try-with-resources Statement
//        try(
//                var fileReader = new FileReader("file.txt");
//                var fileWriter = new FileWriter("...")
//        ) {
//            var value = fileReader.read();
//        }catch (IOException e){
//            System.out.println("");
//        }

        //Throw Exception
        var account = new Account();
        try {
            account.deposit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
