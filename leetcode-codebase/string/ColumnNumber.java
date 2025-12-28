//Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

class ColumnNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char ch = columnTitle.charAt(i);
            int num = ch - 'A' + 1;
            result = result * 26 + num;
        }

        return result;
    }
}