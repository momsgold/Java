public class Translator {

	private String englishInput;
	private String[] words;
	private String pigLatinOutput;
	
	public Translator(String englishInput) {
		this.englishInput = englishInput;
		pigLatinOutput = "";
	}

	public String getEnglishInput() {
		return englishInput;
	}

	public void setEnglishInput(String englishInput) {
		this.englishInput = englishInput;
	}

	public String[] getWords() {
		return words;
	}

	public void setWords(String[] words) {
		this.words = words;
	}

	public String getPigLatinOutput() {
		return pigLatinOutput;
	}

	public void setPigLatinOutput(String pigLatinOutput) {
		this.pigLatinOutput = pigLatinOutput;
	}
	
	public String translate() {
		convertToLowercase();
		parseStringToArray();
		removePunctuation();
		
		// words is now 'clean' and ready for translation
		// 1) if word starts with a vowel, add 'way' to the end
		// 2) If the word starts with a consonant, move all of the 
		//     consonants that appear before the first vowel 
		//     to the end of the word, then add ay to the end 
		//     of the word
		// 3) If a word starts with the letter y, the y should
		//    be treated as a consonant. If the y appears anywhere 
		//    else in the word,	it should be treated as a vowel.
		for (int i = 0; i< words.length; i++) {
			String s = words[i];
			if (startsWithVowel(s)) {
				s+="way";
			}
			else if (!startsWithVowel(s)) {
				int v = indexOfFirstVowel(s);
				String sub1 = s.substring(0,v);
				String sub2 = s.substring(v,s.length());
				s = sub2+sub1+"ay";
			}
			words[i] = s;
		}
		for (String s: words) {
			pigLatinOutput+=(s+ " ");
		}
		
		return pigLatinOutput;
	}
	
	private int indexOfFirstVowel(String s) {
		int i = 0;

		for (i=0; i< s.length(); i++) {
			char c = s.charAt(i);
			if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='y') {
				break;
			}
		}
		
		return i;
	}
	private boolean startsWithVowel(String s) {
		boolean startsWithVowel = false;
		if (s.startsWith("a") || s.startsWith("e") || 
				s.startsWith("i") || s.startsWith("o") || 
				s.startsWith("u")) {
			startsWithVowel = true;
		}
		return startsWithVowel;
	}
	
	private void convertToLowercase() {
		englishInput = englishInput.toLowerCase();
	}
	
	private void parseStringToArray() {
		words = englishInput.split(" ");
	}
	
	private void removePunctuation() {
		for (int i = 0; i<words.length;i++) {
			// remove ',' '.' '!' and '?' from end of each word
			String s = words[i];
			if (s.endsWith(",")||s.endsWith(".")|| 
					s.endsWith("!")|| s.endsWith("?")) {
				int l = s.length();
				s = s.substring(0,l-1);
				words[i] = s;
			}
		}
	}	
}


//
//public class Translator {
//	private String input;
//	private String[] words;
//	private String output;
//	
//	// only input in constructor because other two variables are results of the input
//	public Translator(String input) {
//		super();
//		this.input = input;
//	}
//
//	// getters and setters for EVERYTHING!!!!!!
//	public String getInput() {
//		return input;
//	}
//
//	public void setInput(String input) {
//		this.input = input;
//	}
//
//	public String[] getWords() {
//		return words;
//	}
//
//	public void setWords(String[] words) {
//		this.words = words;
//	}
//
//	public String getOutput() {
//		return output;
//	}
//
//	public void setOutput(String output) {
//		this.output = output;
//	}
//	
//	// METHODS
//	public String translate() {
//		// now call all your 3 methods!
//		convertToLowerCase();
//		parseStringToArray();
//		removePunctuation();
//		
//		// words is now clean and ready for translation
//		
//		// (1) if word starts with a vowel, add "way" to the end
//		for (String s : words) { // enhanced for-loop
//			if (startsWithVowel(s)) {
//				s += "way"; // can't do append because it's a string
//		// (2) if the word starts with a consonant, move all consonants that appear before the vowel to the end of the word
//			} else if (!startsWithVowel(s)) {
//				
//			}
//		}
//	
//		// (3) if the words starts with "y", the y should be treated as a consonant. If it appears anywhere else, treat as a vowel
//		
//		return output;
//	}
//	
//	private int indexOfFirstVowel(String string) {
//		int i = 0;
//		for () {
//			
//		}
//		if (string.startsWith("a") || string.startsWith("e")
//		 || string.startsWith("i") || string.startsWith("o")
//		 || string.startsWith("u")) {
//			
//		}
//		return i;
//	}
//	
//	private boolean startsWithVowel(String string) {
//		boolean startsWithVowel = false; // method variable
//		if (string.startsWith("a") || string.startsWith("e")
//				 || string.startsWith("i") || string.startsWith("o")
//				 || string.startsWith("u")) {
//			startsWithVowel = true;
//		}
//		return startsWithVowel;
//	}
//	
//	private void convertToLowerCase() { // no return type, use void
//		input = input.toLowerCase(); // built in thing, converts everything to lower case
//	}
//	
//	private void parseStringToArray() {
//		words = input.split(" "); // split up words by a space
//	}
//	
//	private void removePunctuation() {
//		for (String s : words) { // for array "words" loop through and treat each element as variable s
//			// remove commas, periods, question marks, and exclamation points from end of each word
//			if (s.endsWith(".") || s.endsWith(",") || s.endsWith("!") || s.endsWith("?")) {
//				int length = s.length();
//				s = s.substring(0, length - 1);
//			}
//		}
//	}
//	
//}
