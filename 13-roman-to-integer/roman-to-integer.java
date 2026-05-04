class Solution {
    public int romanToInt(String s) {
        int total = 0;

        // Traverse string from left to right
        for (int i = 0; i < s.length(); i++) {

            int current = getValue(s.charAt(i));

            // Check next character (if exists)
            if (i < s.length() - 1 && current < getValue(s.charAt(i + 1)))
            //If a smaller value comes before a larger value, we subtract; otherwise, we add.
            {
                total -= current; // subtraction case
            } 
            else
            {
                total += current; // normal addition
            }
        }
        return total;
    }

    // Helper method to get value of Roman character
    public int getValue(char ch) {
        if (ch == 'I') return 1;
        if (ch == 'V') return 5;
        if (ch == 'X') return 10;
        if (ch == 'L') return 50;
        if (ch == 'C') return 100;
        if (ch == 'D') return 500;
        if (ch == 'M') return 1000;
        return 0;
    }
}