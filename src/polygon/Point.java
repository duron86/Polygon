
package polygon; //Jest to klasa (Point), będąca zwykłym Java Beanem. Mam na myśli tzw. enkapsulację.

public class Point { //nazwa klasy oraz wzmianka o tym, że jest publiczna. 
    private double x;  //ustawianie zmiennej x typu double - liczba rzeczywista.
    private double y;  //ustawianie zmiennej y typu double - liczba rzeczywista.
    public Point (double x,double y){ //jest to tak zwany konstruktor, pomocny w odwoływaniu się do klasy z zewnątrz
        this.x=x;   //pole konstruktora x
        this.y=y;   //pole konstruktora y
    }
    public double getX(){   //klasyczny getter getX
    return x;}              //zwróć x gettera   
    
    public void setX(double x){ //klasyczny setter
     this.x=x;                  //pole metody (settera)
    }
    
    public double getY(){   //klasyczny getter getY
     return y;}              //zwróć y gettera   
    
    public void setY(double y){ //klasyczny setter
    this.y=y;}                  //pole metody (settera)
    
}