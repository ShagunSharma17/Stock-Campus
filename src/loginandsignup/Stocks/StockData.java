/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginandsignup.Stocks;

/**
 *
 * @author Arun Jangra
 */


public class StockData {
    private final double open;
    private final double high;
    private final double low;
    private final double close;

    public StockData(double open, double high, double low, double close) {
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
    }

    public double getOpen() {
        return open;
    }

    public double getHigh() {
        return high;
    }

    public double getLow() {
        return low;
    }

    public double getClose() {
        return close;
    }
}

