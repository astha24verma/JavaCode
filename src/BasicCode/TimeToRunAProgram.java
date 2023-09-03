package BasicCode;

public class TimeToRunAProgram {
    public static void main(String[] args) {

        long start, end;

        start = System.currentTimeMillis();
        System.out.println("METHOD to be called HERE to check time taken.");
        end = System.currentTimeMillis();

        double time_taken = (end - start);
        System.out.println(time_taken + " time was taken(in milliseconds)");

    }
}
