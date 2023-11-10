import java.util.*;

public class MeasuringCollectionOperations {
    private ArrayList<TestData> arrayList;
    private LinkedList<TestData> linkedList;
    private List<TestData> listArrayList;
    private List<TestData> listLinkedList;
    private HashSet<TestData> hashSet;
    private TreeSet<TestData> treeSet;
    private Set<TestData> setHashSet;
    private Set<TestData> setTreeSet;


    public void add() {
        long timeAddArrayList = timeAddArrayList();
        long timeAddLinkedList = timeAddLinkedList();
        long timeAddList_ArrayList = timeAddList_ArrayList();
        long timeAddList_LinkedList = timeAddList_LinkedList();
        long timeAddHashSet = timeAddHashSet();
        long timeAddTreeSet = timeAddTreeSet();
        long timeAddSet_HashSet = timeAddSet_HashSet();
        long timeAddSet_TreeSet = timeAddSet_TreeSet();

        System.out.printf("\nВремя добавления в наносекундах 500000 %s элементов в: \n- ArrayList \t%d\n- LinkedList \t%d\n" +
                        "- List(ArrayList) \t%d\n- List(LinkedList) \t%d\n- HashSet \t%d\n- TreeSet \t%d\n" +
                        "- Set(HashSet) \t%d\n- Set(TreeSet) \t%d\n\n",
                "TestData", timeAddArrayList, timeAddLinkedList, timeAddList_ArrayList, timeAddList_LinkedList,
                timeAddHashSet, timeAddTreeSet, timeAddSet_HashSet, timeAddSet_TreeSet);
    }
    public void contains() {
        long timeContainsArrayList = timeContainsArrayList();        
        long timeContainsLinkedList = timeContainsLinkedList();
        long timeContainsList_ArrayList = timeContainsList_ArrayList();
        long timeContainsList_LinkedList = timeContainsList_LinkedList();
        long timeContainsHashSet = timeContainsHashSet();
        long timeContainsTreeSet = timeContainsTreeSet();
        long timeContainsSet_HashSet = timeContainsSet_HashSet();
        long timeContainsSet_TreeSet = timeContainsSet_TreeSet();

        System.out.printf("\nВремя поиска в наносекундах 500000 %s элементов в: \n- ArrayList \t%d\n- LinkedList \t%d\n" +
                        "- List(ArrayList) \t%d\n- List(LinkedList) \t%d\n- HashSet \t%d\n- TreeSet \t%d\n" +
                        "- Set(HashSet) \t%d\n- Set(TreeSet) \t%d\n\n",
                "TestData", timeContainsArrayList, timeContainsLinkedList, timeContainsList_ArrayList, timeContainsList_LinkedList,
                timeContainsHashSet, timeContainsTreeSet, timeContainsSet_HashSet, timeContainsSet_TreeSet);
    }
    public void remove() {
        long timeRemoveArrayList = timeRemoveArrayList();
        long timeRemoveLinkedList = timeRemoveLinkedList();
        long timeRemoveList_ArrayList = timeRemoveList_ArrayList();
        long timeRemoveList_LinkedList = timeRemoveList_LinkedList();
        long timeRemoveHashSet = timeRemoveHashSet();
        long timeRemoveTreeSet = timeRemoveTreeSet();
        long timeRemoveSet_HashSet = timeRemoveSet_HashSet();
        long timeRemoveSet_TreeSet = timeRemoveSet_TreeSet();

        System.out.printf("\nВремя удаления в наносекундах 500000 %s элементов в: \n- ArrayList \t%d\n- LinkedList \t%d\n" +
                        "- List(ArrayList) \t%d\n- List(LinkedList) \t%d\n- HashSet \t%d\n- TreeSet \t%d\n" +
                        "- Set(HashSet) \t%d\n- Set(TreeSet) \t%d\n\n",
                "TestData", timeRemoveArrayList, timeRemoveLinkedList, timeRemoveList_ArrayList, timeRemoveList_LinkedList,
                timeRemoveHashSet, timeRemoveTreeSet, timeRemoveSet_HashSet, timeRemoveSet_TreeSet);
    }

    private long timeAddArrayList() {
        arrayList = new ArrayList<>(500000);
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            arrayList.add(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeAddLinkedList() {
        linkedList = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            linkedList.add(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeAddList_ArrayList() {
        listArrayList = new ArrayList<>(500000);
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            listArrayList.add(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeAddList_LinkedList() {
        listLinkedList = new LinkedList<>();
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            listLinkedList.add(new TestData());
        long end = System.nanoTime();
        return end - start;
    }

    private long timeAddHashSet() {
        hashSet = new HashSet<>(500000);
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            hashSet.add(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeAddTreeSet() {
        treeSet = new TreeSet<>();
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            treeSet.add(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeAddSet_HashSet() {
        setHashSet = new HashSet<>(500000);
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            setHashSet.add(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeAddSet_TreeSet() {
        setTreeSet = new TreeSet<>();
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            setTreeSet.add(new TestData());
        long end = System.nanoTime();
        return end - start;
    }

    private long timeContainsArrayList() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            arrayList.contains(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeContainsLinkedList() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            linkedList.contains(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeContainsList_ArrayList() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            listArrayList.contains(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeContainsList_LinkedList() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            listLinkedList.contains(new TestData());
        long end = System.nanoTime();
        return end - start;
    }

    private long timeContainsHashSet() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            hashSet.contains(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeContainsTreeSet() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            treeSet.contains(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeContainsSet_HashSet() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            setHashSet.contains(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeContainsSet_TreeSet() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            setTreeSet.contains(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeRemoveArrayList() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            arrayList.remove(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeRemoveLinkedList() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            linkedList.remove(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeRemoveList_ArrayList() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            listArrayList.remove(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeRemoveList_LinkedList() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            listLinkedList.remove(new TestData());
        long end = System.nanoTime();
        return end - start;
    }

    private long timeRemoveHashSet() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            hashSet.remove(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeRemoveTreeSet() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            treeSet.remove(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeRemoveSet_HashSet() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            setHashSet.remove(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
    private long timeRemoveSet_TreeSet() {
        long start = System.nanoTime();
        for (int i = 0; i < 500000; i++)
            setTreeSet.remove(new TestData());
        long end = System.nanoTime();
        return end - start;
    }
}
