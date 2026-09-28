package gamingconsolereport;

public class GamingConsoleReport {
    public static void main(String[] args) {
        // 1. Declare and populate the 1D arrays for cities and console types
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // 2. Declare and populate the 2D array for sales data corresponding to the cities and consoles
        int[][] salesData = {
            {1000, 2000, 3000}, // Cape Town sales: PS5, XBOX, SWITCH
            {2000, 3000, 4000}, // Port Elizabeth sales: PS5, XBOX, SWITCH
            {1500, 1100, 1200} // Pretoria sales: PS5, XBOX, SWITCH
        };

        // Display the main Gaming Console Report table
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-15s %-10s %-10s %-10s\n", "", consoles[0], consoles[1], consoles[2]);
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-15s", cities[i]);
            for (int j = 0; j < salesData[i].length; j++) {
                System.out.printf("%-10d", salesData[i][j]);
            }
            System.out.println();
        }
        System.out.println("--------------------------------------------------");
        System.out.println();

        // 3. Calculate and display total sales for each city
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------");

        int maxSales = -1;
        String cityWithMostSales = "";

        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < salesData[i].length; j++) {
                cityTotal += salesData[i][j];
            }

            // Print the city and its total sales
            System.out.printf("%-15s %d\n", cities[i], cityTotal);

            // Determine the city with the most sales
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                cityWithMostSales = cities[i];
            }
        }
        System.out.println("--------------------------------------------------");
        System.out.println();

        // 4. Display the city with the most sales
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("--------------------------------------------------");
    }
}
