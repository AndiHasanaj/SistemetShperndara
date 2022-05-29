package com.raven.service;

import com.raven.connection.DatabaseConnection;
import com.raven.model.Model_Client;
import com.raven.model.Model_Login;
import com.raven.model.Model_Message;
import com.raven.model.Model_Register;
import com.raven.model.Model_User_Account;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceUser {

    public ServiceUser() {
        this.con = DatabaseConnection.getInstance().getConnection();
    }

    public Model_Message register(Model_Register data) {
        String INSERT_USER = "INSERT INTO user (UserName, 'Password') VALUES ('"+ data.getUserName() +"','"+ data.getPassword() +"')";
        String CHECK_USER = "SELECT UserID FROM user WHERE UserName ='"+ data.getUserName() +"' limit 1";
        
        //  Check user exit
        Model_Message message = new Model_Message();    
        try {
            PreparedStatement p = con.prepareStatement(CHECK_USER);
            ResultSet r = p.executeQuery();
            if (r.next()) {
                message.setAction(false);
                message.setMessage("User Already Exists.");
            } else {
                message.setAction(true);
            }
            r.close();
            p.close();
            if (message.isAction()) {
                //  Insert User Register
                con.setAutoCommit(false);
                p = con.prepareStatement(INSERT_USER, PreparedStatement.RETURN_GENERATED_KEYS);
                p.execute();
                r = p.getGeneratedKeys();
                r.first();
                int userID = r.getInt(1);
                r.close();
                p.close();
                // create user
                String INSERT_USER_ACCOUNT = "insert into user_account (UserID, UserName) values ('"+userID+"','"+data.getUserName()+"')";
                p = con.prepareStatement(INSERT_USER_ACCOUNT);
                p.execute();
                p.close();
                con.commit();
                con.setAutoCommit(true);
                message.setAction(true);
                message.setMessage("Ok");
                message.setData(new Model_User_Account(userID, data.getUserName(), "", true));
            }
        } catch (SQLException e) {
            message.setAction(false);
            message.setMessage("Server Error");
            try {
                if (con.getAutoCommit() == false) {
                    con.rollback();
                    con.setAutoCommit(true);
                }
            } catch (SQLException e1) {
            }
        }
        return message;
    }
    
    // Login
    public Model_User_Account login(Model_Login login) throws SQLException {
        String LOGIN = "Select user.UserID, user.UserName, user_account.Gender from user "
                     + "join user_account using(UserID) where user.UserName =BINARY('"+login.getUserName()+"') "
                     + "and user.Password=BINARY('"+login.getPassword()+"') and user_account.status='1'";
        Model_User_Account data = null;
        PreparedStatement p = con.prepareStatement(LOGIN);
        ResultSet r = p.executeQuery();
        if (r.next()) {
            int userID = r.getInt(1);
            String userName = r.getString(2);
            String gender = r.getString(3);
            data = new Model_User_Account(userID, userName, gender, true);
        }
        r.close();
        p.close();
        return data;
    }
    
     public List<Model_User_Account> getUser(int exitUser) throws SQLException {
        List<Model_User_Account> list = new ArrayList<>();
        String SELECT_USER_ACCOUNT = "select UserID, UserName, Gender from user_account where user_account.`status`='1' and UserID<>"+exitUser;
    
        PreparedStatement p = con.prepareStatement(SELECT_USER_ACCOUNT);
        ResultSet r = p.executeQuery();
        while (r.next()) {
            int userID = r.getInt(1);
            String userName = r.getString(2);
            String gender = r.getString(3);
            list.add(new Model_User_Account(userID, userName, gender, checkUserStatus(userID)));
        }
        r.close();
        p.close();
        return list;
    }
     
     private boolean checkUserStatus(int userID) {
        List<Model_Client> clients = Service.getInstance(null).getListClient();
        for (Model_Client c : clients) {
            if (c.getUser().getUserID() == userID) {
                return true;
            }
        }
        return false;
    }

    
    //  Instance
    private final Connection con;
}
