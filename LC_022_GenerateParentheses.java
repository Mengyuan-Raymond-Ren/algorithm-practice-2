public class Solution {
    public List<String> generateParenthesis(int n) {
		List<String> all = new ArrayList<String>();
		
		if(n == 0) {
			all.add("");
		}
		else if (n == 1) {
			all.add("()");
		}
		else {
			buildPairs(all, "", n, n);
		}
		
		return all;
    }
	
	public void buildPairs(List<String> all, String temp, int left, int right) {
		
		if(left == right && left != 0 && right != 0) {
			temp = temp + "(";
			left--;
			buildPairs(all, temp, left, right);
		}
		else if(left == 0 && right != 0) {
			while(right != 0) {
				temp = temp + ")";
				right--;
			}
			all.add(temp);
			return;
		}
		else if(left != 0) {
			String temp1 = temp + "(";
			left--;
			buildPairs(all, temp1, left, right);
			String temp2 = temp + ")";
			left++;
			right--;
			buildPairs(all, temp2, left, right);
			return;
		}
	}
}
