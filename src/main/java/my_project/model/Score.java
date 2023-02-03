package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Score extends GraphicalObject {

    public double scx;
    public double scy;
    public double score;

    public Score(double scx ,double scy){
        this.scx = scx;
        this.scy = scy;
    }

    public void draw(DrawTool drawTool){
        score = 1;
        drawTool.drawText(scx,scy,"SCORE : ");
        drawTool.drawText(scx+60,scy,"1");
    }
}
