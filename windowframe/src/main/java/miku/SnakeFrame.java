package miku;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class SnakeFrame {
    JFrame frame;
    JPanel panel2;
    JPanel snake;
    JPanel snaketail;
    Action rightAction;
    ArrayList<JPanel> arrSnake;
    SnakeFrame(){
        frame = new JFrame();
        snake = new JPanel();
        snaketail = new JPanel();
        arrSnake = new ArrayList<>();
        rightAction = new RightAction();
        snake.setBounds(20,20,60,20);
        snake.setBackground(Color.GREEN);
        snake.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        snake.getActionMap().put("rightAction",rightAction);
        frame.add(snake);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    public class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
//            snake.setLocation(snake.getX(),snake.getY()+10);
            snake.setLocation(snake.getX()+10,snake.getY());
        }
    }
}
