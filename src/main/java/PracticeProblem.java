public class PracticeProblem {

	public static void main(String args[]) {
		isPalindrome("was it a car or a cat i saw");
	}

	public static boolean isPalindrome(String word){
		//fix word for spaces & casing
		String wordFixed = word.toLowerCase().replace(" ","");
		int length = wordFixed.length();

		//for length/2, check if first+i and last-i character is the same, otherwise false
		for(int i = 0; i < (length/2);i++){
			if(wordFixed.charAt(i) != wordFixed.charAt(length-1-i)){
				return false;
			}
		}

		return true;
	}

	public static int getAge(String[] names, int[] ages, String name){
		// assuming the names and ages arrays are of the same length

		//increment names, if name in names, return ages at that index
		for(int i = 0; i < names.length; i++){
			if(names[i].equals(name)){
				return ages[i];
			}	
		}
		return -1;
	}

	public static int countWords(String str, char c){
		//split string, increment counter for every word that countains c
		String[] strArr = str.split(" ");
		int counter = 0;
		for(int i = 0; i < strArr.length; i++){
			if(strArr[i].indexOf(c) != -1){
				counter++;
			}
		}
		return counter;
	}
}
