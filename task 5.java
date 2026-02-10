public String addNumberStrings(String input1, String input2) {

    int i = input1.length() - 1;
    int j = input2.length() - 1;
    int carry = 0;

    StringBuilder result = new StringBuilder();

    while (i >= 0 || j >= 0 || carry > 0) {

        int sum = carry;

        if (i >= 0) {
            sum += input1.charAt(i) - '0';
            i--;
        }

        if (j >= 0) {
            sum += input2.charAt(j) - '0';
            j--;
        }

        result.append(sum % 10);
        carry = sum / 10;
    }

    return result.reverse().toString();
}
