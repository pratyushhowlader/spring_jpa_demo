package com.example.spring_jpa_demo;

import javax.persistence.*;

@Entity
@Table(name = "tbl_room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id")
    long id;
    @Column(name = "room_name")
    String name;

    @Column(name = "room_number")
    String room_number;
    @Column(name = "bed_info")
    String bed_info;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }

    public String getBed_info() {
        return bed_info;
    }

    public void setBed_info(String bed_info) {
        this.bed_info = bed_info;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", room_number='" + room_number + '\'' +
                ", bed_info='" + bed_info + '\'' +
                '}';
    }
}
