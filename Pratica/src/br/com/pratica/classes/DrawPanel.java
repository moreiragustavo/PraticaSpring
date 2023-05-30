package br.com.pratica.classes;

import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawPanel extends JPanel 
{
	
	public void paintComponent(Graphics g) 
	{
		
		
	super.paintComponent(g);
		
		int width = getWidth(); // largura total
		int heigth = getHeight(); // altura total
		
		
		g.drawLine(0, 0, width, heigth);
		
		
		g.drawLine(0, heigth, width, 0);
	}
	

} 
