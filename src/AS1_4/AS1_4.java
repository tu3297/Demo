package AS1_4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AS1_4 {
  public static void main(String[] args) {
     Book book=new Book();
    // Map<String,String> map=new HashMap<>();
     String name;
     String phone;
     Scanner sc=new Scanner(System.in);
     for(int i=0;i<3;i++) {
         name=sc.nextLine();
         phone=sc.nextLine();
        // map.put(name, phone);
         Elemment e=new Elemment(name, phone);
         book.getList().add(e);
     }
     if(book.checkPhone("3443")) System.out.println("ton tai");
     else System.out.println("khong");
     if(book.checkExist("Jack")) System.out.println("ton tai");
     else System.out.println("khong ton tai");
     book.displayPhone("Tina");
     book.deletePhone("Joy");
     book.displayAll();
     
  }
}
