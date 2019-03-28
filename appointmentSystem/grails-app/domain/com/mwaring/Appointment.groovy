package com.mwaring

class Appointment {

	Date appDate
	double appTime
	int appDuration
	String roomNumber
	
	static hasMany=[surgerys:Surgery, doctors:Doctor]
	static belongsTo=[Surgery, Doctor]

	String toString(){
	
		return appDate

	}

    	static constraints = {
		appDate nullable: false, blank: false
		appTime nullable: false, blank: false, scale: 2
		appDuration nullable: false, blank: false
		roomNumber nullable: false, blank: false
	
    	}
}
