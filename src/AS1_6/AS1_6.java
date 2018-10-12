package AS1_6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AS1_6 {
       public static void main(String[] args) {
         File file=new File("C:\\Users\\User\\eclipse-workspace\\day4\\file\\textfile.txt");
         File copyfile=new File("C:\\Users\\User\\eclipse-workspace\\day4\\text.txt");
         BufferedReader reader=null;
         PrintWriter writer=null;
         String line;
         try {
           if(copyfile.createNewFile() || !copyfile.createNewFile()) {
             reader=new BufferedReader(new FileReader(file));
             writer=new PrintWriter(new FileWriter(copyfile));
             while((line=reader.readLine())!=null) {
               writer.println(line);
             }
             reader.close();
             writer.close();
           }
         }catch (IOException e) {
          // TODO: handle exception
           System.out.println("not find file");
        }
      }
}
