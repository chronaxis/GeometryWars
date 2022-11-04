package gameLogic;

import java.awt.event.*;

public class KL implements KeyListener {
	int[] keyDown = new int[255];

	@Override
	public void keyTyped(KeyEvent e) {
		return;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keyDown[e.getKeyCode()] = 1;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keyDown[e.getKeyCode()] = 0;
	}
	
	public int[] getKeys() {
		return keyDown;
	}
}
