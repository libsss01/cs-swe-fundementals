public class BigOExamples {
    public static void main(String[] args) {
        System.out.println("Big-O examples");
    }
    
    // O(1) constant
    public static void directAccess(int[] arr) { 
        System.out.print(arr[1]);
    }

    // O(n) linear 
    public static void linearCost (int[] arr) {
    for(int i = 0; i < arr.length; i+= 2){
        System.out.print(arr[i]);
    }
    }

    // O(log n) logarithm
    public static void loga (int[] arr) {
    for (int i = 1; i < arr.length; i*=2){
        System.out.print(i);
    }

    }

    // O(n²) Quadratic 
    public static void coutQuadratique(int[] arr){
    for (int i = 0; i < arr.length; i++){
    for (int j = 0; j < arr.length; j+=2){
        System.out.print(i + j);
    }
    }
    }

    
    // O(n log n) linearithmic 
    public static void nLogaN (int[] arr) {
    for (int i = 0; i < arr.length; i++){
    for (int j = 1; j <= arr.length; j *= 3){
        System.out.print(j);
    }
    }

    }
}
