import src.com.athlete.Climber;

public class TextClimber extends climber {
    public void testGroupSize() {
        try {
            climbers.length > 0;
        }
        catch(Exception e) {
            System.err("Climber array has no length: " + e);
        }
    }
}