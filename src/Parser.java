import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;

public class Parser {
	
	File file;
	ArrayList<HashMap> objects = new ArrayList<HashMap>();
	
	public Parser(String given_file) throws IOException {
	
		File file = new File(given_file);
		String absolutePath = file.getAbsolutePath();
		
		BufferedReader br = new BufferedReader(new FileReader(absolutePath));
		String firstLine = br.readLine();
		String [] header = firstLine.split(",");
		String line = null;
		while ((line = br.readLine()) != null){
			String [] lineArray = line.split(",");
			HashMap<String,String> objectHash = new HashMap<String, String>();
			objectHash.put(header[0], lineArray[0]);
			objectHash.put(header[1], lineArray[1]);
			objectHash.put(header[2], lineArray[2]);
			objectHash.put(header[3], lineArray[3]);
			objectHash.put(header[4], lineArray[4]);
			this.objects.add(objectHash);	
		}
		br.close();

	}
	
	public ArrayList<HashMap> getObjects() {
		return this.objects;
	}

}
