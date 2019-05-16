class ReverseWord 
{
	public static void main(String[] args) 
	{
		String s = args[0];
		String[] split = s.split(" ");
		for(String ss:split)
		{
		System.out.print(ss+"     ");
		}
		
		// finding all occurrences forward: Method #1
for (int i = s.indexOf(" "); i != -1; i = s.indexOf(" ", i+1)) {
    System.out.println(i);
} // prints 5 7 10 18

// finding all occurrences forward: Method #2
for (int i = -1; (i = s.indexOf(" ", i+1)) != -1; ) {
    System.out.println(i);
} // prints "3", "8", "14"


		System.out.println();
		String result = "";
		for (int i = split.length - 1; i >= 0; i--) {
		  result += (split[i] + " ");
		}
		System.out.println(result.trim());//for remove white spaces from left and right side of String 
	}
}
