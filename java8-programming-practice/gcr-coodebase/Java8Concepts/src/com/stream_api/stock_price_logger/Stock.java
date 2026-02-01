package com.stream_api.stock_price_logger;

public class Stock {
	
	String symbol;
	double price;
	
	public Stock(String symbol, double price) {
		this.symbol = symbol;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Stock : symbol:" + symbol + ", price:" + price ;
	}
	
	

}
