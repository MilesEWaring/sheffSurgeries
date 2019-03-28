package com.mwaring

class BootStrap {

    def init = { servletContext ->
	/*

	def RajeshKoothrapali = new Doctor(
		fullName: 'Rajesh Koothrapali',
		qualification: 'Doctorate at Harvard',
		position: 'Head Surgon',
		doctorEmail: 'RajeshKoothrapali@gmail.com',
		password: 'Harvard1887',
		doctorOffice: 'H103',
		doctorPhone: '01212822883',
		bio: 'I am a very smart doctor who can do a surgery').save()

	def MilesWaring = new Doctor(
		fullName: 'Miles Waring',
		qualification: 'Doctorate at Yale',
		position: 'Head Doctor',
		doctorEmail: 'MilesWaring@gmail.com',
		password: 'Yale1887',
		doctorOffice: 'H104',
		doctorPhone: '01212822884',
		bio: 'I am a very smart doctor who can do a Doctor stuff').save()
	
	def HallamHouse = new Surgery(
		name: 'Hallam House',
		address: '23 Cantor Road',
		postcode: 'S3 1AQ',
		telephone: '01212882882',
		numberOfPatients: 10,
		description: 'A surgery based in the middle of Sheffield mainly for Sheffield Hallam students',
		openingTime: '08.30',
		closingTime: '20.00').save()

	def KellamHouse = new Surgery(
		name: 'Kellam House',
		address: '42 Kellam Road',
		postcode: 'S1 3S1',
		telephone: '01213930210',
		numberOfPatients: 10,
		description: 'A surgery based on the edge of Sheffield city mainly for Uni of Sheffield students',
		openingTime: '08.30',
		closingTime: '20.00').save()


	def McDevvo = new Patient(
		patientName: 'MC Devvo',
		patientAddress: '1101 Hallam Halls',
		patientResidence: 'Sheffield',
		patientDob: new Date ('09/07/1993'),
		patientID: '888000101',
		dateRegistered: new Date ('20/06/2015'),
		patientPhone: '07791239239').save()

	def McGrinda = new Patient(
		patientName: 'MC Grinda',
		patientAddress: '23 Allsorts Lane',
		patientResidence: 'Sheffield',
		patientDob: new Date ('01/02/1996'),
		patientID: '888000102',
		dateRegistered: new Date ('20/03/2015'),
		patientPhone: '07791239123').save()

	def PamBeasly = new Receptionist(
		recepName: 'Pamela Beasly',
		recepEmail: 'PamelaBeasly@gmail.com',
		recepUsername: 'PamBees',
		recepPassword: 'PamKnees',
		recepPhone: '01212882881').save()

	def HellenKellar = new Receptionist(
		recepName: 'Hellen Kellar',
		recepEmail: 'HellenKellar@gmail.com',
		recepUsername: 'Hellen',
		recepPassword: 'Keller',
		recepPhone: '01212882881').save()

	def BenYardley = new Nurse(
		nurseName: 'Ben Yardley',
		qualifications: '1st Degree Sheffield Hallam',
		nurseEmail: 'BenYardley@gmail.com',
		nurseOffice: 'H113',
		nursePhone: '01212882894').save()

	def AliceWilde = new Nurse(
		nurseName: 'Alice Wilde',
		qualifications: '1st Degree University of Sheffiled',
		nurseEmail: 'AliceWilde@gmail.com',
		nurseOffice: 'H114',
		nursePhone: '01212882231').save()


	def prescription1 = new Prescription(
		pharmacyName: 'Hincliff Park',
		prescripNumber: '101222001',
		medicine: 'Tramadol',
		totalCost: '25.00',
		dateIssued: new Date('12/03/2019'),
		patientPaying: 'true').save()

	def prescription2 = new Prescription(
		pharmacyName: 'Hincliff Park',
		prescripNumber: '101222002',
		medicine: 'Paracetamol',
		totalCost: '15.00',
		dateIssued: new Date('12/05/2019'),
		patientPaying: 'true').save()

	def appointment1 = new Appointment(
		appDate: new Date ('09/04/2019'),
		appTime: '16.30',
		appDuration: 30,
		roomNumber: 'H113').save()

	def appointment2 = new Appointment(
		appDate: new Date ('09/05/2019'),
		appTime: '12.30',
		appDuration: 60,
		roomNumber: 'H114').save()

	
			
	RajeshKoothrapali.addToAppointments(appointment1)
	HallamHouse.addToReceptionists(PamBeasly)
	McDevvo.addToPrescriptions(prescription1)
	HallamHouse.addToNurses(BenYardley)
	RajeshKoothrapali.addToPrescriptions(prescription1)
	HallamHouse.addToAppointments(appointment1)
	HallamHouse.addToDoctors(RajeshKoothrapali)

	MilesWaring.addToAppointments(appointment2)
	KellamHouse.addToReceptionists(HellenKellar)
	McGrinda.addToPrescriptions(prescription2)
	KellamHouse.addToNurses(BenYardley)
	MilesWaring.addToPrescriptions(prescription2)
	KellamHouse.addToAppointments(appointment2)
	KellamHouse.addToDoctors(MilesWaring)

	*/
	
    }
    def destroy = {
    }
}
