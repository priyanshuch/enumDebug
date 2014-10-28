package com.stack

import com.stack.User.UserStatus

class UserController {


    def changeStatus(String status) {

        String invalidStatus = "registered"
        String validStatus = "nonregistered"

//        UserStatus futureStatus = UserStatus.find { it.name() == status }

        UserStatus failedStatus = UserStatus.find { it.name() == invalidStatus}
        UserStatus successStatus = UserStatus.find { it.name() == validStatus}
    
        println "failed enum"
        println failedStatus
        println "success enum"
        println succesStatus​
    }

}
