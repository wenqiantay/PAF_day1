package vttp.paf.day1.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import vttp.paf.day1.model.Room;
import vttp.paf.day1.utils.sql;

@Repository
public class RoomRepository {

    @Autowired
    JdbcTemplate template;

    //paf day 21 -- slide 26,27//
    public List<Room> getRooms(){
        
        List<Room> rooms = new ArrayList<>();

        SqlRowSet sqlRowSet = template.queryForRowSet(sql.sql_getAllRooms);
        
        while(sqlRowSet.next()){
            Room rm = new Room(sqlRowSet.getInt("id"), sqlRowSet.getString("room_type"), sqlRowSet.getFloat("price"));
            rooms.add(rm);

        }

        return rooms;
    }
    
}
