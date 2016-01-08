package com.mime.minefront.input;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class InputHandler implements KeyListener, FocusListener, MouseListener, MouseMotionListener {

	public boolean[] key = new boolean[68836];
	public static int MouseX;
	public static int MouseY;
	public static int MouseDX; // d = drag X
	public static int MouseDY;
	public static int MousePX; // p = pressed x coordinates
	public static int MousePY;
	public static int MouseButton;
	public static boolean dragged = false;
	
	public void mouseDragged(MouseEvent e) {
		dragged = true;
		MouseDX = e.getX();
		MouseDY = e.getY();
		
	}

	
	public void mouseMoved(MouseEvent e) {
		MouseX = e.getX();
		MouseY = e.getY();
		
	}

	
	public void mouseClicked(MouseEvent e) {
		
		
	}

	
	public void mouseEntered(MouseEvent e) {
		
		
	}

	
	public void mouseExited(MouseEvent e) {
		
		
	}

	
	public void mousePressed(MouseEvent e) {
		MouseButton = e.getButton();
		MousePX = e.getX();
		MousePY = e.getY();
		
		
		
	}

	
	public void mouseReleased(MouseEvent e) {
		MouseButton = 0;
		dragged = false;
		
		
	}

	
	public void focusGained(FocusEvent e) {
		
		
	}

	
	public void focusLost(FocusEvent e) {
		for (int i = 0; i < key.length; i++){
			key[i] = false;
		}
		
	}

	
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if( keyCode > 0 && keyCode < key.length){
			key[keyCode] = true;
		}
		
	}

	
	public void keyReleased(KeyEvent e) {
		int keyCode = e.getKeyCode();
		if ( keyCode > 0 && keyCode < key.length){
			key[keyCode] = false;
		}
		
	}

	
	public void keyTyped(KeyEvent e) {
		
		
	}
	
	

}
