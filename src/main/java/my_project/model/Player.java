package my_project.model;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.GraphicalObject;
import KAGO_framework.model.InteractiveGraphicalObject;
import KAGO_framework.view.DrawTool;

import javax.swing.*;
import java.awt.*;

import static KAGO_framework.control.ViewController.isKeyDown;

public class Player extends InteractiveGraphicalObject {

    public double px;
    public double py;
    public double speed;

    String playerLook = "src/main/resources/graphic/Ganyu 2.png" ;


    public Player(double px, double py) {
        this.px = px;
        this.py = py;
        this.speed = 400;
    }



    @Override
    public void draw(DrawTool drawTool) {
        setNewImage(playerLook);
        drawTool.drawTransformedImage(getMyImage(), px, py, 0, 1);
    }


    public void update(double dt) {
        if (isKeyDown(65)) {
            px -= speed * dt;
            playerLook = "src/main/resources/graphic/Ganyu.png" ;
        }
        if (ViewController.isKeyDown(68)) {
            px += speed * dt;
            playerLook = "src/main/resources/graphic/Ganyu 2.png" ;
        }

        if (px > 600){
            px = -150;
        }
        if (px < -152){
            px = 598;
        }
    }
}

