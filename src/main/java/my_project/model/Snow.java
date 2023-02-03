package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Snow extends GraphicalObject {

    double speed;
    double sr;

    public Snow(double x, double y) {
        this.x = Math.random()*700 -500;
        this.y = Math.random()* -600;
        sr = Math.random()*6 + 3;
        speed = Math.random()*sr * 10 + 300;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(204, 255, 249));
        drawTool.drawFilledCircle(x, y, sr);
    }

    public void update(double dt){
        y += dt * speed;
        x += dt * speed/2;
        if (y > 480){
            y = Math.random()*-800;
            x = Math.random()*600 -400;
            sr = Math.random()*4+2;
        }
    }
}
