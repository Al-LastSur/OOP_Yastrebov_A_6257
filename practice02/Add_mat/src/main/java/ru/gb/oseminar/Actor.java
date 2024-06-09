package practice02.Add_mat.src.main.java.ru.gb.oseminar;

public abstract class Actor implements ActorBehaviour {
    protected final String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    public abstract String getName();
}
