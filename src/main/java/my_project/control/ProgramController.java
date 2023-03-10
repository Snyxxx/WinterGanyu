package my_project.control;

import KAGO_framework.control.ViewController;
import KAGO_framework.model.abitur.datenstrukturen.Queue;
import my_project.model.*;
import my_project.view.InputManager;

import java.awt.event.MouseEvent;

/**
 * Ein Objekt der Klasse ProgramController dient dazu das Programm zu steuern. Die updateProgram - Methode wird
 * mit jeder Frame im laufenden Programm aufgerufen.
 */
public class ProgramController {

    //Attribute


    // Referenzen
    private ViewController viewController;  // diese Referenz soll auf ein Objekt der Klasse viewController zeigen. Über dieses Objekt wird das Fenster gesteuert.

    /**
     * Konstruktor
     * Dieser legt das Objekt der Klasse ProgramController an, das den Programmfluss steuert.
     * Damit der ProgramController auf das Fenster zugreifen kann, benötigt er eine Referenz auf das Objekt
     * der Klasse viewController. Diese wird als Parameter übergeben.
     * @param viewController das viewController-Objekt des Programms
     */
    public ProgramController(ViewController viewController){
        this.viewController = viewController;
    }

    /**
     * Diese Methode wird genau ein mal nach Programmstart aufgerufen.
     * Sie erstellt die leeren Datenstrukturen, zu Beginn nur eine Queue
     */
    public void startProgram() {
        // Erstelle ein Objekt der Klasse Ball und lasse es zeichnen
        //Ball ball1 = new Ball(150,150);
        //viewController.draw(ball1);

        Background background1 = new Background();
        viewController.draw(background1);

        for(int i = 1; i <= 330; i++){
            Snow snow1 = new Snow(0, 0);
            viewController.draw(snow1);
        }

        Floor floor1 = new Floor(0,435);
        viewController.draw(floor1);

        Pointbar pointbar1 = new Pointbar();
        viewController.draw(pointbar1);

        Score score1 = new Score(245,555);
        viewController.draw(score1);

        Cloud cloud1 = new Cloud(0,80);
        viewController.draw(cloud1);

        Player player1 = new Player(220,260);
        viewController.draw(player1);

        Ultball ultball1 = new Ultball(200,-10);
        viewController.draw(ultball1);

        Shard shard1 = new Shard();
        shard1.setPlayer(player1);
        shard1.setScore(score1);
        viewController.draw(shard1);
    }

    /**
     * Aufruf mit jeder Frame
     * @param dt Zeit seit letzter Frame
     */
    public void updateProgram(double dt){

    }
}
