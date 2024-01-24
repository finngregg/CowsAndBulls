public class NumberUtils {
    private NumberUtils() {

    }

    public static int[] toArray(int number) {
        String num = Integer.toString(number);
        int[] numArr = new int[num.length()];
        String Arr[] = new String[num.length()];
        for (int i = 0; i < num.length(); i++) {
            Arr[i] = num.charAt(i) + "";
            numArr[i]= Integer.parseInt(Arr[i]);
        }
        return numArr;
    }

    public static int countMatches(int numberA, int numberB){
        String numA = Integer.toString(numberA);
        String numB = Integer.toString(numberB);
        int count = 0;
        for (int i = 0; i < numA.length(); i++){
            if(numA.charAt(i)==numB.charAt(i))
                count++;
            }
        return count;
    }

    public static int countIntersect(int numberA, int numberB){
        String numA = Integer.toString(numberA);
        String numB = Integer.toString(numberB);
        int count = 0;
        for (int i = 0; i < numA.length(); i++) {
            for (int j = 0; j < numA.length(); j++) {
                if (numA.charAt(i)==numB.charAt(j))
                    count++;
            }
        }
        return count;
    }
}
