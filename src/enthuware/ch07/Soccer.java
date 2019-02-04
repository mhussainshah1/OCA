package enthuware.ch07;

class Game{
  public void play() throws Exception{
    System.out.println("Playing...");
  }
}

public class Soccer extends Game{
   public void play(){
      System.out.println("Playing Soccer...");      
   }
   public static void main(String[] args){
       Game g = new Soccer();
       g.play();
   }
}