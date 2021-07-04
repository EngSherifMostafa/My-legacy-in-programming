		String text;
		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.print("Enter text: ");
			text = input.next();

			int ptrStart = 0, ptrEnd = text.length() - 1;

			for ( ; ptrStart <= ptrEnd; ptrStart++, ptrEnd--) {
				if(text.charAt(ptrStart) != text.charAt(ptrEnd))
					break;
			}
			if(ptrStart > ptrEnd)
				System.out.println("Text " + text + " is Palindrome");
			else
				System.out.println("Text " + text + " is Not Palindrome");