import java.sql.Time;
import java.util.*;
/*
Д/з Расширим предыдущую задачу. Замерить время добавления, поиска и удаления объектов из коллекции
в LinkedList, ArrayList, TreeSet, HashSet. Сравнить время и сделать вывод о том, в каких условиях
какая коллекция работает быстрее.
 */

public class Main {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        MeasuringCollectionOperations operations = new MeasuringCollectionOperations();
        operations.add();
        operations.contains();
        operations.remove();
    }
}
