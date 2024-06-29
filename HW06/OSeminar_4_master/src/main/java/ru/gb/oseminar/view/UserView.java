package HW06.OSeminar_4_master.src.main.java.ru.gb.oseminar.view;

import HW06.OSeminar_4_master.src.main.java.ru.gb.oseminar.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
