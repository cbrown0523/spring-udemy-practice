package demo;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "run 10 miles";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
