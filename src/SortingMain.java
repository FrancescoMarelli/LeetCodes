public class SortingMain {

    public static void main(String[] s) {
        Integer[] unsorted = new Integer[]{5,4,3,11,1,32,4,7,77,3,2,6,7,44,3};
        //Integer[] sorted = SortigAlgorithms.bubbleSort(unsorted);
        Integer[] sorted = SortingAlgorithms.quickSort(unsorted);
        for (Integer integer : sorted)
            System.out.print(integer + " ");

        System.out.println();

    }



}
