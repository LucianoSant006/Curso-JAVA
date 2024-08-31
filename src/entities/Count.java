package entities;

public class Count {

	private int numberCout;
    private String name;
    private double balance;
	
	public Count() {
		
		
		
	}

	
	 public Count(int numberCout, String name) {
	        this.numberCout = numberCout;
	        this.name = name;
	
	    }
	 
	 
	 	
	
	 public Count(int numberCout, String name, double initialDeposit) {
		this.numberCout = numberCout;
		this.name = name;
		deposit (initialDeposit);
	}
	 
	 public String toString() {
		 return "Account: "
				 +numberCout
				 +", Holder: "
				 +name
				 +", Balance: $"
				 +String.format("%.2f", balance);
	 }



	 


	public int getNumberCount() {
		return numberCout;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}




    public double getBalance() {
        return balance;
    }

    public void setDeposito(double amount) {
        this.balance += amount;
    }


    public void deposit(double amount) {
    	
    	balance += amount;
    }
    
    public void widthdraw(double amount) {
    	
    	balance -= amount + 5.0;
    						
    }

	
	
	
}
