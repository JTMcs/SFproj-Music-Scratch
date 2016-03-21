package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MusicScratch extends ApplicationAdapter {
	Music sound8bit;
	
	@Override
	public void create () {
		sound8bit = Gdx.audio.newMusic(Gdx.files.internal("8bit4.wav"));
        sound8bit.play();
	}

	@Override
	public void render () {
	}
}
