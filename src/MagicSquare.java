public class MagicSquare {

    /**
     * @param array2d
     * @return the sum of the first row in array2d.
     */
    public static int calculateCheckSum(int[][] array2d) {
        int sum = 0;
        for (int i = 0; i < array2d[0].length; i++) {
            sum = sum + array2d[0][i];
        }
        return sum;
    }

    /**
     * @param array2d
     * @param checkSum
     * @return whether the sum of each row in array2d is equal to checkSum or not.
     * Because we have already determined the sum of the first row
     * via the method 'calculateCheckSum', this method can begin
     * iterating from the second row.
     */
    public static boolean magicRows(int[][] array2d, int checkSum) {
        int sum = 0;
        for (int row =0; row < array2d.length; row++) {
            sum = 0;
            for (int col = 0; col < array2d[row].length; col++) {
                sum += array2d[row][col];
            }
            if (sum!=checkSum)
                return false;
        }
        return true;
    }



    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each column in array2d is equal to checkSum or not.
     */
    public static boolean magicColumns(int[][] array2d, int checkSum) {
        int colSum = 0;
        for (int col = 0; col < array2d[0].length; col++) {
            colSum = 0;

            for (int row = 0; row < array2d.length; row++) {
                colSum += array2d[row][col];
            }
            if (colSum!=checkSum)
                return false;
        }
        return true;
    }

    /**
     *
     * @param array2d
     * @param checkSum
     * @return whether the sum of each of the two main diagonals is equal to checkSum or not.
     */
    public static boolean magicDiagonals(int[][] array2d, int checkSum) {
            int row = 0;
            int col = 0;
            int temp = 0;

            for(int i = 0; i < array2d.length; i++){
                temp = temp + array2d[row][col];
                row++;
                col++;
            }
            if (temp!=checkSum)
                return false;

            row = 0;
            col = array2d[row].length - 1;
            temp = 0;
            for (int j = 0; j < array2d.length; j++) {
                temp = temp + array2d[row][col];
                row++;
                col--;
            }
            if (temp!=checkSum)
                return false;

            else
                return true;
            }




    /**
     *
     * @param array2d
     * @return whether array2d is magic or not.
     */
    public static boolean isMagic(int[][] array2d) {
        int value = calculateCheckSum(array2d);
        if(magicRows(array2d, value) && magicColumns(array2d, value) && magicDiagonals(array2d, value))
            return true;
        else
            return false;
    }

}
