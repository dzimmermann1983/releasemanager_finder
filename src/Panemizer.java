import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Panemizer {

    private final static int MIN = 0;
    private final static int MAX = 1000;
    private final static String[] NAMES = new  String[]{"Daniel P.", "Bernhard", "Daniel Z.", "Rene"};

    public static void main(String[] args) {

        List<String> randomNames = new ArrayList<>();

        IntStream.range(MIN, MAX)
                .forEach(index -> randomNames.add(NAMES[index % NAMES.length + 1]));

        Collections.shuffle(randomNames);

        System.out.println("Congratulations to: " + randomNames.get(getRandomNumberInRange(MIN, MAX)));

    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("MAX must be greater than MIN");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }
}
