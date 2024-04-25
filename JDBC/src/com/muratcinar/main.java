package com.muratcinar;

import com.muratcinar.database.DatabaseConnection;

public class main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connection("jdbc","postgres","admin");
    }

}
