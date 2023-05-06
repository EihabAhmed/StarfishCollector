package com.mygdx.starfishcollectorch02;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Game myGame = new StarfishCollectorCh02Beta();
		Lwjgl3Application launcher = new Lwjgl3Application(myGame);
	}
}
