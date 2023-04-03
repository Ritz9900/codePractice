public class StudentMarks {
    private int englishMarks;//field
    private int hindiMarks;
    private int mathMarks;
    private String name;
    private int id;
    private int totalMarks;

    public StudentMarks(int englishMarks, int hindiMarks, int mathMarks, String name, int id) {
        this.englishMarks = englishMarks;
        this.hindiMarks = hindiMarks;
        this.mathMarks = mathMarks;
        this.name = name;
        this.id = id;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(int totalMarks) {
        this.totalMarks = totalMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getHindiMarks() {
        return hindiMarks;
    }

    public void setHindiMarks(int hindiMarks) {
        this.hindiMarks = hindiMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "StudentMarks{" +
                "englishMarks=" + englishMarks +
                ", hindiMarks=" + hindiMarks +
                ", mathMarks=" + mathMarks +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", totalMarks=" + totalMarks +
                '}';
    }
}

