class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
    for (String operation : operations) {
        if (operation.equals("++X") || operation.equals("X++")) {
            x++;
        } else if (operation.equals("--X") || operation.equals("X--")) {
            x--;
        }
    }
    return x;
}
}
public class 2011{
  public static void main(String[] args){
    Solution s = new Solution;
  }
}
