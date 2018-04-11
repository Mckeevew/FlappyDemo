package com.mckeevew.flappydemo;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mckeevew.flappydemo.states.GameStateManager;
import com.mckeevew.flappydemo.states.MenuState;

public class FlappyDemo extends ApplicationAdapter {

	//Window size is 0.6x the one used in tutorial
	public static final int WIDTH = 480;
	public static final int HEIGHT = 720;
	public static final String TITLE = "FlappyDemo";

	private GameStateManager gsm;
	private SpriteBatch batch;				//Should only have one of in the game
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		gsm = new GameStateManager();
		Gdx.gl.glClearColor(1, 0, 0, 1);
		gsm.push(new MenuState(gsm));
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gsm.update(Gdx.graphics.getDeltaTime());
		gsm.render(batch);
	}
}
