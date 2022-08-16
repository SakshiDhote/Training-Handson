package com.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

/*
@Controller

public class CustomerRegistration {

	@RequestMapping("/hello")

	public String display(@RequestParam("name") String name, @RequestParam("add") String add,
			@RequestParam("no") String no, @RequestParam("gender") String gender, @RequestParam("status") String status,
			Model m)

	{

		String msg = "Hello " + name + ", registration successfully!!";

		// add a message to the model

		m.addAttribute("message", msg);

		return "viewpage";

	}

}
*/

@Controller

public class CustomerRegistration  {

	@RequestMapping("/hello")

	public String display(@RequestParam("name") String name, @RequestParam("add") String add,
			@RequestParam("no") String no, @RequestParam("gender") String gender, @RequestParam("status") String status,
			Model m) throws Exception

	{
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "root");

		 
		 String query = "insert into CustomerRegistration values(?,?,?,?,?)";
		 PreparedStatement st = con.prepareStatement(query);
		 
		 st.setString(1, name);
		 st.setString(2,add);
		 st.setString(3,no);
		 st.setString(4,gender);
		 st.setString(5,status);

		 int i = st.executeUpdate();
		 if(i>0) {
			 String msg = "Hello " + name + ", registration successfully!!";

				// add a message to the model

				m.addAttribute("message", msg);

				return "viewpage";
		 }
		 else {
			 String msg="Sorry "+ name+". registration not completed";

		      m.addAttribute("message", msg);

		      return "errorpage";
		 }


	}

}

