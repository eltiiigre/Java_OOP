/*  Ella Rose B. Cabalatungan
 *  BSIT - 2
 *  Mr. Jessie Lagrosas
 *  August 16, 2019
 *  Midterm Project
*/

import java.util.Scanner;
class Main{
    public static void main(String[] args){
		
	Filewriter filewriter = new Filewriter(); 
	Delete delete = new Delete(); 
        Scanner in = new Scanner(System.in);
        int choice;
	
	boolean Exit = false;
	
        while(Exit==false){
            System.out.println("1- Add new student");
            System.out.println("press 2 for Scholar Student");
			System.out.println("press 3 to delete a student");
            System.out.println("Press any numbers to exit");
   
            choice = in.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.print("Enter Student's Id num : ");
                    String ridnum = in.next();
                    filewriter.RegularStud(ridnum);
                    break;
                case 2:
                    System.out.print("Enter Student's Id num : ");
                    String sidnum = in.next();
                    filewriter.ScholarStud(sidnum);
                    break;

				case 3:
					System.out.print(" Delete Student: ");
					String dIdNum = in.next();
                    delete.deleteData(dIdNum);
                    break;
                default:
				 Exit=true;
                    break;
            }
        }
    }   
} 