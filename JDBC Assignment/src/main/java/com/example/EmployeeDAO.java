package com.example;

import java.sql.*;

public class EmployeeDAO {

    public static void createTable() throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        String query = "CREATE TABLE IF NOT EXISTS employees (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "email VARCHAR(50), " +
                "age INT)";

        st.execute(query);
        con.close();
    }

    public static void insert(Employee e) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "INSERT INTO employees VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, e.id);
        ps.setString(2, e.name);
        ps.setString(3, e.email);
        ps.setInt(4, e.age);

        ps.executeUpdate();
        con.close();
    }

    public static void fetch() throws Exception {
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery("SELECT * FROM employees");

        while (rs.next()) {
            System.out.println(
                    rs.getInt("id") + " " +
                            rs.getString("name") + " " +
                            rs.getString("email") + " " +
                            rs.getInt("age")
            );
        }

        con.close();
    }

    public static void update(int id, String name) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "UPDATE employees SET name=? WHERE id=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setString(1, name);
        ps.setInt(2, id);

        ps.executeUpdate();
        con.close();
    }

    public static void delete(int id) throws Exception {
        Connection con = DBConnection.getConnection();

        String query = "DELETE FROM employees WHERE id=?";
        PreparedStatement ps = con.prepareStatement(query);

        ps.setInt(1, id);

        ps.executeUpdate();
        con.close();
    }
}