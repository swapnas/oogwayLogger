package in.oogway.ologger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class fileLogger implements oogwayLogger {
    static Logger fileLogger = LoggerFactory.getLogger(fileLogger.class);
    Level level;

    public fileLogger(){
        this.level = Level.DEBUG;
    }

    @Override
    public void setLevel(Level level) {   //Setting the Logger level.If the current setLevel is higher than the one being called then the value remain same
      switch (level) {
          case WARN:this.level = level;
        break;
          case CRITICAL:this.level = level;
        break;
          case INFO:this.level = level;
        break;
          case DEBUG:this.level =Level.DEBUG;
        break;
        default:this.level=Level.DEBUG;
      }
    }

    @Override
    public Level getLevel() {
      return this.level;
    }

    private void warn(String msg) {
      fileLogger.warn(msg);
    }

    private void info(String msg) {
      fileLogger.info("info"+msg);
    }

    private void debug(String msg) {
      fileLogger.debug("debug"+msg);
    }

    private void critical(String msg) {
      fileLogger.error("critical"+msg);
    }

    @Override
    public void log(String msg) {
      switch (level)
       {
           case DEBUG:debug(msg);
         break;
           case CRITICAL:critical(msg);
         break;
           case INFO:info(msg);
         break;
           case WARN:warn(msg);
         break;
         default:debug(msg);
       }
    }
}