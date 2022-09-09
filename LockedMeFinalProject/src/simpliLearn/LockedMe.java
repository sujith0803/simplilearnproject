package simpliLearn;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LockedMe 
{
	static final String projectFilesPath = "C:\\Users\\sujith\\eclipse-workspace\\LockedMeFile";
	
	public static void displayMenu()
	{
		System.out.println("-----------------------------------------");
		System.out.println("\tWelcome to LockedMe secure app");
		System.out.println("\tDeveloper Name: P.Sujith");
		System.out.println("-----------------------------------------");
		System.out.println("\t1. Display Files");
		System.out.println("\t2. Add Files");
		System.out.println("\t3. Search Files");
		System.out.println("\t4. Delete Files");
		System.out.println("\t5. Exit");
	}
	public static void getAllFiles() 
	{
		File folder = new File(projectFilesPath);
		File[] listofFiles = folder.listFiles();
		
		if(listofFiles.length>0) 
		{
			System.out.println("Files are displayed below");
			for(var l:listofFiles)
			{
				System.out.println(l.getName());
			}
		}
			else 
			{
				System.out.println("This folder is empty");
			}	
		
	}
	public static void createFiles()
	{
		try {
		Scanner obj = new Scanner(System.in);
		String fileName;
		System.out.println("Enter file name");
		fileName=obj.nextLine();
		int linesCount;
		System.out.println("Enter how many lines you want to enter");
		linesCount=Integer.parseInt(obj.nextLine());
		FileWriter fw= new FileWriter(projectFilesPath+"\\"+fileName);
		for(int i=1;i<=linesCount;i++) 
		{
			System.out.println("Enter file line:");
			fw.write(obj.nextLine()+"\n");
		}
		System.out.println("file created succesfully");
		fw.close();
		}
		catch (Exception e)
		{
			
		}
	}
	public static void searchFiles()
	{
	Scanner obj = new Scanner(System.in);
	try
	{
	String fileName;
	System.out.println("Enter file name to be searched:");
	fileName=obj.nextLine();
	File fl = new File(projectFilesPath+"\\"+fileName);
	if(fl.exists())
	{
	System.out.println("File is available");
	}
	else
	{
	System.out.println("File is not available ");
	}
	}
	catch(Exception Ex)
	{
	}
	}
	public static void deleteFiles()
	{
	Scanner obj = new Scanner(System.in);
	try
	{
	String fileName;
	System.out.println("Enter file name to be deleted:");
	fileName=obj.nextLine();
	File fl = new File(projectFilesPath+"\\"+fileName);
	if(fl.exists())
	{
	fl.delete();
	System.out.println("File deleted successfully");
	}
	else
	{
	System.out.println("File do not exist");
	}
	}
	catch(Exception Ex)
	{
	System.out.println("Some error occured");
	}
	}
}
