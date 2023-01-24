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
        xSpeed = 100;
        ySpeed = 100;
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


}