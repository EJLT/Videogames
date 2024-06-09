package com.svalero.exploramundo;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen implements Screen {
    private final ExploraMundoGame game;
    private SpriteBatch batch;
    private Texture playerTexture;
    private Texture backgroundTexture;
    private Texture heartFullTexture;
    private Texture gemTexture;

    public GameScreen(final ExploraMundoGame game) {
        this.game = game;
        batch = new SpriteBatch();
        // Cargar texturas
        playerTexture = new Texture(Gdx.files.internal("Player/p1_stand.png"));
        backgroundTexture = new Texture(Gdx.files.internal("bg.png"));
        heartFullTexture = new Texture(Gdx.files.internal("HUD/hud_heartFull.png"));
        gemTexture = new Texture(Gdx.files.internal("HUD/hud_gem_blue.png"));
    }

    @Override
    public void show() {}

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        // Dibujar fondo
        batch.draw(backgroundTexture, 0, 0);
        // Dibujar personaje del jugador
        batch.draw(playerTexture, 50, 50);
        // Dibujar elementos del HUD
        batch.draw(heartFullTexture, 10, Gdx.graphics.getHeight() - 50); // Corazón de vida
        batch.draw(gemTexture, 10, Gdx.graphics.getHeight() - 100); // Gema azul
        batch.end();
    }

    @Override
    public void resize(int width, int height) {}

    @Override
    public void pause() {}

    @Override
    public void resume() {}

    @Override
    public void hide() {}

    @Override
    public void dispose() {
        batch.dispose();
        playerTexture.dispose();
        backgroundTexture.dispose();
        heartFullTexture.dispose();
        gemTexture.dispose();
    }
}
