package AExampleCore;

import com.sanjay900.ProcessingApplet;
import processing.awt.PGraphicsJava2D;
import processing.core.PVector;

import java.awt.*;
import java.lang.invoke.MethodHandles;

/**
 * Created by sanjay on 30/07/16.
 */
public class AExampleCore extends ProcessingApplet{

    public static void main(String[] args){
        main(MethodHandles.lookup().lookupClass());
    }

    //Leave the space above.
    //Put variables here.
    PVector ex = new PVector();
    //Create a decently sized window
    public void settings() {
        size(640, 360);
    }
    public void setup() {
        noFill();
        rectMode(CENTER);
    }
    public void draw() {

    }
}
