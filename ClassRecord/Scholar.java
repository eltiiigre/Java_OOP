class Scholar extends Student
{
	// instantiation
    private String typeScholar;
    private double MinGradeReq;

  //Setter for the Type of Scholar
    public String setTypeScholar(String typeScholar)
    {
        return this.typeScholar = typeScholar;
    }

    // Setter for the min Grade Requirement
    public double setMinGradeReq(double minReq)
    {
        return this.MinGradeReq = MinGradeReq;
    }

    // Returns @param typeScholar.
    public String getTypeScholar()
    {
        return typeScholar;
    }

  // Returns Min Grade Requirement
    public double getMinGradeReq()
    {
        return MinGradeReq;
    }
}