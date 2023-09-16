public class Ordenamiento {
    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000, 5000, 10000};
        
        for (int size : sizes) {
            double[] arr = generateRandomArray(size);
            
            long startTime = System.currentTimeMillis();
            Burbuja.Burbuja(arr.clone());
            long bubbleSortTime = System.currentTimeMillis() - startTime;
            
            startTime = System.currentTimeMillis();
            Insercion.Insercion(arr.clone());
            long insertionSortTime = System.currentTimeMillis() - startTime;
            
            startTime = System.currentTimeMillis();
            Seleccion.Seleccion(arr.clone());
            long selectionSortTime = System.currentTimeMillis() - startTime;
            
            startTime = System.currentTimeMillis();
            Merge.Merge(arr.clone());
            long mergeSortTime = System.currentTimeMillis() - startTime;
            
            System.out.println("Array size: " + size);
            System.out.println("Bubble Sort Time: " + bubbleSortTime + " ms");
            System.out.println("Insertion Sort Time: " + insertionSortTime + " ms");
            System.out.println("Selection Sort Time: " + selectionSortTime + " ms");
            System.out.println("Merge Sort Time: " + mergeSortTime + " ms");
            System.out.println();
        }
    }
    
    private static double[] generateRandomArray(int size) {
        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Math.random();
        }
        return arr;
    }
}
