package code401challenges;

public class ArrayShift {
    public static int[] arrayShift(int[] arrToBeShifted, int intToBeAdded) {
        int[] shiftedArr = new int[arrToBeShifted.length + 1];
        int middleIdx = (int) Math.ceil(arrToBeShifted.length / 2.0); // turns out this must be a decimal

        for (int i = 0; i < shiftedArr.length; i++) {
            if (i < middleIdx) {
                shiftedArr[i] = arrToBeShifted[i];
            } else if (i == middleIdx) {
                shiftedArr[i] = intToBeAdded;

            } else {
                shiftedArr[i] = arrToBeShifted[i - 1];
            }
        }
        return shiftedArr;
    }
}
