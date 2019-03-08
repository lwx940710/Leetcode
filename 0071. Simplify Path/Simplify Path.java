class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack();
        for (String s : path.split("/")) {
            if (!stack.empty() && s.equals("..")) {
                stack.pop();
            } else if (!s.equals("..") && !s.equals(".") && !s.equals("")) {
                stack.push(s);
            }
        }
        
        ArrayList<String> arr = new ArrayList(stack);
        String ans = "";
        for (String s : arr) {
            ans = ans + "/" + s;
        }
        if (ans.length() == 0) {
            ans = "/";
        }
        return ans;
    }
}