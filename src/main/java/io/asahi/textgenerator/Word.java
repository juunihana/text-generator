import java.util.ArrayList;
import java.util.List;

public class Word {

    private String word;
    private List<String> words;

    public Word(String word) {
        this.word = word;
        words = new ArrayList<>();
    }

    public void addNextWord(String word) {
        words.add(word);
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }
}
