import java.util.*;

public class DataSetGeneric<E extends Measurable> extends ArrayList<E> {
    public DataSetGeneric(){

    }

    public E getMin() {
        if (isEmpty()) {
            return null;
        }
        E mEle = get(0);
        for (int i = 1; i < size(); i++) {
            if (mEle.getMeasure() > (get(i).getMeasure())) {
                mEle = get(i);
            }
        }
        return mEle;
    }

    public E getMax() {
        if (isEmpty()) {
            return null;
        }
        E mEle = get(0);
        for (int i = 1; i < size(); i++) {
            if (mEle.getMeasure() < (get(i).getMeasure())) {
                mEle = get(i);
            }
        }
        return mEle;
    }

    public List<E> getList() {
        List<E> list = new ArrayList<>();
        for (int i = 0; i < size(); i++) {
            E ele = get(i);
            list.add(ele);
        }
        return list;
    }
    
    public List<E> sortBy(Comparator<? super E> comparator) {
        List<E> originalList = getList();
        List<E> sortedList = new ArrayList<>();
        sortedList.addAll(originalList);
        Collections.sort(sortedList, comparator);
        return sortedList;
    }

    public List<E> sort() {
        List<E> originalList = getList();
        List<E> sortedList = new ArrayList<>();
        sortedList.addAll(originalList);
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(sortedList);
        return sortedList;
    }

    public class MergeSort {
        public void mergeSort(List<E> list) {
            int size = list.size();
            if (size > 1) {
                int half = size / 2;
                List<E> firstHalf = new ArrayList<>(list.subList(0, half));
                mergeSort(firstHalf);

                List<E> secondHalf = new ArrayList<>(list.subList(half, size));
                mergeSort(secondHalf);

                merge(firstHalf, secondHalf, list);
            }
        }

        public void merge(List<E> list1, List<E> list2, List<E> temp) {
            int l1size = list1.size();
            int l2size = list2.size();
            int current1 = 0;
            int current2 = 0;
            int current3 = 0;

            while (current1 < l1size && current2 < l2size) {
                if (list1.get(current1).getMeasure() < list2.get(current2).getMeasure())
                    temp.set(current3++, list1.get(current1++));
                else
                    temp.set(current3++, list2.get(current2++));
            }
            while (current1 < list1.size())
                temp.set(current3++, list1.get(current1++));
            while (current2 < list2.size())
                temp.set(current3++, list2.get(current2++));
        }
    }

    @Override
    public String toString() {
        return "DataSetGeneric [\n size()=" + size() + "\n getMin()=" + getMin() + " getMax()=" + getMax()
                + " Objects=\n" + super.toString() + "]";
    }
}

