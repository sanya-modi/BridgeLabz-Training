package com.stream_api.stock_price_logger;
import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Stock> stockList = Arrays.asList(
		        new Stock("AAPL", 189.45),
		        new Stock("GOOGL", 142.30),
		        new Stock("AMZN", 155.20),
		        new Stock("MSFT", 412.85),
		        new Stock("TSLA", 218.90),
		        new Stock("META", 485.60),
		        new Stock("NFLX", 612.40),
		        new Stock("NVDA", 875.30),
		        new Stock("ORCL", 118.75),
		        new Stock("IBM", 196.40)
		);
		
		stockList.stream()
		         .forEach(System.out::println);

		
	}

}
