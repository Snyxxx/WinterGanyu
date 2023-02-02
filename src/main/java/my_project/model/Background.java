package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Background extends GraphicalObject {

    public Background(){

    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(0,3,96));
        drawTool.drawFilledRectangle(0,0,600,600);
    }
}
