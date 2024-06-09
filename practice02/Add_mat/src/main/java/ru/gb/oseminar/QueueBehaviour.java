package practice02.Add_mat.src.main.java.ru.gb.oseminar;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void giveOrders();
    void releaseFromQueue();
}
