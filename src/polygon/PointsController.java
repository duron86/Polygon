
package polygon;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class PointsController { 
    private Scanner input =new Scanner(System.in);
    Map<Integer,Point>map=new HashMap<>();
   
    public void loop() {
   OPTIONS option = null;
   do{ showoptions();
   try{
       option=chooseOption();
         ExecuteOption(option);   
   }catch (NoSuchElementException e){
       System.out.println("Nie ma takiej opcji");
   }
   } while (option!=OPTIONS.CLOSE);
}
 private void showoptions(){   
 System.out.println("To są opcje programu.");
 System.out.println("Wybierz pole której figury chcesz obliczyć");
 for(OPTIONS option:OPTIONS.values()){
     System.out.println(option);
 }
 }
 
  private OPTIONS chooseOption(){
    int option=input.nextInt();
    input.nextLine();
    return OPTIONS.convertToOption(option);   
  }  
    
    private void ExecuteOption (OPTIONS option){
        switch(option){
            case TRIANGLE:
                triangle();
                break;
            case QUADRANGLE:
                quadrangle();
                break;
            case PENTAGON:
                pentagon();
                break;
            case CLOSE:
                close();
                break;
                
    }
}
    private void triangle(){
        for(int i=0;i<3;i++){
    System.out.println("Podaj współrzędną X"+i);
    double x=input.nextDouble();
    System.out.println("Podaj współrzędną Y"+i);
    double y=input.nextDouble(); 
    map.put(i,new Point(x,y));
    }
        
    double triangleArea1= map.get(0).getX()*(map.get(1).getY()-map.get(2).getY())/2; 
    double triangleArea2=map.get(1).getX()*(map.get(2).getY()-map.get(0).getY())/2;
    double triangleArea3=map.get(2).getX()*(map.get(0).getY()-map.get(1).getY())/2;
    
    double triangleArea = triangleArea1+triangleArea2+triangleArea3;
    if (triangleArea>=0) triangleArea=triangleArea;
    else triangleArea= -triangleArea;
    
    System.out.println("Pole wynosi"+triangleArea);
    }
    
    private void quadrangle(){
        for(int i=0;i<4;i++){
    System.out.println("Podaj współrzędną X"+i+"po kolei");
    double x=input.nextDouble();
    System.out.println("Podaj współrzędną Y"+i+"po kolei");
    double y=input.nextDouble(); 
    map.put(i,new Point(x,y));
        }
    double quadArea1= map.get(0).getX()*(map.get(1).getY()-map.get(3).getY())/2; 
    double quadArea2=map.get(1).getX()*(map.get(2).getY()-map.get(0).getY())/2;
    double quadArea3=map.get(2).getX()*(map.get(3).getY()-map.get(1).getY())/2;
    double quadArea4=map.get(3).getX()*(map.get(0).getY()-map.get(2).getY())/2;
    
    double quadArea = quadArea1+quadArea2+quadArea3+quadArea4;
    if (quadArea>=0) quadArea=quadArea;
    else quadArea= -quadArea;
    
    System.out.println("Pole wynosi"+quadArea);
    }
    
    private void pentagon(){  
        for(int i=0;i<5;i++){
    System.out.println("Podaj współrzędną X"+i+"po kolei prawoskrętnie !");
    double x=input.nextDouble();
    System.out.println("Podaj współrzędną Y"+i+"po kolei prawoskrętnie !");
    double y=input.nextDouble(); 
    map.put(i,new Point(x,y));
        }
    double pentaArea1= map.get(0).getX()*(map.get(1).getY()-map.get(4).getY())/2; 
    double pentaArea2=map.get(1).getX()*(map.get(2).getY()-map.get(0).getY())/2;
    double pentaArea3=map.get(2).getX()*(map.get(3).getY()-map.get(1).getY())/2;
    double pentaArea4=map.get(3).getX()*(map.get(4).getY()-map.get(2).getY())/2;
    double pentaArea5=map.get(4).getX()*(map.get(0).getY()-map.get(3).getY())/2;
    
    double pentaArea = pentaArea1+pentaArea2+pentaArea3+pentaArea4+pentaArea5;
    if (pentaArea>=0) pentaArea=pentaArea;
    else pentaArea= -pentaArea;
    
    System.out.println("Pole wynosi"+pentaArea);
    }
    
    private void close(){
    input.close();
    System.out.println("Do widzenia");
  }   
}