import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.*;
import java.sql.SQLOutput;
import java.awt.Color.*;
public class BallPanel extends JPanel
{

    //20 random balls, make loop system that adds a new ball variable to an array




    ArrayList<Ball> balls = new ArrayList<Ball>();

    public BallPanel()
    {
        setBackground(Color.RED);
        for(int i = 0;i<=20 ;i++) {

            int randomX = (int) ((Math.random() * 300) + 20);
            int randomY = (int) ((Math.random() * 300) + 20);
            int randomSize = (int) ((Math.random() * 60) + 10);
            balls.add(new Ball(randomX, randomY, randomSize));
            }

    }




    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        for(Ball array : balls) {
            array.drawBall(g);

            array.move(this);
        }


        try{
            Thread.sleep(20);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint();
    }
}