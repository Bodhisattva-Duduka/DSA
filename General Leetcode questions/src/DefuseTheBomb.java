import java.util.Arrays;

public class DefuseTheBomb {
    public static void main(String[] args) {
        int[] code = {5,7,1,4};
        int k = 3;
    }
    public int[] decrypt(int[] code, int k) {
        int[] copyArray = Arrays.copyOf(code, code.length);
        if(k==0){
            for(int i = 0; i<code.length; i++){
                code[i] = 0;
            }
        }
        if(k>0){
            int windowSum = 0;
            int loopExhauster = 0;
            int index = 0;
            for(int i = 1; i<k; i++){
                windowSum+=copyArray[i];
            }
            code[0] = windowSum;
            loopExhauster++;
            for (int i = k; loopExhauster<copyArray.length; i++) {
                // index = (i + k)
                // windowSum-=copyArray[i];
                // windowSum+=copyArray[index]

                // if(i)
                // sum+=copyArray[i];
                // loopExhauster++;
            }
        }
        if(k<0){
            int sum = 0;
            int index = 0;
            for(int i = 0; i<copyArray.length; i++){
                for(int j = i - 1; j>=Math.abs(k); j--){
                    index = j;
                    if(index<0){
                        index = copyArray.length - Math.abs(j);
                    }
                    sum += copyArray[index];
                }
                code[i] = sum; 
            }
        }
        return code;
    }
}
