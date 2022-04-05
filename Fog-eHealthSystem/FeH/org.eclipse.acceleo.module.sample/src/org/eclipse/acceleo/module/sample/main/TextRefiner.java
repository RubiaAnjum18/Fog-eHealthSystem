package org.eclipse.acceleo.module.sample.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;

/**
 * 
 * @author Yasir
 *
 */
public class TextRefiner
{
	
	public File refinePropsFileText(File file, String path)
	{
		String oldPath = file.getPath();
		file.renameTo(new File(path));
		File tdFile = new File(oldPath);
		if(tdFile.exists()) {
			tdFile.delete();
		}
		
		return file;
	}
	
	public File refineBehaviorFileText(File file, String path)
	{
		File polishedFile = null;
		Vector<String> rawLines = new Vector<String>();
		String setText = "";
		BufferedReader reader = null;
		
		try {
			reader = new BufferedReader(new FileReader(file));
				
			while(true) {
				String line = reader.readLine();
				if(line == null) {
					break;
				}
				else if(!line.trim().isEmpty()) {
					rawLines.add(line.trim());
				}
			}
			
			reader.close();

			file.delete();
			
			if(!rawLines.isEmpty()) {
				String initCorrectedText = "";
				for(String text : rawLines) {
					initCorrectedText += text+"\n";
				}
				initCorrectedText = initCorrectedText.replace("\n;", ";\n").replace("\n)", ")").
						replace("&&)", ")").replace("&&\n", "&& ").replace("\n&&", "&&").replace(",}", "}").
						replace(",\n}", "\n}").replace(",)", ")").replace(",\n)", "\n)").trim();
				
				String[] lines = initCorrectedText.split("\n");
				
				for(int i=1; i<lines.length; i++) {				// To remove empty blocks
					if(lines[i].startsWith("{")) {
						if(lines.length > i+1 && lines[i+1].startsWith("}")) {
							lines[i-1] = lines[i] = lines[i+1] = "";
							i++;
						}
					}
				}
				
				String indented = "";
				for(int i=0; i<lines.length; i++) {
					String line = lines[i];
					if(line.isEmpty()) {
						continue;
					}
					if(line.startsWith("}")){
						if(indented.length()<=6) {
							indented = "";
						}
						else {
							indented = indented.substring(6);
						}
						lines[i] = indented + line;
					}
					else {
						lines[i] = indented + line;
						if(line.startsWith("{")) {
							indented += "      ";
						}
					}
				}

				for(String text : lines) {
					if(!text.isEmpty() && !text.contains("##dl#")) {
						setText += text+"\n";
					}
				}
				
				setText = setText.replace("{",  "  begin").replace("}",  "  end");
				setText = setText.replace("##el#", "").replace("##ob#", "{").replace("##cb#", "}").replace("##sp#", " ");
				
				polishedFile = new File(path);
				
				setText = setText.replace("\n", System.lineSeparator());
				PrintWriter writer = new PrintWriter(polishedFile, "UTF-8");
				writer.print(setText);
				writer.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(file != null) {
				file.delete();
			}
		}

		return polishedFile;
	}
}
