public class Marksheet {
    private int marks;
    private String rollNum;
    private String name;

    public Marksheet(int marks, String rollNum, String name) {
        this.marks = marks;
        this.rollNum = rollNum;
        this.name = name;
    }

    public Marksheet() {
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getRollNum() {
        return rollNum;
    }

    public void setRollNum(String rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
