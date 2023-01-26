import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Ball
{
    private int x,y,size,xSpeed,ySpeed;

    public Ball(int x, int y, int size){
        this.x = x;
        this.y = y;
        this.size = size;
        xSpeed = 6;
        ySpeed = 6;
    }


    public void drawBall(Graphics g){
        g.fillOval(x,y,size,size);

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
    public void moveRight(){
        x+= 5;
    }
    public void moveLeft(){
        x = x-5;
    }
    public void moveDown(){
        y+=5;
    }
    public void moveUp(){
        y+=-5;
    }
    public void setX(int x2)
    {
        x = x2;
    }
    public void setY(int y2){
        y = y2;
    }
    public void move(){
        x += xSpeed;
        y += ySpeed;
    }

}