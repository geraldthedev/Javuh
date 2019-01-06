
public class ballin {

   public void rollHill(int newRoll, int newBounce, int newHill){
       int height = 0;
       int angle = newRoll * newHill;
       int drop = angle/newRoll+4;

    if (newRoll < 20 ){

      while(height < 20){
        height++;
        System.out.println("height is "+ height);
        System.out.println("angle is "+ angle);
        System.out.println("drop is "+ drop);

      }

    } else{

      System.out.println("Game has ended!");

      }


  }


}






