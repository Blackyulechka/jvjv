package L8_2;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String error);
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task 33 is not done");
            } else {
                callback.onDone("Task " + (i + 1) + " is done");
            }
        }
    }

}
