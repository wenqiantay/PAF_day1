package vttp.paf.day1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vttp.paf.day1.model.Room;
import vttp.paf.day1.repository.RoomRepository;

@Service
public class RoomService {
    
    @Autowired
    private RoomRepository roomRepository;
 
    public List<Room> getAllRooms() {
        return roomRepository.getRooms();
    }
}
