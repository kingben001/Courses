

public class history {
    private static String title;
    private static int number;
    private static String description;
    private static String department;
    public history(String Title, int Number, String Description, String Department) {
        title = Title;
        number = Number;
        description = Description;
        department = Department;
    }
    public String toString(){
        return "Title: " + title + ".\nCourse Number: " + number+ ".\nDescription: " + description +".\nDepartment: " + department ;
    }
}