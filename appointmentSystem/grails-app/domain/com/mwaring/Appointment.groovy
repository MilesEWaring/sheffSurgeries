package com.mwaring

class Appointment {

	Date appDate
	float appTime
	int appDuration
	String roomNumber

	static belongsTo=[Patient,Doctor,Surgery]
	static hasMany=[doctors:Doctor]

    	static constraints = {
		appDate nullable: false, blank: false
		appTime nullable: false, blank: false
		appDuration nullable: false, blank: false
		roomNumber nullable: false, blank: false
	
    	}
}
