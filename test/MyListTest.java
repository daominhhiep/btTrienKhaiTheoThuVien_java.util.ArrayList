import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MyListTest {

    @Test
    void testClass() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.addLast(1);
        listInteger.addLast(2);
        listInteger.addLast(3);
        listInteger.addLast(4);
        listInteger.addLast(5);

        System.out.println("element 0: " + listInteger.get(0));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        System.out.println("element 3: " + listInteger.get(3));

        listInteger.get(6);
        System.out.println("element 6: " + listInteger.get(6));
    }

    @Test
    void testClassCase2() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.addLast(1);
        listInteger.addLast(2);
        listInteger.addLast(3);
        listInteger.addLast(4);
        listInteger.addLast(5);

        System.out.println("element 0: " + listInteger.get(0));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        System.out.println("element 3: " + listInteger.get(3));
        System.out.println("element 4: " + listInteger.get(4));

        listInteger.get(-1);
        System.out.println("element -1: " + listInteger.get(-1));
    }

    @DisplayName("Test add first")
    @Test
    void testClassCase3() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.addFirst(1);
        listInteger.addFirst(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.addFirst(6);

        System.out.println("element 0: " + listInteger.get(0));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        System.out.println("element 3: " + listInteger.get(3));
        System.out.println("element 4: " + listInteger.get(4));
    }

    @DisplayName("Test add at index 3")
    @Test
    void testClassCase4() {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.add(6);
        listInteger.add(10, 3);

        System.out.println("element 0: " + listInteger.get(0));
        System.out.println("element 1: " + listInteger.get(1));
        System.out.println("element 2: " + listInteger.get(2));
        System.out.println("element 3: " + listInteger.get(3));
        System.out.println("element 4: " + listInteger.get(4));
    }

    @DisplayName("Test remove first")
    @Test
    void testClassCase5() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.add(6);


        System.out.println("Before remove:");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }

        listInteger.removeFirst();

        System.out.println("After remove: ");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }
    }

    @DisplayName("Test remove Last")
    @Test
    void testClassCase6() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.add(6);


        System.out.println("Before remove:");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }

        listInteger.removeLast();

        System.out.println("After remove: ");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }
    }

    @DisplayName("Test remove at Index 2")
    @Test
    void testClassCase7() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.add(6);


        System.out.println("Before remove:");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }

        listInteger.remove(2);

        System.out.println("After remove: ");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }
    }

    @DisplayName("Test clone")
    @Test
    void testClassCase8() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.add(6);


        System.out.println("Original:");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }

        MyList<Integer> clone = (MyList) listInteger.clone();

        System.out.println("Clone: ");
        for (int index = 0; index < clone.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, clone.get(index));
        }
    }

    @DisplayName("Test contain")
    @Test
    void testClassCase9() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.add(6);


        System.out.println("Original:");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }

        System.out.println(listInteger.isContain(3));
    }

    @DisplayName("Test indexof")
    @Test
    void testClassCase10() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.add(6);


        System.out.println("Original:");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }

        System.out.println(listInteger.indexOf(4));
        System.out.println(listInteger.indexOf(6));
        System.out.println(listInteger.indexOf(8));
    }

    @DisplayName("Test clear")
    @Test
    void testClassCase11() {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(3);
        listInteger.addLast(4);
        listInteger.addLast(5);
        listInteger.add(6);

        listInteger.clear();

        System.out.println("Original:");
        for (int index = 0; index < listInteger.getSize(); index++) {
            System.out.printf("element %d: %d \n", index, listInteger.get(index));
        }


    }
}