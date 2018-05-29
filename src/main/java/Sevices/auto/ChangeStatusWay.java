package Sevices.auto;

public class ChangeStatusWay {
    private static ChangeStatusWay ourInstance = new ChangeStatusWay();

    public static ChangeStatusWay getInstance() {
        return ourInstance;
    }

    private ChangeStatusWay() {
    }

    public int changeStatusWay(int indexStatus) {
        indexStatus--;
        return indexStatus;
    }
}
