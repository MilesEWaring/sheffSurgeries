package com.mwaring

class Prescription {


	String pharmacyName;
	int prescripNumber;
	String medicine;
	double totalCost;
	Date dateIssued;
	Boolean patientPaying;

	static hasMany=[patients:Patient, doctors:Doctor]

	static belongsTo=[Doctor]


	String toString(){
	
		return pharmacyName

	}
        static constraints = {



	pharmacyName nullable: false, blank: false
    	prescripNumber nullable: false, blank: false
	medicine nullable: false, blank: false
	totalCost nullable: false, blank: false, scale: 2
	dateIssued nullable: false, blank: false
	patientPaying nullable: false, blank: false
	
	}	
}
