package artify;

public class DigitalArt extends Artwork implements IPurchasable{
	
	public DigitalArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	@Override
	public void license() {
		
		switch(licenseType.toLowerCase()) {
			
		case "personal" :
			System.out.println("Personal License Granted:");
			System.out.println("- Allowed for personal use only (wallpapers, social media posts).");
			System.out.println("- Commercial resale or redistribution is NOT permitted.");
			System.out.println("- Artist retains full ownership.");
			break;
			
		case "commercial" :
			System.out.println("Commercial License Granted:");
			System.out.println("- Allowed for commercial use (marketing, branding, advertisements).");
			System.out.println("- Modification is permitted.");
			System.out.println("- Resale of the artwork itself is NOT allowed.");
			System.out.println("- Artist retains copyright ownership.");
			break;
			
		case "exclusive" :
			System.out.println("Exculsive License Granted:");
			System.out.println("- Buyer receives exclusive usage rights.");
			System.out.println("- Artwork will no longer be sold or licensed to others.");
			System.out.println("- Commercial use and resale rights are permitted.");
			System.out.println("- Ownership may partially transfer as per agreement.");
			break;
			
		case "subscription" :
			System.out.println("Subscription License Granted:");
			System.out.println("- Access granted to artwork collection during subscription period.");
			System.out.println("- Commercial use is NOT permitted.");
			System.out.println("- Access will expire once the subscription ends.");
			System.out.println("- No ownership rights are transferred.");
		}
		
	}

	@Override
	public void purchase(User user) {
	    if (user.getWalletBalance() >= price) {
	        user.deductBalance(price);   // -= operator inside
	        System.out.println("Digital Art purchased successfully!");
	        System.out.println();
	        this.displayDetails();
	        System.out.println();
	        license();
	    } else {
	        System.out.println("Insufficient balance!");
	    }

	}
	
	@Override
	public void displayDetails() {
		System.out.println("Art Piece Name : " + title);
		System.out.println("Artist : " + artist);
		System.out.println("Price : " + price);
		System.out.println("License Type : " + licenseType);
		System.out.println();
	}

}
