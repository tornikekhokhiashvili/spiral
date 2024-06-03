package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] result = new int[rows][columns];
        int count = 1;
        int rowStart = 0, rowEnd = rows - 1, columnStart = 0, columnEnd = columns - 1;
        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                result[rowStart][i] = count++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                result[i][columnEnd] = count++;
            }
            columnEnd--;
            if (rowStart <= rowEnd) {
                for (int i = columnEnd; i >= columnStart; i--) {
                    result[rowEnd][i] = count++;
                }
                rowEnd--;
            }

            if (columnStart <= columnEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result[i][columnStart] = count++;
                }
                columnStart++;
            }
        }
        return result;
    }
}
