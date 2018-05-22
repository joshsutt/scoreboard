import java.io.*;
import java.util.*;


class scoreBoard{
  public static void main(String[] args){
    String fileString = "";
    
    
    try{
      Scanner sc = new Scanner(new File("scores.txt"));
      while (sc.hasNextLine()){
        fileString += sc.nextLine();
      }
      sc.close();
    }catch(IOException e){
      System.out.println(e);
    }
    String[] fileArr = fileString.split(" ");
    person[] scores = new person[fileArr.length/2];
    for(int i=0; i<scores.length; i++){
      scores[i] = new person(fileArr[i*2], Double.parseDouble(fileArr[i*2+1]));
    }
    log(scores);
    log(insertion(scores));
    
  }
  
  
  
  
  
  
  
  
  
  
  
  private static person[] insertion(person[] array){
    person[] sortedArray = array.clone();
    int count = 0;
    
    for(int i=1; i<sortedArray.length; i++){
      int j = i;
      while(j>0){
        count++;
        if(sortedArray[j-1].score<sortedArray[j].score){
          count++;
          person temp = sortedArray[j];
          sortedArray[j] = sortedArray[j-1];
          sortedArray[j-1] = temp;
        }
        j--;
      }
    }

    return sortedArray;
    
  }
  public static void log(person[] array){
    for(int i=0; i<array.length; i++){
      if(i>0){
        System.out.print(", ");
      }
      System.out.print(array[i].list());
    }
    System.out.println();
    
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
  public String list(){
    return name+": "+score;
    
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