package trip.planner

class Trip {
	
	String name
	String city
	Date startDate
	Date endDate
	String purpose
	String notes

    static constraints = {
	//specify validation cosntrainst like name no longer than 15 chars, or unique:true
    }
}
