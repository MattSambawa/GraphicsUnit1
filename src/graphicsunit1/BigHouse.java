import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      //call bigHouse
       bigHouse(window);
   }

   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.GREEN);

      window.fillRect( 200, 200, 400, 400 );
      
      window.setColor(Color.RED);
      window.fillRect(110, 150, 600, 100);
      
      window.setColor(Color.YELLOW);
      window.fillRect(350, 500, 100, 500);
      
      window.fillRect(250, 280, 50, 50);
      window.fillRect(500, 280, 50, 50);
   }
}