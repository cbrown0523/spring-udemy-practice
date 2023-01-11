package demo.annotation;

import org.springframework.stereotype.Component;

//2. spring will scan the class and register the bean
@Component()
public class TennisCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice your swing";
    }
}
