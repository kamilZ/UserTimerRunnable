public class UserTimerRunnable implements Runnable {

    private static final String TAG = "com.test";
    private long lastUsed;
    private long period;
    private Handler handler;
    private boolean stop;
    private long idle;

    public UserTimerRunnable(long period, Handler handler) {
        this.period = period;
        this.handler = handler;
        stop = false;
        lastUsed = System.currentTimeMillis();
    }

    public void run() {
        idle = System.currentTimeMillis() - lastUsed;
        Log.d(TAG, "Application is idle for " + idle + " ms");

        if (idle > period) {
            idle = 0;
           
           //TODO your code here
           
            stop = true;
            Log.d(TAG, "Finishing UserTimerRunnable thread");
        } else {
            handler.postDelayed(this, 60*1000); //1m
        }
    }

    public synchronized void resetTimer() {
        lastUsed = System.currentTimeMillis();
        if (stop) {
            stop = false;
            handler.postDelayed(this, 60*1000); //1m
        }
    }

}
