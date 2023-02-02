package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Floor extends GraphicalObject {

    public double fx;
    public double fy;

    public Floor(double fx,double fy) {
        this.fx = fx;
        this.fy = fy;
    }

    public void draw(DrawTool drawTool) {
        drawTool.setCurrentColor(new Color(191,239,255));
        drawTool.drawFilledRectangle(fx, fy, 600, 150);
    }
}
