package com.plugin.finance;

public class QuoteItem {
    private final String code;
    private final String name;
    private final double price;
    private final double changePercent;
    private final double changeAmount;
    private final double openPrice;
    private final double closePrice;
    private final double highPrice;
    private final double lowPrice;

    public QuoteItem(String code, String name, double price, double changePercent, double changeAmount,
                     double openPrice, double closePrice, double highPrice, double lowPrice) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.changePercent = changePercent;
        this.changeAmount = changeAmount;
        this.openPrice = openPrice;
        this.closePrice = closePrice;
        this.highPrice = highPrice;
        this.lowPrice = lowPrice;
    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public double getChangePercent() { return changePercent; }
    public double getChangeAmount() { return changeAmount; }
    public double getOpenPrice() { return openPrice; }
    public double getClosePrice() { return closePrice; }
    public double getHighPrice() { return highPrice; }
    public double getLowPrice() { return lowPrice; }
}
