package Config;

import java.util.Properties;

import Base.BrowserType;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ConfigReader {
	
    public static  void PopulateSettings() throws IOException {
        ConfigReader reader = new ConfigReader();
        reader.ReadProperty();
    }



    private void ReadProperty() throws IOException {
        //Create Property Object
        Properties p = new Properties();
        //Load the Property file available in same package
        InputStream inputStream = new FileInputStream("src/main/java/config/GlobalConfig.properties");
        p.load(inputStream);
        //Get AUT
        Settings.AUT = p.getProperty("AUT");
        //Browser Type
        Settings.BrowserType = BrowserType.valueOf(p.getProperty("BrowserType"));


    }


}
