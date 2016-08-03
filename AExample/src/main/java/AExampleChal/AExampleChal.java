package AExampleChal;

import com.sanjay900.ProcessingApplet;

import java.lang.invoke.MethodHandles;

/**
 * Created by sanjay on 30/07/16.
 */
public class AExampleChal extends ProcessingApplet{

    public static void main(String[] args){
        main(MethodHandles.lookup().lookupClass());
    }

    //Make sure you leave a gap here.
    //Create a decently sized window
    public void settings() {
        size(1000, 700);
    }
    public void setup() {
        noFill();
        rectMode(CENTER);
    }
    public void draw() {

    }
}
