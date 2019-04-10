package com.mwaring

class DoctorController {

    def scaffold = Doctor


	def login(){

	}

	def validate(){
	def user = Doctor.findByDoctorEmail(params.DoctorUsername)
		if(user && user.password == params.password){
			session.user = user
			render view:'home'
		}
		else{
			flash.message = "Invalid username and password."
			render view:'login'
		}

	}

	def logout = {
	
		session.user = null

		redirect(uri:'/')
	}



}
