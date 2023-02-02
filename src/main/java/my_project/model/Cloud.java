package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.awt.*;

public class Cloud extends GraphicalObject {

    public double cx;
    public double cy;

    public Cloud(double cx, double cy) {
        this.cx = cx;
        this.cy = cy;
    }

    public void draw(DrawTool drawTool){
        drawTool.setCurrentColor(new Color(191,239,255, 120));
        drawTool.drawFilledCircle(cx, cy, 40);
        drawTool.drawFilledCircle(cx+65, cy, 40);
        drawTool.drawFilledCircle(cx+130, cy, 40);
        drawTool.drawFilledCircle(cx+195, cy, 40);
        drawTool.drawFilledCircle(cx+260, cy, 40);
        drawTool.drawFilledCircle(cx+325, cy, 40);
        drawTool.drawFilledCircle(cx+390, cy, 40);
        drawTool.drawFilledCircle(cx+455, cy, 40);
        drawTool.drawFilledCircle(cx+520, cy, 40);
        drawTool.drawFilledCircle(cx+585, cy, 40);
    }
}
