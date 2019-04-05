package jdbcdemo;

import java.sql.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Driver {

	public static void main(String[] args) throws Exception {
		
		//hibernate test
		//Create session factory 
		SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Employee.class)
									.buildSessionFactory();
		//Create session
		Session session = factory.getCurrentSession();
		
		//create employee objects
		//Employee e1= new Employee(30,"Abdelwaheb","FERCHICHI");
		//Employee e2 = new Employee(40,"Yahia","FERCHICHI");
		//start transaction
		session.beginTransaction();
		//save the employee objects
		System.out.println("Saving Objects .....");
		//session.save(e1);
		//session.save(e2);
		//delete all employees
		String deleteString = "delete from Employee";
		Query deleteQuery = session.createQuery(deleteString);
		deleteQuery.executeUpdate();
		
		//commit transaction
		session.getTransaction().commit();
		//JDBC test
		
		/*String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String password = "hr";
		//1. Get a connection
		Connection myConn = DriverManager.getConnection(url,user,password);
		
		//2. Create a statement
		Statement myStmt = myConn.createStatement();
		
		//3. Execute SQL query
		ResultSet rst = myStmt.executeQuery("select * from employees");
		
		//4. Process Query result
		while(rst.next()){
			System.out.println(rst.getString(2)+" , "+rst.getString("last_name"));
		}
		*/

	}

}
