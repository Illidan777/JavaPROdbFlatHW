package com.gmail.gorbasenko245;

import java.sql.*;
import java.util.Scanner;

public class DBServise {
    Flat flat = new Flat();

    protected static void initDB(Connection connection) throws SQLException {
        Statement st = connection.createStatement();
        try {
            st.execute("DROP TABLE IF EXISTS Flats");
            st.execute("CREATE TABLE Flats (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, district VARCHAR(30) NOT NULL," +
                    " address VARCHAR(30) NOT NULL, area DOUBLE NOT NULL , roomQuantity INT NOT NULL, price INT NOT NULL )");
        } finally {
            st.close();
        }
    }

    protected static void addFlat(Scanner sc, Connection connection) throws SQLException {
        System.out.print("Enter district: ");
        String district = sc.nextLine();
        System.out.print("Enter address: ");
        String address = sc.nextLine();
        System.out.print("Enter area: ");
        double area = sc.nextDouble();
        System.out.print("Enter roomQuantity: ");
        int roomQuantity = sc.nextInt();
        System.out.println("Enter price: ");
        int price = sc.nextInt();
        System.out.println();
        PreparedStatement ps = connection.prepareStatement("INSERT INTO Flats (district, address, area, roomQuantity, price) VALUES(?, ?, ?, ?, ?)");
        try {
            ps.setString(1, district);
            ps.setString(2, address);
            ps.setDouble(3,area);
            ps.setInt(4, roomQuantity);
            ps.setInt(5,price);
            ps.executeUpdate();
        } finally {
            ps.close();
        }
    }

    protected static void deleteFlat(Connection connection, Scanner sc) throws SQLException {
        System.out.print("Enter address: ");
        String address = sc.nextLine();

        PreparedStatement ps = connection.prepareStatement("DELETE FROM Flats WHERE address = ?");
        try {
            ps.setString(1, address);
            ps.executeUpdate(); // for INSERT, UPDATE & DELETE
        } finally {
            ps.close();
        }
    }

   protected  static  void viewAllFlats(Connection connection) throws SQLException{
       PreparedStatement ps = connection.prepareStatement("SELECT * FROM Flats");
       try {
           ResultSet rs = ps.executeQuery();
           try {
               ResultSetMetaData md = rs.getMetaData();

               for (int i = 1; i <= md.getColumnCount(); i++)
                   System.out.print(md.getColumnName(i) + "\t\t");
               System.out.println();

               while (rs.next()) {
                   for (int i = 1; i <= md.getColumnCount(); i++) {
                       System.out.print(rs.getString(i) + "\t\t");
                   }
                   System.out.println();
               }
           } finally {
               rs.close();
           }
       } finally {
           ps.close();
       }
   }

   protected static void findByDistrict(Connection connection, Scanner sc)throws SQLException{
        System.out.println("Enter district: ");
        String district = sc.nextLine();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Flats WHERE district = ?");
        try{
            ps.setString(1,district);
            ResultSet rs = ps.executeQuery();
            try {
                ResultSetMetaData md = rs.getMetaData();
                for(int column = 1; column<=md.getColumnCount(); column++){
                    System.out.println(md.getColumnName(column) + "\t\t");
                }

                System.out.println();
                while (rs.next()){
                    for (int column = 1; column<=md.getColumnCount(); column++){
                        System.out.println(rs.getString(column)+ "\t\t");
                    }
                    System.out.println();
                }
            }finally {
                rs.close();
            }
        }finally {
            ps.close();
        }
    }

    protected static void findByAddress(Connection connection, Scanner sc)throws SQLException{
        System.out.println("Enter address: ");
        String address = sc.nextLine();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Flats WHERE address = ?");
        try{
            ps.setString(1,address);
            ResultSet rs = ps.executeQuery();
            try {
                ResultSetMetaData md = rs.getMetaData();
                for(int column = 1; column<=md.getColumnCount(); column++){
                    System.out.println(md.getColumnName(column) + "\t\t");
                }

                System.out.println();
                while (rs.next()){
                    for (int column = 1; column<=md.getColumnCount(); column++){
                        System.out.println(rs.getString(column)+ "\t\t");
                    }
                    System.out.println();
                }
            }finally {
                rs.close();
            }
        }finally {
            ps.close();
        }
    }
    protected static void findByArea(Connection connection, Scanner sc)throws SQLException{
        System.out.println("Enter area: ");
        String area = sc.nextLine();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Flats WHERE area = ?");
        try{
            ps.setString(1,area);
            ResultSet rs = ps.executeQuery();
            try {
                ResultSetMetaData md = rs.getMetaData();
                for(int column = 1; column<=md.getColumnCount(); column++){
                    System.out.println(md.getColumnName(column) + "\t\t");
                }

                System.out.println();
                while (rs.next()){
                    for (int column = 1; column<=md.getColumnCount(); column++){
                        System.out.println(rs.getString(column)+ "\t\t");
                    }
                    System.out.println();
                }
            }finally {
                rs.close();
            }
        }finally {
            ps.close();
        }
    }

    protected static void findByroomQuantity(Connection connection, Scanner sc)throws SQLException{
        System.out.println("Enter room quantity: ");
        String roomQuantity = sc.nextLine();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Flats WHERE roomQuantity = ?");
        try{
            ps.setString(1,roomQuantity);
            ResultSet rs = ps.executeQuery();
            try {
                ResultSetMetaData md = rs.getMetaData();
                for(int column = 1; column<=md.getColumnCount(); column++){
                    System.out.println(md.getColumnName(column) + "\t\t");
                }

                System.out.println();
                while (rs.next()){
                    for (int column = 1; column<=md.getColumnCount(); column++){
                        System.out.println(rs.getString(column)+ "\t\t");
                    }
                    System.out.println();
                }
            }finally {
                rs.close();
            }
        }finally {
            ps.close();
        }
    }

    protected static void findByPrice(Connection connection, Scanner sc)throws SQLException{
        System.out.println("Enter price: ");
        String price = sc.nextLine();
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM Flats WHERE price = ?");
        try{
            ps.setString(1,price);
            ResultSet rs = ps.executeQuery();
            try {
                ResultSetMetaData md = rs.getMetaData();
                for(int column = 1; column<=md.getColumnCount(); column++){
                    System.out.println(md.getColumnName(column) + "\t\t");
                }

                System.out.println();
                while (rs.next()){
                    for (int column = 1; column<=md.getColumnCount(); column++){
                        System.out.println(rs.getString(column)+ "\t\t");
                    }
                    System.out.println();
                }
            }finally {
                rs.close();
            }
        }finally {
            ps.close();
        }
    }

}


