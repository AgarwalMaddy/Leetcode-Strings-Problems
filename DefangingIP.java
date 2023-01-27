class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
public class DefangingIP {
    public static void main(String args[]) {
      Solution s = new Solution();
    }
}
