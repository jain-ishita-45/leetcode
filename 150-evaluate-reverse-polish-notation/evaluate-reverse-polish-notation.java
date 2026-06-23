class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> s = new Stack<>();

        for (String ch : tokens) {

            if (!ch.equals("+") && !ch.equals("-")
                    && !ch.equals("*") && !ch.equals("/")) {

                s.push(ch);

            } else {

                int b = Integer.parseInt(s.pop());
                int a = Integer.parseInt(s.pop());

                int ans = 0;

                if (ch.equals("+"))
                    ans = a + b;
                else if (ch.equals("-"))
                    ans = a - b;
                else if (ch.equals("*"))
                    ans = a * b;
                else
                    ans = a / b;

                s.push(String.valueOf(ans));
            }
        }

        return Integer.parseInt(s.peek());
    }
}