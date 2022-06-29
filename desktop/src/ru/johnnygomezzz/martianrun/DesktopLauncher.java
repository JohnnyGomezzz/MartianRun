package ru.johnnygomezzz.martianrun;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration;

public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setForegroundFPS(60);
		config.setTitle("MartianRun");

		Lwjgl3WindowConfiguration windowConfiguration = new Lwjgl3WindowConfiguration();
		windowConfiguration.setResizable(false);

		new Lwjgl3Application(new MartianRun(), config);
	}
}
