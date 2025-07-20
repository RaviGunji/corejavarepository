import java.util.*;
import java.io.*;
class PropertiesDemo 
{
	public static void main(String[] args) throws Exception
	{
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");
		p.load(fis);
		p.setProperty("venky","100");
		p.setProperty("Ballayya","Super");
		System.out.println(p);
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos,"Updated By Ravi!");
	}
}
