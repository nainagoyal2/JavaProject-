package exceptionHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReadProcess {

	public static void main(String[] args) throws IOException, InterruptedException {
		//file instance provide path
		File f1 =new File(System.getProperty("user.dir")+"//FileData//config.properties");
		//to read data in stream
		FileInputStream f2 = new FileInputStream(f1);
		//PRroperties class
		Properties p1 = new Properties();
		 p1.load(f2);
		 Thread.sleep(1000);
		System.out.println(p1.get("bname"));
		System.out.println(p1.get("un"));
		
	
		
		
		
	}

}
