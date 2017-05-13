package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

/**
 * Created by RENT on 2017-05-13.
 */
public class DataPanel extends JPanel {
    private JTable dataTable;
    private JScrollPane dataScrollPane;
    public DataPanel() {
        super(new GridLayout(1,1));
        dataTable=new JTable();
        dataTable.setModel(new DefaultTableModel());

        String [][] data={{"a,","b","c"},{"a,","b","c"}};
        String[] column={"imie","nazwisko","adres"};
        dataTable.setModel(new DefaultTableModel(data,column));
        dataScrollPane=new JScrollPane(dataTable);

        add(dataScrollPane);
    }
    public void fillWithDataByQuery(String query){
        MySqlService sqlService=new MySqlService();
        String [][] data=sqlService.getData(query);
        String[] column={"imie","nazwisko","adres","imie","nazwisko","adres","imie","nazwisko","adres"};
        dataTable.setModel(new DefaultTableModel(data,column));
    }
}
