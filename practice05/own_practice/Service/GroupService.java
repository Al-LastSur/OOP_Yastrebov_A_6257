package practice05.own_practice.Service;

import java.util.List;

import Data.Student;
import Data.Teacher;
import practice03.own_practice.Group;

public class GroupService {
    public Group setStudentGroup(Teacher teacher, List<Student> students){
        return new Group(teacher, students);
    }
}
