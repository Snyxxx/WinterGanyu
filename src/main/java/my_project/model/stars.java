package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class stars extends GraphicalObject {


    public stars() {

    }

    public void draw(DrawTool drawTool) {
        for (int i = 1; i < 100; i++){
            drawTool.setCurrentColor(new Color(204, 255, 249));
            drawTool.drawFilledCircle(Math.random()*600, Math.random()*440,Math.random()*5);
        }
    }
}
