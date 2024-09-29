import java.util.ArrayList;
import java.util.List;

public class FibonacciCalculator {

    private static List<Integer> serie;

    static{
        serie = new ArrayList<>();
        serie.add(0);
        serie.add(1);
    }

    public static void reset(){
        serie.clear();
        serie.add(0);
        serie.add(1);
        showFirst2Numbers();
    }

    public static void calculateNextNumber(){
        int nextNumber = serie.getLast() + serie.get(serie.size() - 2);
        serie.add(nextNumber);
    }

    public static int getSize(){
        return serie.size();
    }

    public static int getLast(){
        return serie.getLast();
    }

    public static void showFirst2Numbers(){
        GUI.textArea.clearText();
        GUI.textArea.addText(String.format("Termino numero 1 de la serie fibonacci: %d", serie.getFirst()));
        GUI.textArea.addText("\nTermino numero 2 de la serie fibonacci: " + serie.get(1));
    }
}
