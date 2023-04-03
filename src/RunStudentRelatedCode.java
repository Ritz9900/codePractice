import java.util.ArrayList;

public class RunStudentRelatedCode {
    public static void main (String [] args){
        RunStudentRelatedCode runStudentRelatedCode=new RunStudentRelatedCode();
        ArrayList<StudentMarks>studentDetails=runStudentRelatedCode.enterStudentDetails();
        ArrayList<StudentMarks> totalMarks=runStudentRelatedCode.calculateTotalMarks(studentDetails);
        for(StudentMarks studentMark : totalMarks){
            System.out.println(studentMark.toString());
        }
        Addition<Integer> addition= new Addition<>();
        addition.initAddition(1,2);
        System.out.println("Addition is"+ addition.add());
        Addition<String> additionString= new Addition<>();
        additionString.initAddition("1","2");
        System.out.println("Addition String is"+ additionString.add());

        System.out.println("Average marks in Hindi" + runStudentRelatedCode.getAverageHindiMarks(studentDetails));
        System.out.println("Total Marks Obtained by student :"+runStudentRelatedCode.calculateHighestMarks(studentDetails));

    }
    public ArrayList<StudentMarks> enterStudentDetails()//signature
    {
        StudentMarks marks= new StudentMarks
                (89,56,78,"Rohan",1);
        StudentMarks marks1=new StudentMarks
                (89,98,56,"Sohan",2);
        StudentMarks marks2=new StudentMarks
                (90,85,97,"Dohan",3);
        StudentMarks marks3=new StudentMarks
                (98,90,90,"Bulbul",4);
        ArrayList<StudentMarks> entermarks= new ArrayList<StudentMarks>();
        entermarks.add(marks);
        entermarks.add(marks1);
        entermarks.add(marks2);
        entermarks.add(marks3);
        return entermarks;
    }
    public ArrayList<StudentMarks> calculateTotalMarks(ArrayList<StudentMarks>studentMarksArrayList) {
        for (int i=0;i<studentMarksArrayList.size();i++) {
            StudentMarks studentMarks= studentMarksArrayList.get(i);
            studentMarks.setTotalMarks(studentMarks.getEnglishMarks() + studentMarks.getHindiMarks() + studentMarks.getMathMarks());
            studentMarksArrayList.set(i,studentMarks );//??
        }
        return studentMarksArrayList;

    }

    public int getAverageHindiMarks(ArrayList<StudentMarks> allStudentMarks){
        int hindiAvg=0;
        for(int i=0;i<allStudentMarks.size();i++){//for(getAverageHindiMarks obj=allStudentMarks)
           hindiAvg=allStudentMarks.get(i).getHindiMarks()+hindiAvg;
        }
        int avg=hindiAvg/allStudentMarks.size();
        return avg;
    }
    public StudentMarks getHighestMarksMath(ArrayList<StudentMarks>student){
        int highestMathMarks=0;
        StudentMarks highMarksStudent=null;
        for(StudentMarks marks:student){
           if(highestMathMarks < marks.getMathMarks()){
               highestMathMarks=marks.getMathMarks();
               highMarksStudent=marks;
           }
        }
        return highMarksStudent;
    }
    public StudentMarks calculateHighestMarks(ArrayList<StudentMarks>marks){
        int highestMarks=0;
        StudentMarks totalHigestMarks=null;
        for (StudentMarks marksObtain:marks){
            if(highestMarks<(marksObtain.getMathMarks()+marksObtain.getHindiMarks()+marksObtain.getEnglishMarks()))
            {
                highestMarks=(marksObtain.getHindiMarks()+marksObtain.getEnglishMarks()+marksObtain.getMathMarks());
                totalHigestMarks= marksObtain;
            }
        } return totalHigestMarks;
    }




}
