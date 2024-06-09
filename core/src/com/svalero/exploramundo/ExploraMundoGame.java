package com.svalero.exploramundo;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public class ExploraMundoGame extends Game {
    public SpriteBatch batch;
    public Music backgroundMusic;
    public Sound gemSound;
    public Sound collisionSound;

    @Override
    public void create() {
        batch = new SpriteBatch();
        backgroundMusic = Gdx.audio.newMusic(Gdx.files.internal("Audio/background_music.mp3"));
        gemSound = Gdx.audio.newSound(Gdx.files.internal("Audio/handleCoins.ogg"));
        collisionSound = Gdx.audio.newSound(Gdx.files.internal("Audio/metalLatch.ogg"));

        backgroundMusic.setLooping(true);
        backgroundMusic.play();

        setScreen(new MainMenuScreen(this));
    }

    @Override
    public void render() {
        super.render();
    }

    @Override
    public void dispose() {
        batch.dispose();
        backgroundMusic.dispose();
        gemSound.dispose();
        collisionSound.dispose();
    }
}
