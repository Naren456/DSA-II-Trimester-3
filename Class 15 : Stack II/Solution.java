public class Solution {
  public String solve(String A) {
    Stack<Character> st = new Stack<>();
    StringBuilder Ans = new StringBuilder();
    HashMap<Character, Integer> map = new HashMap<>();
    map.put('+', 1);
    map.put('*', 2);
    map.put('/', 2);
    map.put('-', 1);
    map.put('^', 3);
    map.put('(', 0);

    for (int i = 0; i < A.length(); i++) {
      char ch = A.charAt(i);
      if (ch == '+' || ch == '-' || ch == '/' || ch == '*' || ch == '^') {
        if (st.empty()) {
          st.push(ch);
        } else {
          if (map.get(ch) <= map.get(st.peek())) {
            while (!st.empty() && st.peek() != '(' && map.get(ch) <= map.get(st.peek())) {
              Ans.append(st.pop());
            }
            st.push(ch);
          } else {
            st.push(ch);
          }
        }
      } else if (ch == '(') {
        st.push(ch);
      } else if (ch == ')') {
        while (st.peek() != '(') {
          Ans.append(st.pop());
        }
        st.pop();
      } else {
        Ans.append(ch);
      }
    }
    while (!st.empty()) {
      Ans.append(st.pop());
    }
    return Ans.toString();
  }

  public static void main(String[] args) {

  }
}
