import java.io.*;
import java.util.*;


class scoreBoard{
  public static void main(String[] args){
    person josh = new person("Josh", 6);
    person oscar = new person("Oscar", 7);
    josh.swap(oscar);
    josh.list();
  }
  
}


class person{
  //TODO getter and setters and private
  public double score;
  public String name;
  public person(String name, double score){
    this.name = name;
    this.score = score;
  }
  public void list(){
   System.out.println(name+": "+score);
    
  }
  public void swap(person other){
    String tempName = name;
    double tempScore = score;
    score = other.score;
    name = other.name;
    other.name = tempName;
    other.score = tempScore;
    
  }
}