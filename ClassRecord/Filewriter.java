import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;


class Filewriter // Class for Creating A File/Print writer
{
 private PrintWriter writer;	
	 public void RegularStud(String idnum) 
    {
		  try	
        {		
			CalQPI cq = new CalQPI(); // Creates and calls the class CalQPI. cq as the object name
            Regular rs = new Regular(); // Creates and calls the class Regular Stud. rs as the object name
			Course it = new Course(); // Creates and calls the class Course. it as the object name
            writer = new PrintWriter(new FileWriter(idnum)); // Creates A File/Print for Regular Student, using it's ID # as the filename 
			Scanner in = new Scanner(System.in);
	
			writer.println("Regular Student's Information ");
			System.out.println("Regular ");

            System.out.print("Name: ");
            writer.println("Name - " + rs.setName(in.nextLine())); 
			
			System.out.print("Birthday: ");
			writer.println("Birthday - " + rs.setbirthdate(in.nextLine()));
			
			System.out.print("Age: ");
			writer.println("Age - " + rs.setAge(in.nextLine()));
		
	
            System.out.print("Contact Number: ");
            writer.println("Contact Number - " + rs.setcontactNum(in.nextLine()));
			
			in.nextLine(); // bug
			System.out.print("Address: ");
			writer.println("Address - " + rs.setAddress(in.next()));
			
			 System.out.print("Guardian Name: ");
            writer.println("Guardian Name - " + rs.setGuardianName(in.next()));
			
			
			System.out.print("Guardian Number: ");
            writer.println("Guardian Number - " + rs.setGuardianNum(in.nextLine()));
			
			in.nextLine();//bug
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse1(in.nextLine()));
			
			
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse2(in.nextLine()));
			
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse3(in.nextLine()));
			
			
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse4(in.nextLine()));
			
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse5(in.nextLine()));
			
			  
		    System.out.print(it.getCourse1() + " units: ");
		    writer.println(it.getCourse1() + " units - " + cq.setUnit1(in.nextInt()));
			
			 System.out.print(it.getCourse2() + " units:");
		    writer.println(it.getCourse2() + " units - " + cq.setUnit2(in.nextInt()));
			
			 System.out.print(it.getCourse3() + " units:");
		    writer.println(it.getCourse3() + " units - " + cq.setUnit3(in.nextInt()));
			
			in.nextLine(); //bug
			   System.out.print(it.getCourse4() + " units:");
		    writer.println(it.getCourse4() + " units - " + cq.setUnit4(in.nextInt()));
			
			   System.out.print(it.getCourse5() + " units:");
		    writer.println(it.getCourse5() + " units - " + cq.setUnit5(in.nextInt()));
			
			
			System.out.println("Legend for inputting the Grades: ");
	System.out.println("A = 4 || A- = 3.5 - 3.9 || B = 3 - 3.4 || B- = 2.5 - 2.99 || C = 2 - 2.4 || D = 1 || 0 - 0.99 = F ");
			
			 in.nextLine();//bug
			 System.out.print(it.getCourse1() + " Input (Letter) Grade:");
            writer.println(it.getCourse1() + " Grade - " + cq.setGrade1(in.nextLine()));
			
			 System.out.print(it.getCourse2() + " Input (Letter) Grade:");
            writer.println(it.getCourse2() + " Grade - " + cq.setGrade2(in.nextLine()));
			
			
			 System.out.print(it.getCourse3() + " Input (Letter) Grade:");
            writer.println(it.getCourse3() + " Grade -" + cq.setGrade3(in.nextLine()));
			
			 System.out.print(it.getCourse4() + " Input (Letter) Grade:");
            writer.println(it.getCourse4() + " Grade - "  + cq.setGrade4(in.nextLine()));
			
				System.out.print(it.getCourse5() + " Input (Letter)  Grade:");
            writer.println(it.getCourse5() + " Grade - " + cq.setGrade5(in.nextLine()));
			
			
			double num = 0;
			String letter = " ";
			
			//Getting the Grades
			cq.getQ1(cq.getGrade1(),num);
			cq.getQ2(cq.getGrade2(),num);
			cq.getQ3(cq.getGrade3(),num);
			cq.getQ4(cq.getGrade4(),num);
			cq.getQ5(cq.getGrade5(),num);
			
			
			System.out.println("Final Grade Letter: " + cq.getFinalGrade(letter, cq.FinalGrade()));
			writer.println("Final Grade Letter: " + cq.getFinalGrade(letter, cq.FinalGrade()));
			
			System.out.println("Final Grade Equivalent: " + cq.FinalGrade());
			writer.println("Final Grade: " + cq.FinalGrade());

		
			
	System.out.print("Minimum Grade  Requirement //ex. 4 = A , 3.5 = A- , 3 = B , 2.5 = B- , 2 = C , 1 = D, 0 = F : ");
            writer.println("Minimum Grade Requirement to Pass: " + rs.setMinGradeReq(in.nextDouble()));
			
			System.out.println("Minimum Grade Letter Equivalent: " + cq.getLetterReq(letter, rs.getMinGradeReq()));
			writer.println("Minimum Grade Letter Equivalent: " + cq.getLetterReq(letter, rs.getMinGradeReq()));
			
		
            writer.close();

        }
        catch(Exception e)
        {
            System.out.println("bleep " + e);
        }
    } 
    public void ScholarStud(String idnum) 
    {
        try
        {
			CalQPI cq = new CalQPI(); // Creates and calls the class CalQPI . cq as the object name
			Course it = new Course(); // Creates and calls the class Course . it as the object name
            Scholar ss = new Scholar(); // Creates and calls the class Scholar Stud. rs as the object name
            writer = new PrintWriter(new FileWriter(idnum)); // Creates A File/Print for Scholar Student, using it's students ID # as the filename 
            Scanner in = new Scanner(System.in);
			
			writer.println("Scholar Student's Information:");
			System.out.println("Scholar ");
			
            System.out.print("Name: ");
            writer.println("Name - " + ss.setName(in.nextLine()));
			
			System.out.print("Age: ");
			writer.println("Age - " + ss.setAge(in.nextLine()));
			
			in.nextLine();//bug
            System.out.print("Birthday: ");
            writer.println("Birthday - " + ss.setbirthdate(in.nextLine()));
			
			
            System.out.print("Contact Number: ");
            writer.println("Contact Number - " + ss.setcontactNum(in.nextLine()));
			
			in.nextLine(); //bug
			System.out.print("Address: ");
			writer.println("Address - " + ss.setAddress(in.nextLine()));

		
            System.out.print("Guardian Name: ");
            writer.println("Guardian Name - " + ss.setGuardianName(in.nextLine()));
			

            System.out.print("Guardian Number: ");
            writer.println("Guardian Number: " + ss.setGuardianNum(in.nextLine()));
			
		
            System.out.print("Type of Scholarship: ");
            writer.println("Scholar Type - " + ss.setTypeScholar(in.nextLine()));
			
			
			in.nextLine();//bug
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse1(in.nextLine()));
			
			
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse2(in.nextLine()));
			
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse3(in.nextLine()));
			
			
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse4(in.nextLine()));
			
			System.out.print("Course Name: ");
			writer.println("Course Name - " + it.setCourse5(in.nextLine()));
			
			  
		    System.out.print(it.getCourse1() + " units:");
		    writer.println(it.getCourse1() + " units - " + cq.setUnit1(in.nextInt()));
			
			 System.out.print(it.getCourse2() + " units:");
		    writer.println(it.getCourse2() + " units - " + cq.setUnit2(in.nextInt()));
			
			 System.out.print(it.getCourse3() + " units:");
		    writer.println(it.getCourse3() + " units - " + cq.setUnit3(in.nextInt()));
			
			in.nextLine();//bug
			   System.out.print(it.getCourse4() + " units:");
		    writer.println(it.getCourse4() + " units - " + cq.setUnit4(in.nextInt()));
			
			   System.out.print(it.getCourse5() + " units:");
		    writer.println(it.getCourse5() + " units - " + cq.setUnit5(in.nextInt()));
			
			System.out.println("Legend for inputting the Grades: ");
	System.out.println("A = 4 || A- = 3.5 - 3.9 || B = 3 - 3.4 || B- = 2.5 - 2.99 || C = 2 - 2.4 || D = 1 || 0 - 0.99 = F ");
			
			 in.nextLine();//bug
			 System.out.print(it.getCourse1() + " Input (Letter) Grade:");
            writer.println(it.getCourse1() + " Grade - " + cq.setGrade1(in.nextLine()));
			
			 System.out.print(it.getCourse2() + " Input (Letter) Grade:");
            writer.println(it.getCourse2() + " Grade - " + cq.setGrade2(in.nextLine()));
			
			
			 System.out.print(it.getCourse3() + " Input (Letter) Grade:");
            writer.println(it.getCourse3() + " Grade - " + cq.setGrade3(in.nextLine()));
			
			 System.out.print(it.getCourse4() + "Input (Letter) Grade:");
            writer.println(it.getCourse4() + " Grade - "  + cq.setGrade4(in.nextLine()));
			
				System.out.print(it.getCourse5() + "Input (Letter) Grade:");
            writer.println(it.getCourse5() + " Grade - " + cq.setGrade5(in.nextLine()));
			
			double num = 0;
			String letter = " ";
			
			// Getting the Grades
			cq.getQ1(cq.getGrade1(),num);
			cq.getQ2(cq.getGrade2(),num);
			cq.getQ3(cq.getGrade3(),num);
			cq.getQ4(cq.getGrade4(),num);
			cq.getQ5(cq.getGrade5(),num);
			
			
			System.out.println("Final Grade Letter: " + cq.getFinalGrade(letter, cq.FinalGrade())); //calls the method @CalQPI
			writer.println("Final Grade Letter: " + cq.getFinalGrade(letter, cq.FinalGrade())); //calls the method @CalQPI
			
			System.out.println("Final Grade Letter Equivalent: " + cq.FinalGrade()); //calls the method @CalQPI
			writer.println("Final Grade: " + cq.FinalGrade()); //calls the method @CalQPI
		
			
			 System.out.print("Minimum Grade Requirement //ex. 4 = A , 3.5 = A- , 3 = B , 2.5 = B- , 2 = C , 1 = D, 0 = F : ");
            writer.println("Minimum Grade Requirement: " + ss.setMinGradeReq(in.nextDouble()));
			
			System.out.println("Minimum Grade Letter Requirement: " + cq.getLetterReq(letter, ss.getMinGradeReq())); //calls the method @CalQPI
			writer.println("Minimum Grade LEtter Requirement: " + cq.getLetterReq(letter, ss.getMinGradeReq())); //calls the method @CalQPI 
			
			

            writer.close();

        }
        catch(Exception e)
        {
            System.out.println("error " + e); 
        }
    }
	

}