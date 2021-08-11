class Student 
{
	// Instantiation
    private String name;
    private String birthdate;
    private String age;
    private String contactNum;
    private String address;
    private double finalGrade;
    private String guardianName;
    private String guardianNum;
	 
	//Creates a Setter and getter for the Instantiated variables 
	 
	 //Setting the Name
    public String setName(String name)
    {
        return this.name = name;
    }

   
	// Setting the Birthdate
    public String setbirthdate(String birthdate)
    {
        return this.birthdate = birthdate;
    }

    //Setting the Age of the Student
    public String setAge(String age)
    {
        return this.age = age;
    }
    
   // Setting the Contact Number
    public String setcontactNum(String contactNum)
    {
        return this.contactNum = contactNum;
    }

   //Setting the Address
    public String setAddress(String address)
    {
        return this.address = address;
    }

   // Setting the Guardian Name
    public String setGuardianName(String guardianName)
    {
        return this.guardianName = guardianName;
    }

  // SEtting the Guardian Num
    public String setGuardianNum(String guardianNum)
    {
        return this.guardianNum = guardianNum;
    }
   
   // Returns @param Name
    public String getName()
    {
        return name;
    }
// Returns @param birthdate
    public String getbirthdate()
    {
        return birthdate;
    }
//returns @param Age
    public String getAge()
    {
        return age;
    }
//returns @param contactNum
    public String getcontactNum()
    {
        return contactNum;
    }
// returns @param Address
    public String getAddress()
    {
        return address;
    }

//retuns @param GuardianName
    public String getGuardianName()
    {
        return guardianName;
    }
//returns @param Guardian num
    public String getGuardianNum()
    {
        return guardianNum;
    }

  
}