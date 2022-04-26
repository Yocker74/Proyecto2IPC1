
package com.mycompany.src.torreshanoiydamas.model;

public abstract class Player {

	public abstract boolean isHuman();
	
	public abstract void updateGame(Game game);
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + "[isHuman=" + isHuman() + "]";
	}
	public static void name() {
	}
}
