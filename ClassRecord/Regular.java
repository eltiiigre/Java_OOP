class Regular extends Student
{
    private double MinGradeReq; //instantiate

   
   //setter for Minimim Grade Requirement
    public double setMinGradeReq(double MinGradeReq)
    {
        return this.MinGradeReq = MinGradeReq;
    }

   // returns Minimum Grade Requirement
    public double getMinGradeReq()
    {
        return MinGradeReq;
    }
}