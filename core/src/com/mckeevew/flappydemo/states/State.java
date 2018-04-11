package com.mckeevew.flappydemo.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Abstract State Class
 */
public abstract class State {
                                                        //Protected can only be accessed by package and subclass
    protected OrthographicCamera cam;                   //camera
    protected Vector3 mouse;                            //x,y,z  cordinate system
    protected GameStateManager gsm;                     //Way to manage putting states on top of states
                                                        //Such as stacking pause on top of game

    protected State(GameStateManager gsm) {
        this.gsm = gsm;
        cam = new OrthographicCamera();
        mouse = new Vector3();
    }

    public abstract void handleInput();
    public abstract void update(float dt);              //dt = delta time aka. time between rendering frames
    public abstract void render(SpriteBatch sb);        //Container for everything we are loading to the screen
    public abstract void dispose();

}
