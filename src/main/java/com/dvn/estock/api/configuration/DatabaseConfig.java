package com.dvn.estock.api.configuration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.dvn.estock.api.util.ConstantEnv;

public class DatabaseConfig{

    private static String drive;
    private static String url;
    private static String user;
    private static String password;
    private static String dialect;

    private DatabaseConfig(){}

    static{

        try {
			FileReader file = new FileReader(ConstantEnv.getDatabaseConfgDirectoryEnv());
			BufferedReader reader = new BufferedReader(file);
            
            String line = null;

            line = reader.readLine();
            if(line != null){DatabaseConfig.drive = line;}else{DatabaseConfig.drive = "UNDEFINED";}
            
            line = reader.readLine();
            if(line != null){DatabaseConfig.url = line;}else{DatabaseConfig.url = "UNDEFINED";}

            line = reader.readLine();
            if(line != null){DatabaseConfig.user = line;}else{DatabaseConfig.user = "UNDEFINED";}

            line = reader.readLine();
            if(line != null){DatabaseConfig.password = line;}else{DatabaseConfig.password = "UNDEFINED";}

            line = reader.readLine();
            if(line != null){DatabaseConfig.dialect = line;}else{DatabaseConfig.dialect = "UNDEFINED";}

            file.close();
            reader.close();
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
    }

    public static String getDrive(){
        return DatabaseConfig.drive;
    }
    public static String getUrl(){
        return DatabaseConfig.url;
    }
    public static String getUser(){
        return DatabaseConfig.user;
    }
    public static String getPassword(){
        return DatabaseConfig.password;
    }
    public static String getDialect(){
        return DatabaseConfig.dialect;
    }

}