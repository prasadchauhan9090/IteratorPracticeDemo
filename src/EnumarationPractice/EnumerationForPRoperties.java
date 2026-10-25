package EnumarationPractice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class EnumerationForPRoperties {


    public static void main(String args[]) throws IOException
    {

        File file = new File("DBConfig.properties");
        if(!file.exists())
        file.createNewFile();


        Properties prop = new Properties();

        prop.setProperty("url","localhost:8080");
        prop.setProperty("username","admin");
        prop.setProperty("password","admin");

        FileOutputStream fos = new FileOutputStream(file);

        prop.store(fos,"New Properties file created successfully");

        Enumeration<Object> e = prop.elements();
        while(e.hasMoreElements())
        {
            System.out.print(e.nextElement()+"  ");
        }


    }
}

