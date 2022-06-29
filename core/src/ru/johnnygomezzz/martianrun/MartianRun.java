package ru.johnnygomezzz.martianrun;

import com.badlogic.gdx.Game;

import ru.johnnygomezzz.martianrun.screens.GameScreen;

public class MartianRun extends Game {
	
	@Override
	public void create () {
		setScreen(new GameScreen());
	}
}
