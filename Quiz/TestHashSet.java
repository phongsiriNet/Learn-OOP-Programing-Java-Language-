package Quiz;
import java.util.HashSet;
public class TestHashSet {

	public static void main(String[] args) {
		String a = "book";
		String b = "textbook";
		System.out.println(havesAreAlike(a));
		System.out.println(havesAreAlike(b));
	}
	public static boolean havesAreAlike(String s) {
		HashSet<Character> vowels = new HashSet<>();
		vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
        vowels.add('A'); vowels.add('E'); vowels.add('I'); vowels.add('O'); vowels.add('U');
        int n =  s.length()/2;
        String a = s.substring(0, n);
        String b = s.substring(n);
        return countVowels(a,vowels) == countVowels(b,vowels);
	}
	private static int countVowels(String text,HashSet<Character> vowels) {
		int count =0;
		char [] s = text.toCharArray();
		for(int i=0;i<text.length();i++) {
			if(vowels.contains(s[i]))
				count++;
		}
		return count;
	}

}
