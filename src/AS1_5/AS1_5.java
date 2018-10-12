package AS1_5;

import java.util.Scanner;
import java.util.StringTokenizer;

public class AS1_5 {
   public static void main(String[] args) {
    String maQg;
    String maVu;
    String sdt;
    String full = null;
    Scanner sc=new Scanner(System.in);
    try {
        full=sc.nextLine();
    }catch(NumberFormatException e) {
    }
    StringTokenizer st21 = new StringTokenizer(full);
    while (st21.hasMoreTokens()) {
        System.out.println("ma quoc gia la: "+ st21.nextToken());
        break;
    }
    StringTokenizer st = new StringTokenizer(full);
    int dem=0;
    while (st.hasMoreTokens()) {
      dem++;
      if(dem==2) {
         dem=0;
         String st1=st.nextToken();
         StringTokenizer st11=new StringTokenizer(st1,"-");
         while(st11.hasMoreTokens()) {
           if(dem==0) {
             System.out.println("ma vung la "+st11.nextToken());
             dem++;
           }
           else System.out.println("sdt la "+st11.nextToken());
         }
      }else st.nextToken();
  }
   // System.out.println("Ma quoc gia la "+);
  }
}
