/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author Pipo-Admin
 */
import java.util.ArrayList;
    
public class User 
{
    
    private ArrayList<User_creation>users;
    
    //variables of ths class
     String name;
     boolean stats;
    
    public User(String Name)
    {
            name = Name;
            users = new ArrayList<User_creation> ();
            
    }
    //finding if the username and password are in the ArrayList and returnig 2 for admin permition, 1 for normal permissions and 0 if the user is not found
    public int checker(String username, String password)
    {
         for(int count=0; count < users.size(); count++)
        {
            User_creation currentUser = users.get(count);
            if(currentUser.Checker(username, password) == true)
                if(currentUser.getstats() == true)
                    return 2;
            return 1;
        }
        return(0);
    }
    //modify name of a user by serching the user to be modifyed, verifing if exists with 
    //the user_checker function iside the class User_creation and modifing the user if the return is true
    public boolean modify_name(String new_username,String username_modify)
    {
        for(int count=0; count < users.size(); count++)
        {
            User_creation currentUser = users.get(count);
            if(currentUser.user_Checker(username_modify) == true)
            {
                currentUser.modify(new_username);
                return true;
            }
        }
        return false;
    }
    
    public void user_array(User_creation temp)
    {
        users.add(temp);
    }
 
    public void getuser_array()
    {
        for(int count=0; count < users.size(); count++)
        {
            User_creation currentUser = users.get(count);
            currentUser.print();
        }
    }
    
}