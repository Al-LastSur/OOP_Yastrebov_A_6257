package practice04.OSeminar_4_master.src.main.java.ru.gb.oseminar.view;

import practice04.OSeminar_4_master.src.main.java.ru.gb.oseminar.data.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> teachers){
        for(Teacher teacher: teachers){
            logger.info(teacher.toString());
        }
    }
    
}
