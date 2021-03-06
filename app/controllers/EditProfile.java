package controllers;

import play.*;
import play.mvc.*;
import java.util.*;
import models.*;

public class EditProfile extends Controller
{
  public static void change (String theme, String firstName,   String lastName, int    age, 
                             String nationality, String email,    String password, String password2)
  {
    User user = Accounts.getLoggedInUser();
    user.theme = theme;
    user.firstName = firstName;
    user.lastName = lastName;
    user.email = email;
    user.nationality = nationality;
    user.age = age;
    if(!password.equals(""))
    {
    	user.password = password;
    }
    user.save();
    Home.index();
  }

  public static void index()
  {
    User user = Accounts.getLoggedInUser();
    render(user);
  }
}