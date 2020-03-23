package com.gmail.gorbasenko245;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class CommandServise {
    DBServise dBflatServise = new DBServise();
    public void check(String command, Connection connection, Scanner scanner) throws SQLException {
        //switch почему то в данно методе работает неккоректно
            if(command.equals("1")){
                dBflatServise.addFlat(scanner,connection);
            }else{
                if(command.equals("2")){
                    dBflatServise.deleteFlat(connection,scanner);
                }else{
                    if(command.equals("3")){
                        dBflatServise.findByDistrict(connection,scanner);
                    }else{
                        if(command.equals("4")){
                            dBflatServise.findByAddress(connection,scanner);
                        }else {
                            if(command.equals("5")){
                                dBflatServise.findByArea(connection, scanner);
                            }else{
                                if(command.equals("6")){
                                    dBflatServise.findByroomQuantity(connection,scanner);
                                }else{
                                    if(command.equals("7")){
                                        dBflatServise.findByPrice(connection,scanner);
                                    }else{
                                        if(command.equals("8")){
                                            dBflatServise.viewAllFlats(connection);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

}
