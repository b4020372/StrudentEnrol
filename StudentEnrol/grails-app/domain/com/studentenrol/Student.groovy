package com.studentenrol

class Student {

String name
String studentid
Date dob
String email
String username
String password
String course

String toString(){
"$name, $studentid,$email"
} 

    static constraints = {
name maxSize:100
studentid()
dob()
email()
username()
password()
course()
    }
}
