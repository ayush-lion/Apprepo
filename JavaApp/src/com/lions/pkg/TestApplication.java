package com.lions.pkg;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JApplet;
import javax.swing.JPanel;

public class TestApplication extends JApplet {

private static final long serialVersionUID = 1L;

    JPanel p1,p2,p3,p4;

    public void init(){         
        setLayout(new GridLayout(2,2));
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        
        p1.setBackground(Color.RED);
        p2.setBackground(Color.GREEN);
        p3.setBackground(Color.BLUE);
        p3.setBackground(Color.	CYAN);
        
        add(p1);
        add(p2);
        add(p3);
        add(p4);
        
        setSize(400,400);
    }   
}
