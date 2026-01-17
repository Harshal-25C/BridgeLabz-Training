package com.day6.SortArtistsbyRegistrationTime;

class Artist {
    String name;
    int registrationTime; //smaller value = earlier registration

    Artist(String name, int registrationTime) {
        this.name = name;
        this.registrationTime = registrationTime;
    }

    @Override
    public String toString() {
        return name+" (Time: "+registrationTime+")";
    }
}
