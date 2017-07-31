package in.oogway.ologger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class networkLogger implements oogwayLogger {
    static Logger networkLogger = LoggerFactory.getLogger(networkLogger.class);
    Level level;

    public networkLogger(){
        this.level = Level.WARN;
    }

    @Override
    public void setLevel(Level level) {
        switch (level)
         {
             case CRITICAL :this.level=level;
             break;
             case INFO:this.level=Level.WARN;
             break;
             case DEBUG:this.level=Level.WARN;
             break;
             case WARN:this.level=Level.WARN;
             break;
             default:this.level=Level.WARN;
         }
     }

    @Override
    public Level getLevel() {
         return this.level;
    }

    private void warn(String msg) {networkLogger.warn(msg);}

    private void info(String msg) {
         networkLogger.info("info"+msg);
    }

    private void debug(String msg) {
        networkLogger.debug("debug"+msg);
    }

    private void critical(String msg) {
         networkLogger.error("critical"+msg);
    }

    @Override
    public void log(String msg) {
        switch (level)
       {
           case INFO:info(msg);
           break;
           case WARN:warn(msg);
           break;
           case DEBUG:debug(msg);
           break;
           case CRITICAL:critical(msg);
           break;
           default:warn(msg);
       }
    }
 }