
package polygon;

import java.util.NoSuchElementException; //niezbędny import pomocny w implementacji wyjątku w metodzie convertToOption

public enum OPTIONS {       //klasa będąca tzw. enumem o nazwie OPTIONS
    TRIANGLE (0,"Oblicz pole trójkąta – wybierz 0 "),  			//w przypadku wyboru "0" program oblicza pole trójkąta
    QUADRANGLE (1,"Oblicz pole czworokąta – wybierz 1"),	//analogicznie "1" oblicza pole czworokąta
    PENTAGON (2,"Oblicz pole pięciokąta – wybierz 2"),		//analogicznie "2" oblicza pole pięciokąta
    CLOSE (3,"Zamknij program – wybierz 3");	
    
    private final int shortcut;
    private final String description;
    
    OPTIONS (int shortcut, String description){
        this.shortcut=shortcut;
        this.description=description;
    }
    static OPTIONS convertToOption (int option){
        if (option <0 || option >= values().length)
        throw new NoSuchElementException();
       
        return values()[option];
    }
}
