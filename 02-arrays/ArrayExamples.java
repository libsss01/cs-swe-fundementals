public class ArrayExamples {
    static int find(int[] arr, int size, int target){
        for(int i = 0; i < size; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int insert(int[] arr, int size, int index, int value){
        if(size >= arr.length) return -1;
        if(index < 0 || index > size) return -1;

        for(int i = size; i> index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
        return size;

    }

    static int delete(int[] arr, int size, int index){
        if(index < 0 || index >= size) return -1;
        for(int i = index; i < size - 1; i++){
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        size--;
        return size;
        
    }
}
