package com.mwaring

class Surgery {

	String name
	String address
	String postcode
	String telephone
	int numberOfPatients
	String description
	double openingTime
	double closingTime
	
	static hasMany=[receptionists:Receptionist,doctors:Doctor,nurses:Nurse,patients:Patient,appointments:Appointment]
    	
	String toString(){
	
		return name

	}

	static constraints = {

		name nullable: false, blank: false
		address nullable: false, blank: false
		postcode nullable: false, blank: false
		telephone nullable: false, blank: false
		numberOfPatients nullable: false, blank: false, minSize: 1, MaxSize: 100
		description nullable: false, blank: false, maxSize: 2500
		openingTime nullable: false, blank: false, scale: 2
		closingTime nullable: false, blank: false, scale: 2
	
    	}
}
