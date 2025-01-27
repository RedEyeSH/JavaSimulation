// 1.3 - Task 02

public class AgeDistribution_02 {
    public static void main(String[] args) {
        final int REITERATIONS = 1000;
        final int MAXAGE = 30;

        int agedistribution[][] = {
                {10, 20},  		// 16 %		// This line matches to random numbers 1..16,  gives age 20
                {25, 21},  		// 18 %    	// This line matches to random numbers 17..34, gives age 21
                {40, 22},		// 18 %    	// ...
                {60, 23},    	// 16 %
                {70, 24},  		// 14 %
                {80, 25}, 		// 7 %
                {90, 26},  		// 5 %
                {95, 28},		// 2 %
                {98, 30},  		// 2 %
                {100,MAXAGE}, 	// 2 %	  	// This line matches to random numbers 99 and 100
        };

        int generatedAges[] = new int[MAXAGE+1];

        // Generate ages according to the distribution:
        for (int i = 1; i <= REITERATIONS; i++){
            int x = (int)(Math.random()*100)+1; 	// generate a random number 1..100 -> we get the row which gives the age
            int j = 0;
            while (x > agedistribution[j][0]) j++;  // search for the correct row to get the matching age
            generatedAges[agedistribution[j][1]]++; // age founded gives an index to the generated ages count table: increment it (by one)
        }

        // Output the result of the generation:
        System.out.println("Age  count     %-share");
        for (int age = 0; age <= MAXAGE; age++) {
            if (generatedAges[age] != 0) {
                String str = "%-4d %-8d %-8.2f\n";
                System.out.printf(str, age, generatedAges[age], ((double)generatedAges[age])/REITERATIONS*100 );
            }
        }
    }
}