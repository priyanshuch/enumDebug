package com.stack

class UserController {

    def changeStatus(String status) {
        println status
        UserStatus futureStatus = UserStatus.find { it.name() == status}
        println "futureStatus>>>" + futureStatus

        if (!futureStatus)
            respond ([success: false, message: "Failed to update status"])
        else 
            respond ([success: true, message: "Successfully updated status"])

        redirect(uri: "/")
    }

    enum UserStatus {
        REGISTERED,
        NONREGISTERD
    }
}
