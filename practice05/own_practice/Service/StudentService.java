package practice05.own_practice.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Data.Student;

public class StudentService {
    private Map<Integer, Student> students;

    public StudentService() {
         this.students = new HashMap<>();
        students.put(1, new Student("Иван", "Иванович", "Иванов", null, 20));
        students.put(2, new Student("Петр", "Петрович", "Петров", null, 21));
        students.put(3, new Student("Анна", "Ивановна", "Сидорова", null, 19));
    }

    public List<Student> getAllStudents() {
        // Возвращает список всех студентов
        return new ArrayList<>(students.values());
    }

    public Student getStudentById(int id) {
        // Возвращает студента по его id
        return students.get(id);
    }

    public void addStudent(Student student) {
        // Добавляет студента в список
        students.put(student.getId(), student);
    }

    public void deleteStudent(int id) {
        // Удаляет студента из списка по его id
        students.remove(id);
    }
}
