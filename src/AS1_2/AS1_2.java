package AS1_2;

import java.util.Scanner;

import AS1_1.AS1_1;

public class AS1_2 {
  private long number;
  public long factorial(long x) {
    if(x==1) return 1;
    else return x*factorial(x-1);
  }
  public long getNumber() {
    return number;
  }
  public void setNumber(long number) {
    this.number = number;
  }
  public static void main(String[] args){
    long number;
    String line;
    Scanner sc=new Scanner(System.in);
    while(true) {
      line=sc.nextLine();
      try {
      number=Long.parseLong(line);
      if(number < 0)  throw new CustomExeption("ban nhập số > 0");
      if(number==0) break;
      AS1_2 as2=new AS1_2();
      as2.setNumber(number);
      System.out.println("gai thua  là : "+ as2.factorial(number));
    }catch (NumberFormatException e) {
       System.out.println("ban phai nhap số");
    }catch (CustomExeption ee) {
      // TODO: handle exception
    }
    }
  }
}
