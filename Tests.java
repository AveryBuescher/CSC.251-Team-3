import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    static final MeasuresToTest small = new MeasuresToTest(1, "small");
    static final MeasuresToTest medium = new MeasuresToTest(2, "medium");
    static final MeasuresToTest large = new MeasuresToTest(3, "large");

    static final Employee numberOne = new Employee("Number One", 100);
    static final Employee riker = new Employee("Riker", 1);
    static final Employee commander = new Employee("Commander", 10);

    @Test
    public void oneCommanderRiker() {
        DataSetGeneric<Employee> toTheBridge = new DataSetGeneric<>();
        toTheBridge.add(numberOne);
        toTheBridge.add(commander);
        toTheBridge.add(riker);
        assertEquals(toTheBridge.sort().get(0).getName(), "Riker");
        assertEquals(toTheBridge.getList().get(0).getName(), "Number One");
        assertEquals(toTheBridge.sort().get(1).getName(), "Commander");
        assertEquals(toTheBridge.getList().get(1).getName(), "Commander");
        assertEquals(toTheBridge.sort().get(2).getName(), "Number One");
        assertEquals(toTheBridge.getList().get(2).getName(), "Riker");
    }

    @Test
    public void smallMedLarge() {
        DataSetGeneric<MeasuresToTest> test1 = new DataSetGeneric<>();
        test1.add(small);
        test1.add(medium);
        test1.add(large);
        assertEquals(test1.sort().get(0).getSize(), "small");
        assertEquals(test1.getList().get(0).getSize(), "small");
        assertEquals(test1.sort().get(1).getSize(), "medium");
        assertEquals(test1.getList().get(1).getSize(), "medium");
        assertEquals(test1.sort().get(2).getSize(), "large");
        assertEquals(test1.getList().get(2).getSize(), "large");
    }

    @Test
    public void smallLargeMedium() {
        DataSetGeneric<MeasuresToTest> test2 = new DataSetGeneric<>();
        test2.add(small);
        test2.add(large);
        test2.add(medium);
        assertEquals(test2.sort().get(0).getSize(), "small");
        assertEquals(test2.getList().get(0).getSize(), "small");
        assertEquals(test2.sort().get(1).getSize(), "medium");
        assertEquals(test2.getList().get(1).getSize(), "large");
        assertEquals(test2.sort().get(2).getSize(), "large");
        assertEquals(test2.getList().get(2).getSize(), "medium");
    }

    @Test
    public void mediumSmallLarge() {
        DataSetGeneric<MeasuresToTest> test3 = new DataSetGeneric<>();
        test3.add(medium);
        test3.add(small);
        test3.add(large);
        assertEquals(test3.sort().get(0).getSize(), "small");
        assertEquals(test3.getList().get(0).getSize(), "medium");
        assertEquals(test3.sort().get(1).getSize(), "medium");
        assertEquals(test3.getList().get(1).getSize(), "small");
        assertEquals(test3.sort().get(2).getSize(), "large");
        assertEquals(test3.getList().get(2).getSize(), "large");
    }

    @Test
    public void mediumLargeSmall() {
        DataSetGeneric<MeasuresToTest> test4 = new DataSetGeneric<>();
        test4.add(medium);
        test4.add(large);
        test4.add(small);
        assertEquals(test4.sort().get(0).getSize(), "small");
        assertEquals(test4.getList().get(0).getSize(), "medium");
        assertEquals(test4.sort().get(1).getSize(), "medium");
        assertEquals(test4.getList().get(1).getSize(), "large");
        assertEquals(test4.sort().get(2).getSize(), "large");
        assertEquals(test4.getList().get(2).getSize(), "small");
    }

    @Test
    public void largeSmallMedium() {
        DataSetGeneric<MeasuresToTest> test5 = new DataSetGeneric<>();
        test5.add(large);
        test5.add(small);
        test5.add(medium);
        assertEquals(test5.sort().get(0).getSize(), "small");
        assertEquals(test5.getList().get(0).getSize(), "large");
        assertEquals(test5.sort().get(1).getSize(), "medium");
        assertEquals(test5.getList().get(1).getSize(), "small");
        assertEquals(test5.sort().get(2).getSize(), "large");
        assertEquals(test5.getList().get(2).getSize(), "medium");
    }

    @Test
    public void largeMediumSmall() {
        DataSetGeneric<MeasuresToTest> test6 = new DataSetGeneric<>();
        test6.add(large);
        test6.add(medium);
        test6.add(small);
        assertEquals(test6.sort().get(0).getSize(), "small");
        assertEquals(test6.getList().get(0).getSize(), "large");
        assertEquals(test6.sort().get(1).getSize(), "medium");
        assertEquals(test6.getList().get(1).getSize(), "medium");
        assertEquals(test6.sort().get(2).getSize(), "large");
        assertEquals(test6.getList().get(2).getSize(), "small");
    }
}
