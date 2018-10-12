package AS1_4;

import java.util.ArrayList;
import java.util.List;

public class Book {
     private List<Elemment>list;
     public Book() {
      list=new ArrayList<>();
    }
    public boolean checkPhone(String phone) {
      for(Elemment e: list) {
         if(e.getPhone().equals(phone)) return true;
      }
      return false;
    }
    public boolean checkExist(String name) {
      for(Elemment e: list) {
          if(e.getName().equals(name)) return true;
      }
      return false;
    }
    public void displayPhone(String name) {
      for(Elemment e: list) {
        if(e.getName().equals(name)) {
          System.out.println(e.getPhone());
        }
      }
    }
    public void deletePhone(String name) {
      for(Elemment e: list) {
        if(e.getName().equals(name)) {
           e.setPhone("");
        }
      }
    }
    public void displayAll() {
      for(Elemment e: list) {
        System.out.println(e.getName()+e.getPhone());
      }
    }
    public List<Elemment> getList() {
      return list;
    }
    public void setList(List<Elemment> list) {
      this.list = list;
    }
     
}
