public class MeasuresToTest implements Measurable {
    private int num;
    private String size;

    public MeasuresToTest(int number, String sizes) {
        this.num = number;
        this.size = sizes;
    }

    public String getSize() { return size; }

    @Override
    public int getMeasure() {
        return num;
    }

    @Override
    public String toString() {
        return "getMeasure= " + getMeasure() + "getSize= " + getSize();
    }
}
