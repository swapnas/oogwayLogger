package in.oogway.ologger

/**
 * Created by swapnas on 7/25/17.
 */
class networkLoggerTest extends spock.lang.Specification {

    def "test setLevel"(Level l) {
        def network = new networkLogger()
        when:
        network.setLevel(l)
        then:
        network.level == l

        where:
        l|
        Level.CRITICAL
        Level.WARN
        Level.INFO

    }

    def "test log"(String str){
     given:
     networkLogger nl=new networkLogger();
     when:
     nl.log(str)
     then:
     nl.log(str)=
    }
}