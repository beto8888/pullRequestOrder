public class Main {

	public static void main(final String[] args) {
		internalCall();
	}
	
	public static void callAFunction() {
		System.out.println("Function Called");
	}
	
	public static void internalCall() {
		this.callAFunction();
	}

}
