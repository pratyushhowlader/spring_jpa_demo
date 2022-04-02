package com.example.spring_jpa_demo;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

//@Component
public class AppStartUp {
    RoomRepository roomRepository;

    public AppStartUp(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void EventListenerExecute() {

        Iterable<Room> roomIterable = this.roomRepository.findAll();
        roomIterable.forEach(System.out::println);
        //System.out.println("Application Ready Event is successfully Started prasun");
    }
}
