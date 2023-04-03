import com.sun.corba.se.spi.ior.MakeImmutable;

import java.util.ArrayList;

public class CodeRunner {

 public static void main(String[] args){
  CodeRunner codeRunner= new CodeRunner();

  ArrayList<Marksheet> pm= codeRunner.getMarksheetList();//method call

  Marksheet highestMarksheet= codeRunner.getHighestMarksheet(pm);//
  System.out.println("Highesh Scorer is "+ "Name: "+ highestMarksheet.getName()+
          "Roll Number: "+ highestMarksheet.getRollNum()+
          "Marks: "+ highestMarksheet.getMarks());

   ArrayList<Marksheet> failList = codeRunner.getLowestMarksheet(pm);
   for (Marksheet failure: failList) {
    System.out.println("failure student marksheet" + "Name" + failure.getName() +
            "Roll Number" +failure.getRollNum() + "MarkSheet" + failure.getMarks());
   }

 }

 public ArrayList<Marksheet> getMarksheetList(){
  Marksheet sm1= new Marksheet();
  sm1.setMarks(67);
  sm1.setName("Ritika");
  sm1.setRollNum("cb12");
  //int num1= sum;
  Marksheet sm2= new Marksheet(82, "cb11", "Monu");
  Marksheet sm3= new Marksheet(96, "cb01", "Saurabh");
  Marksheet sm4= new Marksheet(32, "cb45", "JP");
  Marksheet sm5 = new Marksheet(17, "cb67", "Himanshu");
  Marksheet sm6= new Marksheet(99, "cb44", "Abhay");
  ArrayList<Marksheet> marksheetArrayList= new ArrayList<>();//daba
  marksheetArrayList.add(sm1);
  marksheetArrayList.add(sm2);
  marksheetArrayList.add(sm3);
  marksheetArrayList.add(sm4);
  marksheetArrayList.add(sm5);
  marksheetArrayList.add(sm6);

  return marksheetArrayList;
 }

 public Marksheet getHighestMarksheet(ArrayList<Marksheet> marksheetArrayList){

  Marksheet highestMarksheet= null;
  int highestMarks=0;

  for (int i=0;i<marksheetArrayList.size();i++) {
   if (marksheetArrayList.get(i).getMarks() >highestMarks) {
    highestMarks=marksheetArrayList.get(i).getMarks();
    highestMarksheet= marksheetArrayList.get(i);
   }
  }
  return highestMarksheet;
 }
 public ArrayList<Marksheet> getLowestMarksheet(ArrayList<Marksheet> marksheetArrayList){


  ArrayList<Marksheet> obj= new ArrayList<Marksheet>();
  for(int i=0;i<marksheetArrayList.size();i++)
  {
   if(marksheetArrayList.get(i).getMarks()<40){
     obj.add(marksheetArrayList.get(i));
   }
  }
  return obj;
 }

}

