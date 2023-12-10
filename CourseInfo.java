public class CourseInfo {
    private String courseCode;
    private int courseUnit;
    private int courseScore;
    private String courseGrade;
    private int gradeUnit;

    public CourseInfo(String code, int unit, int score) {
        this.courseCode = code;
        this.courseUnit = unit;
        this.setScore(score);
    }
    public String getCourseCode() {
        return this.courseCode;
    }
    public int getCourseUnit() {
        return this.courseUnit;
    }
    public void setScore(int score) {
        this.courseScore = score;
        if (this.courseScore >= 70) {
            this.courseGrade = "A";
            this.gradeUnit = 5;
        } else if (this.courseScore >= 60) {
            this.courseGrade = "B";
            this.gradeUnit = 4;
        } else if (this.courseScore >= 50) {
            this.courseGrade = "C";
            this.gradeUnit = 3;
        } else if (this.courseScore >= 45) {
            this.courseGrade = "D";
            this.gradeUnit = 2;
        } else if (this.courseScore >= 40) {
            this.courseGrade = "E";
            this.gradeUnit = 1;
        } else if (this.courseScore >= 0) {
            this.courseGrade = "F";
            this.gradeUnit = 0;
        }
    }
    public int getGradeUnit() {
        return this.gradeUnit;
    }
    public String getGrade() {
        return this.courseGrade;
    }
}