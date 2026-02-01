package com.stream_api.event_attendee;

import java.util.*;
import java.util.stream.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Attendee>  attendeeList = Arrays.asList(
				new Attendee("Sanya"),
				new Attendee("krishna"),
				new Attendee("ak"),
				new Attendee("vansh"),
				new Attendee("riya"),
				new Attendee("vk"),
				new Attendee("astha"),
				new Attendee("shreya"),
				new Attendee("shaan")
				);
		
		attendeeList.stream()
		            .forEach(attendee ->
		                     System.out.println("Welcome " + attendee.getName())
		            		);
		
	}

}
