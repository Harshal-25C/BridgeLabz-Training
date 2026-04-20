class Problem28{
    public static int strStr(String haystack, String needle) {
        for(int i=0, j=needle.length(); j<=haystack.length(); i++,j++){
            if(haystack.substring(i,j).contains(needle)){
                return i;
            }
        }
        return -1;
    }
	public static void main(String[] args){
	    String haystack = "sadbutsad", needle = "sad";
		
		int result = strStr(haystack, needle);
		System.out.println("Index of 1st occurrence is: "+result);
	}
}