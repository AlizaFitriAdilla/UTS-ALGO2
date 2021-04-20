package UTS;
public class No1a {
    public static void main(String[] args) {
     int[] data = {3,10,4,12,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        int k=1;
        while (k<data.length){
            int j = data.length-1;
            while (j>=1){
                if (data[j-1]>data[j]){
                    int temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
                j = j-1;
            }
            k = k+1;
        }
        System.out.println("\nAliza Fitri Adilla");
        System.out.println("=== Bubble Short ===");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
}
    
