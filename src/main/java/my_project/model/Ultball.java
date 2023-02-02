package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Ultball extends GraphicalObject {

    public double bx;
    public double by;


    public Ultball(double bx, double by){
        this.bx = bx;
        this.by = by;
        setNewImage("src/main/resources/graphic/ult.png");
    }


    public void draw(DrawTool drawTool){
        drawTool.drawTransformedImage(getMyImage(), bx, by, 0, 0.7);
    }

}
