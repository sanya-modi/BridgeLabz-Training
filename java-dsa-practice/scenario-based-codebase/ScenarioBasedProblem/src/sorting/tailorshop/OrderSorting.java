package sorting.tailorshop;

class OrderSorting {

    // Insertion Sort based on delivery deadline
    public static void insertionSort(Order[] orders, int n) {

        for (int i = 1; i < n; i++) {
            Order key = orders[i];
            int j = i - 1;

            while (j >= 0 && orders[j].deliveryDeadline > key.deliveryDeadline) {
                orders[j + 1] = orders[j];
                j--;
            }

            orders[j + 1] = key;
        }
    }
}

