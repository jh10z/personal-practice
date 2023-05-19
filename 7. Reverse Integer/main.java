class Solution {
    public int reverse(int x) {
        String number = String.valueOf(x);
        String answer_string = "";
        int answer = 0;
        for(int i = String.valueOf(x).length() - 1; i > 0; i--) {
            answer_string += number.charAt(i);
        }
        if(number.charAt(0) == '-') {
            answer_string = "-" + answer_string;
        } else {
            answer_string += number.charAt(0);
        }
        try {
            answer = Integer.valueOf(answer_string);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } finally {
            return answer;
        }
    }
}