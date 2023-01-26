import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;

public class BallPanel extends JPanel
{

    //20 random balls, make loop system that adds a new ball variable to an array


    Ball marble = new Ball(40,40,10);
    Ball ok = new Ball(100,100,60);


    public BallPanel()
    {


        this.setFocusable(true);
        this.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                int blah = e.getKeyCode();
                if (blah == 37){
                    ok.moveLeft();
                    if(ok.getX()<=0){
                        int change = ok.getX()+ getWidth() - ok.getSize();
                        ok.setX(change);
                    }
                }
                if (blah == 39){
                    ok.moveRight();
                    if(ok.getX()>=(getWidth()-ok.getSize())){
                        int change = ok.getX()- getWidth()+ok.getSize();
                        ok.setX(change);
                    }
                }
                if (blah == 38 && ok.getY()>=0){
                    ok.moveUp();

                }
                if (blah == 40 && ok.getY()<=(getHeight()-ok.getSize())){
                    ok.moveDown();

                    }


            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });




        setBackground(Color.RED);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        marble.drawBall(g);

        ok.drawBall(g);
        marble.move();


        try{
            Thread.sleep(20);
        }
        catch(Exception e){
            System.out.println(e);
        }
        repaint();
    }
}