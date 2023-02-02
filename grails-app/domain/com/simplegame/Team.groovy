package com.simplegame

class Team {

    String name 
    String city
    String stadium
    String logo
    String manager
    static hasMany=[players:Player]

    static constraints = {

        name size: 5..40, blank: false, unique:true
        city size: 5..40, blank: false
        stadium size: 5..40, blank: false
        logo size: 5..4000, blank: false
        manager size: 5..40, blank: false

    }

    String toString()
    {
        name
    }
}
