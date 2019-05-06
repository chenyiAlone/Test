package testsomething;

import java.util.LinkedList;

public class SimplePath {
    public static void main(String[] args) {
        String path = "/a/./b/../../c/";
        new SimplePath().simplifyPath(path);
    }
    public String simplifyPath(String path) {
        StringBuilder res = new StringBuilder("/");
        LinkedList<String> stack = new LinkedList<>();
        if (path == null || "".equals(path))
            return res.toString();
        String[] arr = path.split("/");
        for (String str : arr) {
            if ("..".equals(str) && stack.size() > 0) {
                stack.pop();
            } else if (str.length() != 0 && !"..".equals(str) && !".".equals(str)) {
                stack.push(str);
            }
        }
        while (stack.size() > 0) {
            res.append(stack.pollLast()).append("/");
        }
        if (res.length() > 1)
            res.deleteCharAt(res.length() - 1);
        return res.toString();
        
    }
}