package com.example.findinghotel;

public class Detail {
    public String title,address,contactus;
    public Detail(){

    }
    public Detail(String title,String address,String contactus ){
        this.title=title;
        this.contactus=contactus;
        this.address=address;
    }
    public String getTitle(){
        return title;
    }
    public String getAddress(){
        return address;
    }
    public String getContactus(){
        return contactus;
    }
}



