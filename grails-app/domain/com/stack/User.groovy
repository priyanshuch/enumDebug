package com.stack

class User {

    static constraints = {
    }
    
    enum UserStatus {
        REGISTERD(1, "registered"),
        NONREGISTERD(2, "nonregistered"),
    }
}
