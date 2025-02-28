package Week2Day4;

public abstract class CanaraBank implements Payments {

	public void cashOnDelivery() {
		System.out.println("limit to INR5000");
	}

	public void upiPayment() {
		System.out.println("payment limit to INR10000");
	}

	public void cardPayments() {
		System.out.println("card limit INR25000");
	}

	public void internetBanking() {
		System.out.println("net banking limit INR50000");
	}

	abstract void recordPaymentDetails();
	
	public static void main(String[] args) {

	}

}
