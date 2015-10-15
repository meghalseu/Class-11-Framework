package framework.dataaccess;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class TextFileReader {
	
	public static List<String> getTextFileData (String filePath) throws IOException
{
	
	ArrayList<String> lines = new ArrayList<>();
	BufferedReader br = new BufferedReader(new FileReader(filePath));
	
	String line;
	while ((line = br.readLine()) != null) 
	{
		lines.add(line);
	}
	
	br.close();
	return lines;
		
}
	
}
