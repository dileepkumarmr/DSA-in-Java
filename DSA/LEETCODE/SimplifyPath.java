package LEETCODE;

import java.util.Stack;

public class SimplifyPath {
    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        StringBuilder res = new StringBuilder();
        String[] p = path.split("/");

        for (int i = 0; i < p.length; i++) {
            if (!s.isEmpty() && p[i].equals("..")) {
                s.pop();
            } else if (!p[i].equals("") && !p[i].equals(".") && !p[i].equals("..")) {
                s.push(p[i]);
            }
        }

        if (s.isEmpty()) {
            return "/";
        }

        while (!s.isEmpty()) {
            res.insert(0, s.pop()).insert(0, "/");
        }

        return res.toString();
    }

    public static void main(String[] args) {


        // Example 1
        String path1 = "/home/";
        System.out.println("Simplified Path: " + simplifyPath(path1));  // Output: "/home"

        // Example 2
        String path2 = "/home//foo/";
        System.out.println("Simplified Path: " + simplifyPath(path2));  // Output: "/home/foo"

        // Example 3
        String path3 = "/home/user/Documents/../Pictures";
        System.out.println("Simplified Path: " + simplifyPath(path3));  // Output: "/home/user/Pictures"

        // Example 4
        String path4 = "/../";
        System.out.println("Simplified Path: " + simplifyPath(path4));  // Output: "/"

        // Example 5
        String path5 = "/.../a/../b/c/../d/./";
        System.out.println("Simplified Path: " + simplifyPath(path5));  // Output: "/.../b/d"
    }
}
