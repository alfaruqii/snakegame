package miku;

import sun.jvm.hotspot.ui.JFrameWrapper;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 *
 */
public class App 
{
    static JFrame frame;
    static Body snake;
    public static void main( String[] args )
    {
        snake = new Body();
        frame = new JFrame();
        snake.setBounds(0,0,50,50);
        snake.setBackground(Color.RED);
        frame.add(snake);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
