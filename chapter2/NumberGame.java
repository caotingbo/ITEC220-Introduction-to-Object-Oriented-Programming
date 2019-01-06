public class NumberGame {

    private static void scanMaxAndMin(int[] numbers) {

        int max = numbers[0], min = numbers[0];

        for(int i=1;i<numbers.length;i++){
            if(max<numbers[i]){max = numbers[i];}
            if(min>numbers[i]){min = numbers[i];}
        }

        System.out.printf("Max is %d and min is %d%n", max, min);

    }


    private static void scanFirstTwoMaxs(int[] numbers) {

        int max = numbers[0], secondMax = numbers[0];

        for(int i=1;i<numbers.length;i++){
            if(max<numbers[i]){max = numbers[i];}
        }

        for(int i=1;i<numbers.length;i++){
            if(secondMax<numbers[i]&&numbers[i]<max){secondMax = numbers[i];}
        }

        System.out.printf("Max is %d and second max is %d%n", max, secondMax);

    }


    private static void scanFirstThreeMaxs(int[] numbers) {

        int max = numbers[0], secondMax = numbers[0], thirdMax = numbers[0];

        for(int i=1;i<numbers.length;i++){
            if(max<numbers[i]){max = numbers[i];}
        }
        
        for(int i=1;i<numbers.length;i++){
            if(secondMax<numbers[i]&&numbers[i]<max){secondMax = numbers[i];}
        }

        for(int i=1;i<numbers.length;i++){
            if(thirdMax<numbers[i]&&numbers[i]<secondMax){thirdMax = numbers[i];}
        }

        System.out.printf("Max is %d, second max is %d and third max is %d%n", max, secondMax, thirdMax);

    }


    private static void threeSums(int[] numbers) {

        int count = 0;
        for(int i =0;i<numbers.length-2;i++){
            for(int j=i+1;j<numbers.length-1;j++){
                for(int k=j+1;k<numbers.length;k++){
                    if(numbers[i]+numbers[j]+numbers[k]==0){
						count++;
                    }
                }
            }
        }

        System.out.printf("There are %d combinations of 3 numbers that sum of them is 0%n", count);

    }


    public static void main(String[] args) {

        int[] numbers = {-1, -2, 3, -4, -5, 9, 10, 11};

        scanMaxAndMin(numbers);

        scanFirstTwoMaxs(numbers);

        scanFirstThreeMaxs(numbers);

        threeSums(numbers);

    }


}