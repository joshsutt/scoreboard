import java.io.*;
import java.util.*;


class scoreBoard{
  public static void main(String[] args){
    person josh = new person("Josh", 6);
    josh.list();
  }
  
}


class person{
  private double score;
  private String name;
  public person(String name, double score){
    this.name = name;
    this.score = score;
  }
  public void list(){
   System.out.println(name+": "+score);
    
  }
}