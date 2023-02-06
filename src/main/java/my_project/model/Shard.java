package my_project.model;

import KAGO_framework.model.GraphicalObject;
import KAGO_framework.view.DrawTool;

import java.util.ArrayList;

public class Shard extends GraphicalObject {

    ArrayList<double[]> allShards = new ArrayList<>();

    Player player;

    Score score;
    double timer;
    double speed;

    public Shard() {
        setNewImage("src/main/resources/graphic/Shard.png");
        this.speed = 500;
    }

    public void draw(DrawTool drawTool) {
        for (int i = 0; i < allShards.size(); i++){
            drawTool.drawTransformedImage(getMyImage(), allShards.get(i)[0], allShards.get(i)[1], 0, 1);
        }
    }

    public void update(double dt){
        timer = timer +dt;

        if (timer > 1){
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
        for (int i = 0; i < allShards.size(); i++){
            for (int j = 0; j < 122; j++){
                for (int k = 0; k < 123; k++){
                    if (punktInRechteck(j+player.px, k+player.py, allShards.get(i)[0], allShards.get(i)[1], 23, 52)) {
                        allShards.remove(i);
                        score.addScore();
                        return;
                    }
                }
            }
        }
    }

    boolean punktInRechteck(double px, double py, double rx, double ry, double rw, double rh) {
        return px >= rx && px <= rx + rw && py >= ry && py <= ry + rh;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
