class CalQPI extends Course {

// Instantiation
	private double Q1;
	private double Q2;
	private double Q3;
	private double Q4;
	private double Q5;
	public double FinalGrade;
	
	//setting the grade Equivalent for each Grade returns Q1.
	public double getQ1(String Grade1, double Q1){
		
		if(Grade1.equals("F")){
			
			Q1 = 0;
			
		}
		else if(Grade1.equals("D")){
			
			Q1 = 1;
			
		}
		else if (Grade1.equals("C")){
			
			Q1 = 2;
			
			
		}
		else if (Grade1.equals("B-")){
			
			Q1 = 2.5;
			
			
		}
		else if (Grade1.equals("B")){
			
			Q1 = 3;
			
		}
		else if(Grade1.equals("A-")){
			
			Q1 = 3.5;
			
		}
		else if (Grade1.equals("A")){
			
			Q1 = 4;
			
		}
		
		return this.Q1 = Q1;
	}
	
//setting the grade Equivalent for each Grade returns Q2.
	public double getQ2(String Grade2, double Q2){
		
		if (Grade2.equals("F")){
			
			Q2 = 0;	
			
		}
		else if(Grade2.equals("D")){
			
			Q2 = 1;
			
		}
		else if (Grade2.equals("C")){
			
			Q2 = 2;
			
			
		}
		else if (Grade2.equals("B-")){
			
			Q2 = 2.5;
			
			
		}
		else if (Grade2.equals("B")){
			
			Q2 = 3;
			
		}
		else if(Grade2.equals("A-")){
			
			Q2 = 3.5;
			
		}
		else if (Grade2.equals("A")){
			
			Q2 = 4;
			
		}
		
	
	return this.Q2 = Q2;
	}
	
	//setting the grade Equivalent for each Grade returns Q3.
	public double getQ3(String Grade3, double Q3){
		
		if (Grade3.equals("F")){
			
			Q3 = 0;
			
		}
		else if(Grade3.equals("D")){
			
			Q3 = 1;
			
		}
		else if (Grade3.equals("C")){
			
			Q3 = 2;
			
			
		}
		else if (Grade3.equals("B-")){
			
			Q3 = 2.5;
			
			
		}
		else if (Grade3.equals("B")){
			
			Q3 = 3;
			
		}
		else if(Grade3.equals("A-")){
			
			Q3 = 3.5;
			
		}
		else if (Grade3.equals("A")){
			
			Q3 = 4;
			
		}
		
	
	return this.Q3 = Q3;
	}
	
	//setting the grade Equivalent for each Grade returns Q4.
	public double getQ4(String Grade4, double Q4){
		
		if (Grade4.equals("F")){
			
			Q4 = 0;
			
		}
		else if(Grade4.equals("D")){
			
			Q4 = 1;
			
		}
		else if (Grade4.equals("C")){
			
			Q4 = 2;
			
			
		}
		else if (Grade4.equals("B-")){
			
			Q4 = 2.5;
			
			
		}
		else if (Grade4.equals("B")){
			
			Q4 = 3;
			
		}
		else if(Grade4.equals("A-")){
			
			Q4 = 3.5;
			
		}
		else if (Grade4.equals("A")){
			
			Q4 = 4;
			
		}
		
	
	return this.Q4 = Q4;
	}
	
	//setting the grade Equivalent for each Grade returns Q5.
	public double getQ5(String Grade5, double Q5){
		
		if (Grade5.equals("F")){
			
			Q5 = 0;
			
		}
		else if(Grade5.equals("D")){
			
			Q5 = 1;
			
		}
		else if (Grade5.equals("C")){
			
			Q5 = 2;
			
			
		}
		else if (Grade5.equals("B-")){
			
			Q5 = 2.5;
			
			
		}
		else if (Grade5.equals("B")){
			
			Q5 = 3;
			
		}
		else if(Grade5.equals("A-")){
			
			Q5 = 3.5;
			
		}
		else if (Grade5.equals("A") || Grade5.equals("a")){
			
			Q5 = 4;
			
		}
		
	
	return this.Q5 = Q5;
	}
	
	// A Method in which calculates the QPI
	// returns sFinalGrade for the OverAll QPI
	
	public double FinalGrade() {
		
		double temp1 = Q1*Unit1;
		double temp2 = Q2*Unit2;
		double temp3 = Q3*Unit3;
		double temp4 = Q4*Unit4;
		double temp5 = Q5*Unit5;
		
		double fFinalGrade = temp1+temp2+temp3+temp4+temp5;
		
		double Units = Unit1+Unit2+Unit3+Unit4+Unit5;
		
		double sFinalGrade = fFinalGrade / Units;
		
			
			return sFinalGrade;
		
	}
	
	//A method in which sets the Grade Equivalent in terms of Letter Grade
	//Returns @param LetterGrade
	public String getFinalGrade(String LetterGrade, double sFinalGrade){
		
		if(sFinalGrade >= 0 && sFinalGrade <= 0.99){
			
			LetterGrade = "F" ;
			
		}
		
		else if (sFinalGrade >= 1 && sFinalGrade <= 1.99){
			
			LetterGrade = "D";
		}
		else if (sFinalGrade >= 2 && sFinalGrade <= 2.4){
			
			LetterGrade = "C";
			
		}
		else if(sFinalGrade >= 2.5 && sFinalGrade <= 2.99){
			
			LetterGrade = "B-";
		}
		else if(sFinalGrade >=  3 && sFinalGrade <= 3.4){
			
			LetterGrade = "B";
			
		}
		else if (sFinalGrade >= 3.5 && sFinalGrade <= 3.9){
			
			LetterGrade = "A-";
			
		}
		else if (sFinalGrade >= 4){
			
			LetterGrade = "A";
			
		}
		
		return LetterGrade;
		
	}
	// Method in which shows the Minimum Grade Requirement and its Letter Equivalent
	public String getLetterReq(String mingradeReq, double num){
		
		if (num >= 0 && num <= 0.9){
			
			mingradeReq = "F";
			
		}
		else if (num >= 1 && num <= 1.9){
			
			mingradeReq = "D";
			
		}
		else if (num >= 2 && num <= 2.4){
			
			mingradeReq = "C";
			
		}
		else if (num >= 2.5 && num<= 2.99){
			
			mingradeReq = "B-";
			
			
		}
		else if (num >= 3 && num <= 3.4){
			
			mingradeReq = "B";
		}
		else if (num >= 3.5 && num <= 3.9){
			
			mingradeReq = "A-";
			
		}
		else if (num >= 4){
			
			mingradeReq = "A";
			
		}
		
		return mingradeReq;
		
		
	}

}
