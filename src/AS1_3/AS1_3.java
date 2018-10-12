package AS1_3;

import java.util.Scanner;

public class AS1_3 {
    public static void main(String[] args) {
      String line;
      int[] a=new int[20];
      int n,min=100000,max=-100000;
      Scanner sc=new Scanner(System.in);
      line=sc.nextLine();
      try {
      n=Integer.parseInt(line);
      line=null;
      for(int i=0;i<n;i++) {
         line=sc.nextLine();
         a[i]=Integer.parseInt(line);
         if(a[i]>max) max=a[i];
         if(a[i]<min) min=a[i];
      }
      System.out.println("luy thua max min lần lượt là: "+Math.pow(max, 2)+" "+Math.pow(min,2));
      }catch (NumberFormatException e) {
        // TODO: handle exception
        System.out.println("bạn phải nhập số");
      }
    }
}
