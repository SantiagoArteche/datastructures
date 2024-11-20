import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args){


        System.out.println(findSubString("hellomannerggrexvggrexc gbxc", "bx"));
        System.out.println(evenLength(new int[]{1,55,22,33,141,1919}));

    }

    static int evenLength(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(String.valueOf(arr[i]).length() % 2 == 0) count++;
        }

        return count;
    }

    static boolean findSubString(String string, String coincidence){
        String conc = "";
        for(int i = 0; i < string.length(); i++){
           char actualChar = string.charAt(i);

           for(int j = 0 ; j < coincidence.length(); j++){
               char nextChar = coincidence.charAt(j);

               if(actualChar == coincidence.charAt(0)){
                   conc += nextChar;
                   if(conc.equals(coincidence)) return true;
               }
           }
       }
        return false;
    }

    static int inArrayIndex(int[] arr, int target){
        if(arr.length == 0) return -1;

        for (int i = 0; i < arr.length; i++) if(target == arr[i]) return i;

        return -1;
    }

    static int inArrayElement(int[] arr, int target){
        for(int num: arr){
            if(target == num) return num;
        }

        return Integer.MAX_VALUE;
    }

}