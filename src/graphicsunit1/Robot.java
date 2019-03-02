//(c) A+ Computer Science
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
 public Robot()    //constructor method - sets up the class
 {
    setSize(800,600);
    setBackground(Color.WHITE);   	
    setVisible(true);
 }

 public void paint( Graphics window )
 {
    window.setColor(Color.BLUE);

    window.drawString("Robot LAB ", 35, 35 );

    //call head method
    head(window);
    //call other methods
    upperBody(window);
    lowerBody(window);
 }

 public void head( Graphics window )
 {
    window.setColor(Color.YELLOW);

    window.fillOval(300, 100, 200, 100);
    
    window.setColor(Color.black);
    window.fillOval(350, 120, 30, 30);
    window.fillOval(420, 120, 30, 30);
    window.fillOval(380, 150, 40,20);
    
    window.drawArc(350, 170, 100, 10, 0, -180);

		//add more code here
				
 }

 public void upperBody( Graphics window )
 {
	 	window.fillRect(350, 200, 100, 100);
	 	window.drawLine(350, 200, 250, 150);
	 	window.drawLine(450, 200, 550, 150);
		//add more code here
 }

 public void lowerBody( Graphics window )
 {
	 	window.setColor(Color.gray);
	 	window.fillRect(350, 300, 100, 100);
	 	window.drawLine(350,400,250,450);
	 	window.drawLine(450, 400, 550, 450);
		//add more code here

 }
}