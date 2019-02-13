class NForWhile 
{
	public static void main(String[] args) 
	{


    int counter, index = 2;

    for (counter = 2; counter >= index; counter += 2) {
        index = index * 2;
        System.out.printf("Index is %d\n", index);

        do {
            index += 1;
            System.out.printf("Counter is %d and index is %d\n", counter, index);
            counter += 3;
        } while (index >= counter);
        index += 5;
        System.out.printf("I'm here\n");
    }
    System.out.printf("Counter is %3d and index is %d\n", counter, index);
   
}

	}