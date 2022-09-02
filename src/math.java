public class math {
    private static String title;
    private static int number;
    private static String description;
    private static String department;
    public math(String Title, int Number, String Description, String Department) {
        title = Title;
        number = Number;
        description = Description;
        department = Department;
    }
    public String toString(){
        return "Title: " + title + ".\nCourse Number: " + number+ ".\nDescription: " + description +".\nDepartment: " + department ;
    }
}