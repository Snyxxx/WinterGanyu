package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.util.ArrayList;

public class Shard extends GraphicalObject {

    ArrayList<double[]> allShards = new ArrayList<>();

    double timer;
    double speed;

    public Shard() {
        setNewImage("src/main/resources/graphic/Shard.png");
        this.speed = 400;
    }

    public void draw(DrawTool drawTool) {
        for (int i = 0; i < allShards.size(); i++){
            drawTool.drawTransformedImage(getMyImage(), allShards.get(i)[0], allShards.get(i)[1], 0, 0.5);
        }
    }

    public void update(double dt){
        timer = timer +dt;

        if (timer > 0.7){
            double[] shard1 = new double[2];
            shard1[0] = Math.random()*572.5;
            shard1[1] = 40;
            allShards.add(shard1);
            timer = 0;
        }
        for (int i = 0; i < allShards.size(); i++){
            allShards.get(i)[1] += speed *dt;
            if (allShards.get(i)[1] > 400){
                allShards.remove(i);
            }
        }
    }
}
