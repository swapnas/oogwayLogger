package in.oogway.ologger;

/*** Created by swapnas on 7/24/17.*/
public interface oogwayLogger {
    void setLevel(Level level);
    Level getLevel();
    void log(String msg);
}