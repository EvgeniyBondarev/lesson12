import java.util.Objects;

public class TestData implements Comparable{
    private static int index;
    private String data;
    public TestData(){
        index %= 500000;
        data = "Test" + index++;
    }
    public TestData(String data){
        this.data = data;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "TestData{" +
                "data='" + data + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestData testData = (TestData) o;
        return data.equals(testData.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public int compareTo(Object o) {
        return data.compareTo(((TestData)o).getData());
    }
}
