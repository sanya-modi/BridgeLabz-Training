package artify;

public class PrintArt extends Artwork implements IPurchasable{
	
	public PrintArt(String title, String artist, double price, String licenseType) {
		super(title, artist, price, licenseType);
	}
	
	@Override
	public void license() {

	    switch (licenseType.toLowerCase()) {

	        case "personal":
	            System.out.println("Personal License Granted:");
	            System.out.println("- Allowed for personal physical use (home decor, personal prints).");
	            System.out.println("- Printing multiple copies for sale is NOT permitted.");
	            System.out.println("- Artwork cannot be used for business or promotional purposes.");
	            System.out.println("- Artist retains full ownership and copyright.");
	            break;

	        case "commercial":
	            System.out.println("Commercial License Granted:");
	            System.out.println("- Allowed to use artwork on physical products (posters, flyers, merchandise).");
	            System.out.println("- Multiple copies can be printed for business purposes.");
	            System.out.println("- Artwork itself cannot be resold as standalone art.");
	            System.out.println("- Artist retains copyright ownership.");
	            break;

	        case "exclusive":
	            System.out.println("Exclusive License Granted:");
	            System.out.println("- Buyer receives exclusive rights for physical reproduction.");
	            System.out.println("- Artwork will not be printed or licensed to any other buyer.");
	            System.out.println("- Commercial printing and resale of physical copies is permitted.");
	            System.out.println("- Ownership transfer depends on contract agreement.");
	            break;

	        case "subscription":
	            System.out.println("Subscription License Granted:");
	            System.out.println("- Temporary rights to print limited copies during subscription period.");
	            System.out.println("- Commercial resale is NOT permitted.");
	            System.out.println("- Printing rights expire once the subscription ends.");
	            System.out.println("- No ownership or copyright transfer.");
	            break;

	    }
	}
	
	@Override
	public void purchase(User user) {
	    if (user.getWalletBalance() >= price) {
	        user.deductBalance(price);   // -= operator inside
	        System.out.println("Print Art purchased successfully!");
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
