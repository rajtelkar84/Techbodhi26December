package abstraction;

public class PolicyBazar {
	public static void main(String[] args) {
		
		ReserveBank rb = new SBIBank();
		System.out.println("SBI ROI-"+rb.getRateOfIntrest()+"%");
		
		ReserveBank ic  = new ICICIbank();
		System.out.println("ICICI ROI:"+ic.getRateOfIntrest()+"%");
		
	}

}
