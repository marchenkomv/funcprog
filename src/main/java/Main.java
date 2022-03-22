import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static final String DELIMETER = " ";
    public static ArrayList<String> vocabulary = new ArrayList<String>();

    public static void main(String[] args) {
        for (String word : prepareRawData(getRawData())) {
            vocabulary.add(word);
        }
        printVocabulary();
    }

    public static String getRawData() {
        return new Scanner(System.in).nextLine();
    }

    public static String[] prepareRawData(String rawData) {
        return rawData.split(DELIMETER);
    }

    public static void printVocabulary() {
        for (String word : vocabulary) {
            System.out.println(word);
        }
    }
}
