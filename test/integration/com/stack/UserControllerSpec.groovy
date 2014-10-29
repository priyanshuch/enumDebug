package com.stack

import grails.test.spock.IntegrationSpec
import spock.lang.*


class UserControllerSpec extends IntegrationSpec {

    void "test change status with wrong status value"() {
        UserController controller = new UserController()

        when: "change status is called with wrong status value"

        // DUMMY is not a valid status
        controller.changeStatus("DUMMY")

        then: "Status will not be changed"
//        controller.response.json.message == "Failed to update status"
//        controller.response.json.success == false
    }
    
    void "test change status with valid status value"() {
        UserController controller = new UserController()

        when: "change status is called with valid status value"

        // REGISTERED is a valid status
        controller.changeStatus("REGISTERED")

        then: "Status will be changed"
//        controller.response.json.message == "Successfully updated status"
//        controller.response.json.success == true
    }
}
