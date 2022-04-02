package com.example.spring_jpa_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

@SpringBootApplication
//@Component
public class SpringJpaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJpaDemoApplication.class, args);

    }
    @Autowired
    RoomRepository roomRepository;

 /*   public SpringJpaDemoApplication(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }*/

    @EventListener(ApplicationReadyEvent.class)
    public void EventListenerExecute() {

        Iterable<Room> roomIterable = this.roomRepository.findAll();
        roomIterable.forEach(System.out::println);
        //System.out.println("Application Ready Event is successfully Started prasun");
    }



}
