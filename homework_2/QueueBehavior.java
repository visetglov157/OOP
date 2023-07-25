package homework_2;

public interface QueueBehavior {
    void takeInQueue(buyer actor);
    void takeOrder();
    void giveOrder();
    void releaseFromQueue();
}
