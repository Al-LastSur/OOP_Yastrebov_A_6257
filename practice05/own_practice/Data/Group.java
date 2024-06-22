package practice05.own_practice.Data;

import java.util.List;

public class Group extends Teacher {
    
    public Teacher teacher;
    private List<Student> students; 

    public Group (Teacher teacher, List<Student> students){    
        this.teacher = teacher;
        this.students = students;    
    }
@Override String toString(){
    StringBuilder sb = new StringBuilder();
    sb.append("Group{");
    sb.append("Teacher=").append(teacher);
    sb.append(", students=").append(students);
    sb.append('}');
    return sb.toString();
}
public Teacher getTeacher (){
    return teacher;
}
public void setTeacher(Teacher teacher){
    this.teacher = teacher;
}
public List<Student> getStudents(){
    return students;
}

public void setStudents(List<Student> students){
    this.students = students;
}

}
