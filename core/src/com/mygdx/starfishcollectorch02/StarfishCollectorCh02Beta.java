package com.mygdx.starfishcollectorch02;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.Stage;

public class StarfishCollectorCh02Beta extends GameBeta {
    private Turtle turtle;
    private ActorBeta starfish;
    private ActorBeta ocean;
    private ActorBeta winMessage;

    private boolean win;

    public void initialize() {
        ocean = new ActorBeta();
        ocean.setTexture(new Texture(Gdx.files.internal("water.jpg")));
        mainStage.addActor(ocean);

        starfish = new ActorBeta();
        starfish.setTexture(new Texture(Gdx.files.internal("starfish.png")));
        starfish.setPosition(380, 380);
        mainStage.addActor(starfish);

        turtle = new Turtle();
        turtle.setTexture(new Texture(Gdx.files.internal("turtle-1.png")));
        turtle.setPosition(20, 20);
        mainStage.addActor(turtle);

        winMessage = new ActorBeta();
        winMessage.setTexture(new Texture(Gdx.files.internal("you-win.png")));
        winMessage.setPosition(180, 180);
        winMessage.setVisible(false);
        mainStage.addActor(winMessage);

        win = false;
    }

    public void update(float dt) {

        // check win condition: turtle must be overlapping starfish
        if (turtle.overlaps(starfish)) {
            starfish.remove();
            winMessage.setVisible(true);
        }
    }
}
