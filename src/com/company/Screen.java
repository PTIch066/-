package com.company;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Screen extends JPanel implements MouseMotionListener{
    static int fieldSize = 50;
    static int outSize = 10;
    private int field[][]= new int[fieldSize][fieldSize];
    JTextField[] text = new JTextField[outSize];
    int x = -10,y= -10;



    Screen() {



        JFrame frame = new JFrame();
        frame.setBounds(200, 200, 800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setResizable(false);
        frame.add(this);
        frame.setVisible(true);


        for(int i = 0; i < outSize; i++){
            text[i]=new JTextField();
            text[i].setBounds(550, (1+i)*20+27, 200,17);
            text[i].setVisible(true);
            frame.add(text[i]);
        }

        JButton rest = new JButton("rest");
        rest.setBounds(600, 420,100, 25);
        frame.add(rest);

        setBounds(0, 0, 500, 500);
        this.setBackground(Color.gray);

        addMouseMotionListener(this);

        rest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setBackground(Color.white);
                for(int i = 0; i <fieldSize; i++){
                    for(int j = 0; j <fieldSize;j++){
                        field[i][j]=0;
                    }
                }
            }
        });


    }

   public void mouseMoved(MouseEvent e){

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        x = e.getX(); y = e.getY();
        if(x <498 && y < 498 && x >2 && y >2) {
            field[(1+y) / 10][((1+x) / 10)] = 1;
           field[(-1+y) / 10][((-1+x) / 10)] = 1;
        }
        repaint();
    }
    public void paint(Graphics g){
        g.fillRect(x,y,10,10);
    }

    public int[][] getField(){
        return field;
    }

    public void reloadData(double finalCol[]){
        double some = 0;
        for(int i = 0; i < 10; i++){
            finalCol[i] += 50;
            some += finalCol[i];
        }
        some /= 100;
        for(int i = 0; i < 10; i++){
            String str = Double.toString( Math.round(finalCol[i]/some));
            //String str= Double.toString( Math.round(finalCol[i]*100));
            text[i].setText(str);
            text[i].repaint();
        }
    }
}
