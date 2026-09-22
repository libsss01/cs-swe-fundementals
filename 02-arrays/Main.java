import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        // Search Operations
        int[] arrToFind = {1, 2, 3, 4};
        int index = ArrayExamples.find(arrToFind, 4, 2);
        
        if(index != -1){ 
            System.out.println("The element was found at the " + index + " index");
        }
        else{
            System.out.print("The element doesn't exist inside the array");
        }

        // Insert Operations
        // Beginning Insert
        int[] arrToInsert1 = {1, 2, 3, 8, 0};
        int[] arrClone1 = arrToInsert1.clone();
        int size1 = 4;
        size1 = ArrayExamples.insert(arrToInsert1, size1 , 0, 10);

        //Middle insert
        int[] arrToInsert2 = {1, 2, 3, 6, 9, 0, 0};
        int[] arrClone2 = arrToInsert2.clone();
        int size2 = 5;
        size2 = ArrayExamples.insert(arrToInsert2, size2 , 2, 10);

        // End insert
        int[] arrToInsert3 = {1, 2, 3, 10, 11, 8, 0};
        int[] arrClone3 = arrToInsert3.clone();
        int size3 = 6;
        size3  = ArrayExamples.insert(arrToInsert3, size3, size3, 10);

        System.out.println("Insert Operations");

        if(size1 != -1){
            System.out.println("Before insertion : " + Arrays.toString(arrClone1)+ "\n"
            + "After insertion " + Arrays.toString(arrToInsert1)
            );
        }
        else{
            System.out.println("index invalide ou capacité du tableau dejà atteinte");
        }
        
        if(size2 != -1){
        System.out.println("Before insertion : " + Arrays.toString(arrClone2)+ "\n"
            + "After insertion " + Arrays.toString(arrToInsert2)
            );
        }
        else{
            System.out.println("index invalide ou capacité du tableau dejà atteinte");
        }
        
        if(size3 != -1){
        System.out.println("Before insertion : " + Arrays.toString(arrClone3)+ "\n"
            + "After insertion " + Arrays.toString(arrToInsert3)
            );
        }
        else{
            System.out.println("index invalide ou capacité du tableau dejà atteinte");
        }

    
        // Suppression Operations

        // Beginning Delete
        int[] arrToDelete1 = {5, 90, 34, 5, 8, 0};
        int[] arrClone4 = arrToDelete1.clone();
        int size4  = 5;
        size4 = ArrayExamples.delete(arrToDelete1, size4, 0);

        // Middle Delete
        int[] arrToDelete2 = {10, 9, 22, 5, 0};
        int[] arrClone5 = arrToDelete2.clone();
        int size5  = 4;
        size5 = ArrayExamples.delete(arrToDelete2, size5, 2);

        // End Delete
        int[] arrToDelete3 = {9, 5, 2, 0, 0};
        int[] arrClone6 = arrToDelete3.clone();
        int size6  = 3;
        size6 = ArrayExamples.delete(arrToDelete3, size6, 2);

        System.out.println("Delete Operations");

        if(size4 != -1){
            System.out.println("Before deletion : " + Arrays.toString(arrClone4)+ "\n"
            + "After deletion " + Arrays.toString(arrToDelete1));
        }
        else{
            System.out.println("index invalide");
        }

        if(size5 != -1){
             System.out.println("Before delettion : " + Arrays.toString(arrClone5)+ "\n"
            + "After deletion " + Arrays.toString(arrToDelete2)
            );
        }
        else{
            System.out.println("index invalide");
        }
        
       

        if(size6 != -1){
            System.out.println("Before deletion : " + Arrays.toString(arrClone6)+ "\n"
            + "After deletion " + Arrays.toString(arrToDelete3)
        );
        }
        else{
            System.out.println("index invalide");
        }
        

    }



}