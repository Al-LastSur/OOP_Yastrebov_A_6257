package practice05.own_practice.Controller;

import java.util.ArrayList;
import java.util.List;
import Data.Student;
import Data.Teacher;
import Service.DataService;
import practice05.own_practice.Service.GroupService;

public class Controller {
        private DataService dataService; // предполагается, что также есть StudentService для получения списка студентов

    public Controller() {
        this.dataService = new DataService(); 
    }

    public Group createStudentGroup(int teacherId, List<Integer> studentId) {
        Teacher преподаватель = getTeacherById(teacherId);
        List<Student> студенты = getStudentsByIds(studentId);
        DataService groupService = new DataService();
        return groupService.creteStudentGroup(преподаватель, студенты);
    }

    private Teacher getTeacherById(int id) {
        return new Teacher("Иван", "Иванович", "Иванов", id);
    }

    private List<Student> getStudentsByIds(List<Integer> ids) {
        List<Student> students = new ArrayList<>();
        for (Integer id : ids) {
            студенты.add(new Student("Student", "№" + id, "Фамилия", id));
        }
        return students;
    }

    public static void main(String[] args) {
        // Пример использования Контроллера для создания учебной группы
        Controller controller = new Controller();
        List<Integer> studentId = List.of(1, 2, 3); 
        Group studentGroup = controller.createStudentGroup(1, studentId);
        System.out.println(studentGroup);
    }
}
