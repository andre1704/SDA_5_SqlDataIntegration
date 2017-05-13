package com.company;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by RENT on 2017-05-13.
 */
public class MySqlService {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;


    public MySqlService() {
        connect();
    }

    public String[][] getData(String query) {
        executeQuer(query);
        try {
            int columnCount = resultSet.getMetaData().getColumnCount();
            ArrayList<String[]> dataArray = new ArrayList<>();
            while (resultSet.next()) {
                String[] rowData = new String[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = resultSet.getString(i);
                }
                dataArray.add(rowData);
            }
            return dataArray.toArray(new String[dataArray.size()][columnCount]);


        } catch (SQLException e) {
            e.printStackTrace();
        }


        return null;//TODO
    }


    public void printData(String query) {
        executeQuer(query);
        try {
            int columnCount = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                System.out.println(resultSet.getMetaData().getColumnName(i) + "\t");
            }


            while (resultSet.next()) {
                System.out.println();
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + "\t");
                }

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }


    private void executeQuer(String queryToExecute) {
        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery(queryToExecute);
            System.out.println(resultSet.getMetaData().getColumnCount());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void connect() {
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://localhost/sakila?user=root");
            System.out.println("connected");
        } catch (SQLException e) {
            connection = null;
            e.printStackTrace();
        }
    }
}
