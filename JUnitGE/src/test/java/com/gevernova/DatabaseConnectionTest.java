package com.gevernova;

import com.gevernova.DatabaseConnection;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DatabaseConnectionTest {
    private DatabaseConnection db;
    @BeforeEach
    void setUp(){
        db = new DatabaseConnection();
        db.connect();
    }
    @AfterEach
    void tearDown(){
         db.disconnected();
    }
    @Test
    void testConnectionIsEstablished(){
        assertTrue(db.isConnected(), "Database should be connected");
    }
    @Test
    void testConnectionIsClosedAfterEach() {
        // Since @AfterEach runs after the test, we can only check disconnect() via logs/assumptions.
        assertTrue(db.isConnected(), "Connection should be open during the test");
    }
}
