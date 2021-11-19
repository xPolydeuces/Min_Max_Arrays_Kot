import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// This app fills an array with 10 random int elements within range (0 - 100) and then returns min and max.
        Random random = new Random();
        int[] randomNumbers = new int[10];

        for (int i = 0; randomNumbers.length > i; i++)
        {
            randomNumbers[i] = random.nextInt(100) + 1;
        }

        int max = 0;
        int min = randomNumbers[0];
        
        for (int num : randomNumbers)
        {
            if (num > max)
            {
                max = num;
            }
            if (min > num)
            {
                min = num;
            }
        }

        System.out.println("Numbers in the array: ");

        for (int num : randomNumbers)
        {
            System.out.println(num);
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
