package practice04.OSeminar_4_master.src.main.java.ru.gb.oseminar.controller;


import practice04.OSeminar_4_master.src.main.java.ru.gb.oseminar.data.Teacher;
import practice04.OSeminar_4_master.src.main.java.ru.gb.oseminar.service.TeacherService;
import practice04.OSeminar_4_master.src.main.java.ru.gb.oseminar.view.TeacherView;

import java.time.LocalDate;


public class TeacherController implements UserController<Teacher> {
    private final TeacherService dataService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();

    @Override
    public void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth) {
        dataService.create(firstName, secondName, patronymic, dateOfBirth);
        teacherView.sendOnConsole(dataService.getAll());
    }
}
