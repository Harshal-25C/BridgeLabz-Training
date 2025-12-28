import java.util.*;

class Problem14{
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        StringBuilder sk = new StringBuilder("");
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length-1];

        for(int i=0; i<Math.min(first.length(), last.length()); i++){
            
            if(first.charAt(i) != last.charAt(i)){
                return sk.toString();
            }
            sk.append(first.charAt(i));
        }
        return sk.toString();
    }
	
	public static void main(String[] args){
	    String[] strs = {"flower","flow","flight"};
		
		String str = longestCommonPrefix(strs);
		
		System.out.println(str);
	}
}