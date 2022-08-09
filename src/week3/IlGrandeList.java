package week3;

public class IlGrandeList {

    public static void main(String[] args) {
        int list1[] = new int[]{2, 5, 6, 9, 12};
        int list2[] = new int[]{3, 4, 10, 11, 15};
        int coList[] = new int[list1.length + list2.length];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < list1.length && j < list2.length) {
            int l1 = list1[i];
            int l2 = list2[j];
            if (list1[i] > list2[j]) {
                coList[k] = list2[j++];
                while (list2[j] < list1[i]) {
                    coList[++k] = list2[j++];
                }
                coList[++k] = list1[i++];
            } else {
                coList[k] = list1[i++];
                while (list1[i] < list2[j]) {
                    coList[++k] = list1[i++];
                }
                coList[++k] = list2[j++];
            }
            k++;
        }


        for (int l : coList) {
            System.out.print(l + " ");
        }
    }
}











