package ru.johnnygomezzz.martianrun;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;

import ru.johnnygomezzz.martianrun.screens.MainMenuScreen;

public class MartianRun extends Game {

	public SpriteBatch batch;
	public BitmapFont font;
	public BitmapFont myfont;

	@Override
	public void create() {

		batch = new SpriteBatch();


		font = new BitmapFont();
		myfont = new BitmapFont();

		final String FONT_CHARS = "абвгдежзийклмнопрстуфхцчшщъыьэюяabcdefghijklmnopqrstuvwxyzАБВГДЕЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789][_!$%#@|\\\\/?-+=()*&.;:,{}\\\"´`'<>";



		final String FONT_PATH = "fonts/Imperial Web.ttf";
		FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal(FONT_PATH));
		FreeTypeFontGenerator.FreeTypeFontParameter parameter = new FreeTypeFontGenerator.FreeTypeFontParameter();
		parameter.characters = FONT_CHARS;
		parameter.size = 17;
		parameter.color = Color.BROWN;
		myfont = generator.generateFont(parameter);
		generator.dispose();



		this.setScreen(new MainMenuScreen(this));

		font.setColor(1f, 0f, 0f, 1f);
	}

	// Get rid of render function, let the parent class handle it

	@Override
	public void dispose() {
		super.dispose();
		batch.dispose();

	}

}
