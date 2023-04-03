public class HospitalEntry {
    private String hospitalName;
    private String name;
    private String city;
    private String state;
    private Boolean ppKit;
    private int coronaPatientCount;

    public HospitalEntry( String name, String city,
                         String state, boolean ppKit, int coronaPatientCount ){
        this.name=name;
        this.city=city;
        this.state=state;
        this.ppKit=ppKit;
        this.coronaPatientCount=coronaPatientCount;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Boolean getPpKit() {
        return ppKit;
    }

    public void setPpKit(Boolean ppKit) {
        this.ppKit = ppKit;
    }

    public int getCoronaPatientCount() {
        return coronaPatientCount;
    }

    public void setCoronaPatientCount(int coronaPatientCount) {
        this.coronaPatientCount = coronaPatientCount;
    }
}
