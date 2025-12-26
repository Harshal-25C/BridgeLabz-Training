public class RandomNumberAnalysis{
    // Method to generate array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size){
        int[] numbers = new int[size];

        for (int i=0; i<size; i++){
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    //Method to find average, minimum, and maximum
    public static double[] findAverageMinMax(int[] numbers){

        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers){
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        double average = (double) sum/numbers.length;

        return new double[]{average, min, max};
    }

    public static void main(String[] args){
	    //Initialize randomNumbers array
        int[] randomNumbers = generate4DigitRandomArray(5);
		
        //Printing number
        System.out.println("Generated 4-digit numbers:");
        for (int num : randomNumbers){
            System.out.print(num + " ");
        }

        double[] result = findAverageMinMax(randomNumbers);

        System.out.println("\n\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
