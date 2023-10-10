import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"Sun", "Snow", "Rain", "Sun", "Frost", "Snow", "Tornado", "Dream", "Sun"};
        HashSet<String> stringSet = new LinkedHashSet<>(Arrays.asList(strings));
        String result = String.join(", ", stringSet);
        System.out.println(result);
    }
}