package loginandsignup;

// JythonHelloWorld.java

// Pythontest.java
import org.apache.http.client.fluent.Request;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pythontest {

    private static final String ALPHA_VANTAGE_API_KEY = "YOUR_ALPHA_VANTAGE_API_KEY";

    public static void main(String[] args) {
        List<String> numList = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int n = scanner.nextInt();
        System.out.println();

        System.out.print("Enter the list numbers separated by space: ");
        for (int i = 0; i < n; i++) {
            numList.add(scanner.next());
        }

        System.out.println("User List: " + numList);

        getStockData(numList);
    }

    public static void getStockData(List<String> numList) {
        for (String ticker : numList) {
            try {
                String apiUrl = "https://www.alphavantage.co/query?function=TIME_SERIES_DAILY&symbol=" + ticker
                        + "&apikey=" + ALPHA_VANTAGE_API_KEY;

                String response = Request.Get(apiUrl).execute().returnContent().asString();
                JSONObject jsonResponse = new JSONObject(response);

                // Extracting historical data from Alpha Vantage JSON response
                JSONObject timeSeries = jsonResponse.getJSONObject("Time Series (Daily)");
                for (String date : timeSeries.keySet()) {
                    JSONObject dailyData = timeSeries.getJSONObject(date);
                    String closePrice = dailyData.getString("4. close");
                    System.out.println(date + " - Close: " + closePrice);
                }
                System.out.println();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}



