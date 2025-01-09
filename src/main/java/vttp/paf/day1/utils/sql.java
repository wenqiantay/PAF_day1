package vttp.paf.day1.utils;

public class sql {
    
    public static final String sql_getAllRooms = "SELECT * from room";
    public static final String sql_getAllCustomers="SELECT * from customer";
    public static final String sql_getCustomer_LimitOffset="SELECT * from customer limit ? offset ?";
    public static final String sql_getCustomerById="SELECT * from customer where id = ?";
}
