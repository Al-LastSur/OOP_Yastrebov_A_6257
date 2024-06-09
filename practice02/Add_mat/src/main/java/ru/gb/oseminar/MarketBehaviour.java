package practice02.Add_mat.src.main.java.ru.gb.oseminar;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}