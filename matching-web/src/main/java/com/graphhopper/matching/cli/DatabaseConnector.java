/*
package com.graphhopper.matching.cli;

import java.sql.*;


public class DatabaseConnector {

    private Statement stmt = null;
    private Connection conn = null;
    private String host = "";
    private int port = 5432;
    private String db = "";
    private String user = "";
    private String password = "";

    */
/**
     * Method for Connecting to the database
     *
     * @return Boolean describing if the connection was successful
     *//*

    private boolean connectToDatabase() {
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager
                    .getConnection("jdbc:postgresql://" + host + ":" + port + "/" + db + "",
                            user, password);
            if (!conn.isClosed()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("Connection to the database failed" + host + port + db + user + password + conn + "--" + e.getLocalizedMessage()+"sdasd");
        }
        return false;
    }

    */
/**
     * Method for closing connection to the database
     *
     * @return Boolean describing if closing the connection was successful
     *//*

    private boolean closeConnection() {
        try {
            if (stmt != null) {
                stmt.close();
            }

            if (conn != null) {
                conn.close();
            }
            return true;
        } catch (SQLException e) {
            System.out.println("Cannot close a database connection while not connected" + host + port + db + user + password + conn + "--" + e.getSQLState());
        }
        return false;
    }

    public String getSpecificTrajectory(int trajectory) throws SQLException {
        ResultSet results;
        StringBuilder gpxOutput = new StringBuilder();
        if(connectToDatabase()){

            String query = "select lat,lon from trajectorypoint where trajectory = "+trajectory+"order by time asc";
            stmt = conn.createStatement();
            results = stmt.executeQuery(query);

            gpxOutput.append("<gpx><trk><trkseg>");
            while(results.next()){

                gpxOutput.append("\n<trkpt lat=\"").append(results.getDouble("lat"));
                gpxOutput.append("\" lon=\"").append(results.getDouble("lon")).append("\">");
                gpxOutput.append("</trkpt>");

            }
            gpxOutput.append("\n</trkseg></trk></gpx>");
            closeConnection();
        }
        System.out.println(gpxOutput.toString());
        return gpxOutput.toString();
    }
}*/
