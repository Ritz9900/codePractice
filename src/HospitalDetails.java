import java.util.ArrayList;

public class HospitalDetails {
        public static void main (String[]args){
            HospitalDetails details=new HospitalDetails();//

            ArrayList<HospitalEntry> entries=details.getCoronaPatientList();
            HospitalEntry patientNumber= details.getMaxPatientNumber(entries);//
            System.out.println("Maximum patient is :"+patientNumber.getCoronaPatientCount() +"Hospital Name: "
                    +patientNumber.getName()+ "City "+patientNumber.getCity() +"State" +patientNumber.getState()
            +"Availability of ppKit "+patientNumber.getPpKit());

           ArrayList< HospitalEntry> record= details.getPatientList(entries);
           for(HospitalEntry obj:record) {
               System.out.println("Details of hospitals having 500 + patients" + obj.getName()
                       + "City where hospital avaiable" + obj.getCity()
                       + "City in which state its present" + obj.getState()
                       + "Availability of ppkit" + obj.getPpKit());
           }

        }
        public ArrayList<HospitalEntry> getCoronaPatientList(){
            HospitalEntry hospitalEntry1= new HospitalEntry("Leelavati","Mumbai",
                    "Maharashtra", true, 120);
            HospitalEntry hospitalEntry2= new HospitalEntry( "Bridge Candy", "Mumbai",
                    "Maharashtra", true, 178);
            HospitalEntry hospitalEntry3= new HospitalEntry(" PMCH Hospital", "Patna",
                    "Bihar", false, 712);
            HospitalEntry hospitalEntry4= new HospitalEntry("COBORA", "Pune",
                    "Maharashtra", false, 891);
            HospitalEntry hospitalEntry5 =new HospitalEntry( "NM Hospital", "Ahmedabad",
                    "Gujarat", true, 127);
            ArrayList<HospitalEntry> hospitalArrayList =new ArrayList<>();
            hospitalArrayList.add(hospitalEntry1);
            hospitalArrayList.add(hospitalEntry2);
            hospitalArrayList.add(hospitalEntry3);
            hospitalArrayList.add(hospitalEntry4);
            hospitalArrayList.add(hospitalEntry5);
            return hospitalArrayList;
        }
        public HospitalEntry getMaxPatientNumber(ArrayList<HospitalEntry>HospitalEntryArraylist)
        {
            HospitalEntry maxPatientNumber=null;
            int maxpatient=0;
            for(int i=0;i<HospitalEntryArraylist.size();i++){
                if(HospitalEntryArraylist.get(i).getCoronaPatientCount()>maxpatient) {
                    maxpatient = HospitalEntryArraylist.get(i).getCoronaPatientCount();
                    maxPatientNumber = HospitalEntryArraylist.get(i);
                }
            }
            return maxPatientNumber;
        }
        public ArrayList<HospitalEntry> getPatientList(ArrayList<HospitalEntry> hospitalEntryArrayList){
            ArrayList<HospitalEntry>  patientRecordList = new ArrayList<>();
            for(int i=0;i<hospitalEntryArrayList.size();i++){
                if(hospitalEntryArrayList.get(i).getCoronaPatientCount()>500)
                   patientRecordList.add(hospitalEntryArrayList.get(i));
            }
            return patientRecordList;
        }


    }

