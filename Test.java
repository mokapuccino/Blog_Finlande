import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> typesQuartiers = new ArrayList<String>();
        typesQuartiers.add("Merveille");
        typesQuartiers.add("Noble");
        typesQuartiers.add("Merveille");
        typesQuartiers.add("Religieux");
        List<String> typesQuartiersDistinct = typesQuartiers.stream().distinct().collect(Collectors.toList());
        for(int i=0; i<typesQuartiersDistinct.size(); i++){
            System.out.println(typesQuartiersDistinct.get(i));
        }
    }
}
