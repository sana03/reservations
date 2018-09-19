package com.frankmoley.landon.data.repository;

import com.frankmoley.landon.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

public interface RoomRepository extends CrudRepository<Room,Long> {
    Room findByNumber(String number);
}
