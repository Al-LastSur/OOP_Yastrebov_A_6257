package HW06.OSeminar_4_master.src.main.java.ru.gb.oseminar.controller;

import HW06.OSeminar_4_master.src.main.java.ru.gb.oseminar.data.User;

import java.time.LocalDate;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
