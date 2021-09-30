public class Main {
    public static void main(String[] args) {
        Student john = new Student();
        john.setName("John");
        john.setCity("New York");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(john,view);
        controller.updateView();
    }
}

class StudentView{
    void printStudent(Student s){
        System.out.printf("Name: %s, City: %s\n",s.getName(),s.getCity());
    }
}

class StudentController{
    Student model;
    StudentView view;
    StudentController(Student model,StudentView view){
        this.model = model;
        this.view = view;
    }

    void updateView(){
        view.printStudent(model);
    }

}

class Student{
    private String name;
    private String city;

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
}