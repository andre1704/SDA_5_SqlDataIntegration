package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        MySqlService mySqlService=new MySqlService();
        mySqlService.printData("select * from customer");

        JFrame frame=new JFrame("SQL workbench");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setMinimumSize(new Dimension(500,500));

        DataPanel dataPanel=new DataPanel();
        dataPanel.fillWithDataByQuery("select * from customer");
        frame.setContentPane(dataPanel);
        frame.pack();
        frame.setVisible(true);


    }
}
