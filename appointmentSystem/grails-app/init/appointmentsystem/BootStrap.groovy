package com.mwaring

class BootStrap {

    def init = { servletContext ->
	def HallamHouse = new Surgery(
		name: 'Hallam House',
		address: '23 Cantor Road',
		postcode: 'S3 1AQ',
		telephone: '01212 882882',
		numberOfPatients: '10',
		description: 'A surgery based in the middle of Sheffield mainly for Sheffield Hallam students',
		openingTime: '08.30').save()

	def RajeshKoothrapali = new Doctor(
		fullName: 'Rajesh Koothrapali',
		qualification: 'Doctorate at Harvard',
		position: 'Head Surgery',
		doctorEmail: 'RajeshKoothrapali@gmail.com',
		password: 'Harvard1887',
		doctorOffice: 'H103',
		doctorPhone: '01212 822883',
		bio: 'I am a very smart doctor who can do a surgery').save()

	def McDevvo = new Patient(
		patientName: 'MC Devvo',
		patientAddress: '1101 Hallam Halls',
		patientResidence: 'Sheffield',
		patientDOB: new Date ('09/07/2019'),
		patientID: '888000101',
		dateRegistered: new Date ('20/06/2015'),
		patientPhone: '07791 239239').save()

	
    }
    def destroy = {
    }
}
