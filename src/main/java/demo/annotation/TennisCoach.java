package demo.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//2. spring will scan the class and register the bean
//If the annotation's value doesn't indicate a bean name, an appropriate name will be built based on the short name of the class (with the first letter lower-cased).
// or  specify a name for your bean.
//@Component("foo")
@Component
public class TennisCoach implements Coach{
    //3.autowired field injection
    @Autowired
    //4. need to specify which interface to use since there are multiple instances
    @Qualifier("happyFortuneService")
    private FortuneService fortuneService;

    // 1.constructor injection spring creates a instance and injects into tennisCoach
//    @Autowired
//    public TennisCoach(FortuneService fortuneService){
//        this.fortuneService = fortuneService;
//    }


    public TennisCoach() {
    }

    //2. define setter method and inject
//    @Autowired
//    public void setFortuneService(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    //3. method injection
//    @Autowired
//    public void doSomething(FortuneService fortuneService) {
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your swing";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    //6. @qualifier  if there are multimple instances of interface you provide a specific interface to inject
    //@Autowired
    //@Qualifier("happyFortuneService")  lowercase version of interface name
}
