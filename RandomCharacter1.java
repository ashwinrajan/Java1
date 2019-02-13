class RandomCharacter1
{
	public static void main(String[] args) 
	{
		
		char character;

		character =(char)( Math.random()*123);

		if(character>=48&&character<=57)
		{
			System.out.println(character+"  the character generated is a digit");
		}
		else if (character>=65&&character<+91)
		{
			System.out.println(character+"  the character generated is an uppercase");
		}
		else if (character>=92&&character<+122)
		{
			System.out.println(character+"  the character generated is not an uppercase");
		}
		else
		{
			System.out.println(character+"  the character generated is an alphabet");
			
		}

	}

		
	
}
