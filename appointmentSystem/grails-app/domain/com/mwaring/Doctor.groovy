package com.mwaring

class Doctor {
	
	String fullName
	String qualification
	String position
	String doctorEmail
	String password
	String doctorOffice
	long doctorPhone
	String bio
    static constraints = {

	fullname nullable: false, blank: false
	qualification nullable: false, blank: false
	position nullable: false, blank: false
	doctorEmail nullable: false, blank: false
	password nullable: false, blank: false
	doctorOffice nullable: false, blank: false
	doctorPhone nullable: false, blank: false
	bio nullable: false, blank: false, maxSize: 500
    }
}
