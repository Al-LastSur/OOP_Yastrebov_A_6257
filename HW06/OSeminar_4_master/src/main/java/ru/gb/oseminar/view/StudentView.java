package HW06.OSeminar_4_master.src.main.java.ru.gb.oseminar.view;

import HW06.OSeminar_4_master.src.main.java.ru.gb.oseminar.data.Student;
import HW06.OSeminar_4_master.src.main.java.ru.gb.oseminar.data.StudentGroup;

import java.util.List;
import java.util.logging.Logger;

public class StudentView implements UserView<Student>{

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
