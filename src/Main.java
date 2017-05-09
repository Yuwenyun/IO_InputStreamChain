import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * by wrapping InputStream, we could achieve buffer function
 * @author profe_000
 */
public class Main {

	public static void main(String[] args)
	{
		File file = new File("Owen.txt");
		BufferedReader reader = null;
		try 
		{
			//both BufferedInputStream and FileInputStream extends
			//from InputStream
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			while((tempString = reader.readLine()) != null)
				System.out.println(tempString);
		} 
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			if(reader != null)
			{
				try 
				{
					reader.close();
				} 
				catch (IOException e) 
				{
					e.printStackTrace();
				}
			}
		}
	}
}
