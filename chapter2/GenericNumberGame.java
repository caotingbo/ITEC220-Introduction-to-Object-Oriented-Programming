import java.text.SimpleDateFormat;
import java.util.*;

public class GenericNumberGame {

    private static < E extends Comparable> void scanMaxAndMin(E[] inputArray) {

        E max = inputArray[0];
        E min = inputArray[0];

        for(int i=1;i<inputArray.length;i++){
            if(max.compareTo(inputArray[i])<0){max = inputArray[i];}
            if(min.compareTo(inputArray[i])>0){min = inputArray[i];}
        }

        System.out.printf("Max is %s and min is %s%n", max, min);


    }


    private static < E extends Comparable> void scanFirstTwoMaxs(E[] inputArray) {

        E max = inputArray[0];
        E secondMax = inputArray[0];

        for(int i=1;i<inputArray.length;i++){
            if(max.compareTo(inputArray[i])<0){max = inputArray[i];}
        }

        for(int i=1;i<inputArray.length;i++){
            if(secondMax.compareTo(inputArray[i])<0 && inputArray[i].compareTo(max)<0){secondMax = inputArray[i];}
        }

        System.out.printf("Max is %s and second max is %s%n", max, secondMax);

    }


    private static < E extends Comparable> void scanFirstThreeMaxs(E[] inputArray) {

        E max = inputArray[0];
        E secondMax = inputArray[0];
        E thirdMax = inputArray[0];

        for(int i=1;i<inputArray.length;i++){
            if(max.compareTo(inputArray[i])<0){max = inputArray[i];}
        }
        
        for(int i=1;i<inputArray.length;i++){
            if(secondMax.compareTo(inputArray[i])<0 && inputArray[i].compareTo(max)<0){secondMax = inputArray[i];}
        }

        for(int i=1;i<inputArray.length;i++){
            if(thirdMax.compareTo(inputArray[i])<0 && inputArray[i].compareTo(secondMax)<0){thirdMax = inputArray[i];}
        }

        System.out.printf("Max is %s, second max is %s and third max is %s%n", max, secondMax, thirdMax);

    }

    public static void main(String[] args) {

        Integer[] numbers = {-1, -2, 3, -4, -5, 9, 10, 11};
        Double[] doubleNumbers= {-1.2, -2.5, 133.3, -40.4, -5.98765, 6.392, 16.6666, 28.3672684, 77.7777};
        Date[] dateNumbers = {
            new Date(2018, 12, 25),
            new Date(2019, 01, 01),
            new Date(2019, 01, 02),
            new Date(2018, 05, 01),
            new Date(2011, 04, 11),
            new Date(2019, 01, 06)
        };
        String[] stringNumbers = {
            "01/01/2019", 
            "08/31/2011", 
            "12/25/2017",
            "08/01/2018",
            "08/25/1983",
            "10/30/2020",
            "05/10/2015",
            "08/14/1989",
            "01/06/2019"
        };
        
        //SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        //List listNumbers = new ArrayList<>();
        //for(String i : stringNumbers) {listNumbers.add(sdf.parse(i));}
        //Date[] dateNumbers = listNumbers.toArray(new Date[listNumbers.size()]);

        scanMaxAndMin(numbers);
        scanMaxAndMin(doubleNumbers);
        scanMaxAndMin(dateNumbers);

        scanFirstTwoMaxs(numbers);
        scanFirstTwoMaxs(doubleNumbers);
        scanFirstTwoMaxs(dateNumbers);

        scanFirstThreeMaxs(numbers);
        scanFirstThreeMaxs(doubleNumbers);
        scanFirstThreeMaxs(dateNumbers);
    }
}
