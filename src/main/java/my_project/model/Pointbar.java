package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

public class Pointbar extends GraphicalObject {

    public Pointbar() {
        setNewImage("src/main/resources/graphic/ganyufox.jpg");
    }

    public void draw(DrawTool drawTool){
        drawTool.drawTransformedImage(getMyImage(), 40, 320, 0, 0.2);
    }
}
