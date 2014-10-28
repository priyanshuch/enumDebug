package com.stack

class User {

    UserStatus status = UserStatus.NONREGISTERD

    enum UserStatus {
        REGISTERD(1, "registered"),
        NONREGISTERD(2, "nonregistered"),
    }
}
