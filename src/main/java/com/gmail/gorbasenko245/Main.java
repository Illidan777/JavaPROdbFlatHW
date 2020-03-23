package com.gmail.gorbasenko245;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    DbProperties dbProperties = new DbProperties();
    CommandServise commandServise = new CommandServise();
    try{
        try(Connection connection =DriverManager.getConnection(dbProperties.getUrl(),dbProperties.getUser(), dbProperties.getPassword())){
            DBServise.initDB(connection);
            CommandList.showCommandList();
            while (true){
                System.out.println("Enter your command: ");
                String text = scanner.nextLine();
                if(text!=""){
                    commandServise.check(text,connection,scanner);
                }else{
                    return;
                }
            }
        }finally {
            scanner.close();
        }
    }catch (SQLException e){
        e.printStackTrace();
        return;
    }

    }
}
