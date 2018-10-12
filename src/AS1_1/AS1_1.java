package AS1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AS1_1 implements Pow {
  private long number;
  public long getNumber() {
    return number;
  }

  public void setNumber(long number) {
    this.number = number;
  }

  @Override
  public long pow2(long x) {
    // TODO Auto-generated method stub
    return number*number;
  }

  @Override
  public long pow3(long x) {
    // TODO Auto-generated method stub
    return number*number*number;
  }
  public static void main(String[] args){
    String line;
    long number;
    Scanner sc=new Scanner(System.in);
    while(true) {
      try {
        line=sc.nextLine();
        number=Integer.parseInt(line);
        if(number==0) break;
        AS1_1 as1=new AS1_1();
        as1.setNumber(number);
        System.out.println("luy thua bậc 2 là : "+as1.pow2(number) +"\n"+"luy thua bậc 3 là: "+as1.pow3(number));
      }catch (Exception e) {
        System.out.println("ban phai nhap so");
        // TODO: handle exception
      }
    }
  }

}
