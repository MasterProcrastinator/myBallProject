import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.Color;
public class Ball
{
    private int x,y,size,xSpeed,ySpeed;
    private Color color;

    public Ball(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        xSpeed = 6;
        ySpeed = 6;
        int r = (int)((Math.random()) * 256 + 0);
        int g = (int)((Math.random()) * 256 + 0);;
        int b = (int)((Math.random()) * 256 + 0);;
        color = new Color(r,g,b);
    }


    public void drawBall(Graphics g){
        g.fillOval(x,y,size,size);
        g.setColor(color);




    }
    public Color getColor(){
        return color;
    }

    public int getSize(){
        return size;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getXSpeed(){
        return xSpeed;
    }
    public int getYSpeed(){
        return ySpeed;
    }


    public void move(JPanel anyName){
        x += xSpeed;
        y += ySpeed;
        if(x>=(anyName.getWidth()-size) || x<=0){
            xSpeed*=-1;
        }
        if(y>=(anyName.getHeight()-size) || y<=0){
            ySpeed*=-1;
        }

        }
    }

