package demo;

import demo.config.FortuneService;

public class BaseBallCoach implements Coach {
    //2. define a private field for the dependency
    private FortuneService fortuneService;

    //3. define a constructor for dependency injection
    //4. next would be to configure the dependency injection in spring config file.--havent done xml config so skipped
    public BaseBallCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "30 min batting cages";
    }

    @Override
    public String getDailyFortune() {
        //use fortuneService to get fortune
        return fortuneService.getFortune();
    }
}
