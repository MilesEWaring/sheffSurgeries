package com.mwaring

class BootStrap {

    def init = { servletContext ->


	def RajeshKoothrapali = new Doctor(
		fullName: 'Rajesh Koothrapali',
		qualification: 'Doctorate at Harvard',
		position: 'Head Surgery',
		doctorEmail: 'RajeshKoothrapali@gmail.com',
		password: 'Harvard1887',
		doctorOffice: 'H103',
		doctorPhone: '01212822883',
		bio: 'I am a very smart doctor who can do a surgery').save()
	
	def HallamHouse = new Surgery(
		name: 'Hallam House',
		address: '23 Cantor Road',
		postcode: 'S3 1AQ',
		telephone: '01212882882',
		numberOfPatients: 10,
		description: 'A surgery based in the middle of Sheffield mainly for Sheffield Hallam students',
		openingTime: '08.30').save()


	def McDevvo = new Patient(
		patientName: 'MC Devvo',
		patientAddress: '1101 Hallam Halls',
		patientResidence: 'Sheffield',
		patientDob: new Date ('09/07/2019'),
		patientID: '888000101',
		dateRegistered: new Date ('20/06/2015'),
		patientPhone: '07791239239').save()

	def PamBeasly = new Receptionist(
		recepName: 'Pamela Beasly',
		recepEmail: 'PamelaBeasly@gmail.com',
		recepUsername: 'PamBees',
		recepPassword: 'PamKnees',
		recepPhone: '01212882881').save()

	def BenYardley = new Nurse(
		nurseName: 'Ben Yardley',
		qualifications: '1st Degree Sheffield Hallam',
		nurseEmail: 'BenYardley@gmail.com',
		nurseOffice: 'H113',
		nursePhone: '01212882894').save()


def prescription1 = new Prescription(
		pharmacyName: 'Hincliff Park',
		prescripNumber: '101222001',
		medicine: 'Tramadol',
		totalCost: '25.00',
		dateIssued: new Date('12/03/2019'),
		patientPaying: 'true').save()

	def appointment1 = new Appointment(
		appDate: new Date ('09/04/2019'),
		appTime: '16.30',
		appDuration: 30,
		roomNumber: 'H113').save()

	
			
	RajeshKoothrapali.addToAppointments(appointment1)
	HallamHouse.addToReceptionists(PamBeasly)
	McDevvo.addToPrescriptions(prescription1)
	HallamHouse.addToNurses(BenYardley)
	RajeshKoothrapali.addToPrescriptions(prescription1)
	HallamHouse.addToAppointments(appointment1)
	HallamHouse.addToDoctors(RajeshKoothrapali)


	
    }
    def destroy = {
    }
}
