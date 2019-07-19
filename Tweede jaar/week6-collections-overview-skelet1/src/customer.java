	
	
	public class customer {
	    private String name;
	    private int points;
	    private int customerNumber;

	    public customer(int customerNumber, String name) {
	        this.name = name;
	        this.customerNumber = customerNumber;
	        points = 0;
	    }

	    public int addPoints(int pointsToAdd) {
	        points += pointsToAdd;
	        return points;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getPoints() {
	        return points;
	    }

	    public int getCustomerNumber() {
	        return customerNumber;
	    }
	}



