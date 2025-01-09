package vttp.paf.day1.Restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vttp.paf.day1.model.Room;
import vttp.paf.day1.service.RoomService;

@RestController
@RequestMapping("/api/rooms")
public class RoomRestController {
    
    @Autowired
    RoomService roomService;

    @GetMapping ("")
    public ResponseEntity<List<Room>> getAllRooms() {

        List<Room> rooms = roomService.getAllRooms();

        return ResponseEntity.ok().body(rooms);
    }

}
