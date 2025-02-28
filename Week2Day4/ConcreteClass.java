package Week2Day4;

public class ConcreteClass extends CanaraBank {

	@Override
	public void upiPayments() {
		
	}

	@Override
	void recordPaymentDetails() {
		System.out.println("payment mode cash");

	}

	public static void main(String[] args) {
		ConcreteClass ccc = new ConcreteClass();
		ccc.cardPayments();
		ccc.cashOnDelivery();
		ccc.internetBanking();
		ccc.upiPayment();
		ccc.recordPaymentDetails();
	}

}

