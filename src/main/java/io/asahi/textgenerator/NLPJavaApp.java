import java.util.*;

public class NLPJavaApp {

    public static void main(String[] args) {
        String input = "Now , for the first time in history, we are closer than ever to have an universal language : " +
            "English . It is certainly not the best language by any objective measure , its defects are great and " +
            "numerous , but that is missing the point , the value of a truly global language that everyone in this planet " +
            "can understand is to at last bring everyone together , make communication between all different peoples " +
            "easy and fluent , aid the spread of information , knowledge , and ideas to all mankind , and help resolve human conflicts . ";
        List<String> words = Arrays.asList(input.split(" "));
//        words.add(0, "_START_");
//        words.add("_END_");

        HashMap<String, List<String>> textWords = new HashMap<>();

        words.forEach(w -> textWords.put(w, new ArrayList<>()));

        for (int i = 0; i < words.size() - 1; i++) {
            textWords.get(words.get(i)).add(words.get(i + 1));
        }

        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        String nextWord = "Now";
        for (int i = 0; i < 1000; i++) {
            sb.append(nextWord);
            sb.append(" ");

            List<String> nextWords = textWords.get(nextWord);

            if (!nextWord.isEmpty()) {
                nextWord = nextWords.get(rand.nextInt(nextWords.size()));
            } else {
                nextWord = words.get(rand.nextInt(words.size()));
            }
        }

        System.out.println(sb.toString());
    }
}
