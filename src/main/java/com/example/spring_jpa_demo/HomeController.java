package com.example.spring_jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


//This is from github
@RestController
public class HomeController {
    @Autowired
    private RoomRepository roomRepository;
    @RequestMapping("/home")
    public List<Room> getHome() {

       return this.roomRepository.findAll();
    }
    @RequestMapping("/addnew")
    public String addNew(){
        Room room =new Room();
        room.setName("Business");
        room.setRoom_number("4");
        room.setBed_info("4");
        this.roomRepository.save(room);
        return "Record addedd";
    }
}
