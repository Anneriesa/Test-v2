import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

    Set<Notebook> set = new HashSet<>();
    set.add(new Notebook("Notebook 1", 8, "Windows10", 1000, "Black"));
    set.add(new Notebook("Notebook 2", 16, "Windows10", 1500, "Gray"));
    set.add(new Notebook("Notebook 3", 32, "linux", 16000, "Blue"));
    set.add(new Notebook("Notebook 4", 64, "linux", 10000, "Black"));
    set.add(new Notebook("Notebook 5", 32, "MacOC", 1000, "White"));
    OperationWithNotebook operation = new OperationWithNotebook(set);
    operation.start();

    }
}