package ru.johnnygomezzz.martianrun.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

import ru.johnnygomezzz.martianrun.MartianRun;
import ru.johnnygomezzz.martianrun.stages.GameStage;

public class GameScreen implements Screen {

    private GameStage stage;
    final MartianRun Game;
    private String nagrada = "";


    public GameScreen(final MartianRun gam) {

        this.Game = gam;
        stage = new GameStage(Game);
    }

    @Override
    public void render(float delta) {

        //Clear the screen
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        //Update the stage
        stage.draw();
        stage.act(delta);

        Game.batch.begin();
        if (GameStage.ochkov >= 5) {
            nagrada=String.valueOf("отличная работа");
        }


        if (GameStage.ochkov == 10) {
            nagrada=String.valueOf("ты супер, перекури 5 секунд и вперед!");

            stage.addAction(
                    Actions.sequence(Actions.delay(5f),Actions.run(new Runnable() {

                        @Override
                        public void run() {

                            Game.setScreen(new GameScreen(Game));
                            GameStage.ochkov=0;
                            GameStage.stadya=1;

                            stage.dispose();
                        }
                    }))
            );

        }

        Game.myfont.draw(Game.batch, "Очки: " + GameStage.schot, 60, 460);
        String.valueOf(Game.myfont.draw(Game.batch, "Награда:" + nagrada, 240, 450));
        Game.batch.end();

    }



    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

}
