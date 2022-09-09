package simpliLearn;

import java.util.Scanner;

public class LockedMeClient 
{

	public static void main(String[] args) 
	{ 
		Scanner obj = new Scanner(System.in);
		int choose;
		
		do 
		{
			LockedMe.displayMenu();
			System.out.println("Enter your choice");
			choose = Integer.parseInt(obj.nextLine());
			switch(choose)
			{
			case 1:LockedMe.getAllFiles();
			break;
			case 2:LockedMe.createFiles();
			break;
			case 3:LockedMe.searchFiles();
			break;
			case 4:LockedMe.deleteFiles();
			break;
			case 5: System.exit(0);
			break;
			default: System.out.println("Invalid Option");
			break;
			
			
			}
		}
		while(choose>0);
		obj.next();
		obj.close();

	}

}
