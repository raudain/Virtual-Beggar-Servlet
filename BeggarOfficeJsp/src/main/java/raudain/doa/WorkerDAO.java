package raudain.doa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <br/>
 * CLASS DESCRIPTION: <br/>
 * A Data Access Object (DAO) class for handling and managing event related data
 * requested, updated, and processed in the application and maintained in the
 * database. The interface between the application and event data persisting in
 * the database. <br/>
 *
 * @author Roody Audain
 *
 */
public class WorkerDAO {

	// JDBC API classes for data persistence
	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private DatabaseQuerysBean sqlScripts;
	private ResultSet resultSet = null;

	// Default constructor for injecting Spring dependencies for SQL queries
	public WorkerDAO() {
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			sqlScripts = (DatabaseQuerysBean) context.getBean("SqlBean");
		}
	}

	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for displaying all of the worker names in the worker Table in the
	 * Database <br/>
	 *
	 * PSEUDOCODE: <br/>
	 * Create a new connection to the database. <br/>
	 * Prepare a statement object using the connection that gets all the worker
	 * names from the worker table. <br/>
	 * Execute the SQL statement and keep a reference to the result set.<br/>
	 * Return the ArrayList to the calling method. <br/>
	 *
	 * @return Collection of Events
	 *
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public ArrayList<Worker> getWorkersByRoom1() {

		Statement statement = null;
		connection = DataConnection.createConnection();	
		try {
			statement = connection.createStatement();
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "Statement in WorkerDAO.getWorkersByRoom1()");
			e.printStackTrace();
		}
		
		final String sqlScript = sqlScripts.getWorkerListByRoom1();
		try {
			resultSet = statement.executeQuery(sqlScript);
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "ResultSet in WorkerDAO.getWorkersByRoom1()");
			e.printStackTrace();
		}
		return getWorkerList(resultSet);
	}

	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for displaying all of the worker names in the worker Table in the
	 * Database <br/>
	 *
	 * PSEUDOCODE: <br/>
	 * Create a new connection to the database. <br/>
	 * Prepare a statement object using the connection that gets all the worker
	 * names from the worker table. <br/>
	 * Execute the SQL statement and keep a reference to the result set.<br/>
	 * Return the ArrayList to the calling method. <br/>
	 *
	 * @return Collection of Events
	 *
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public ArrayList<Worker> getWorkersByRoom2() {

		Statement statement = null;
		connection = DataConnection.createConnection();	
		try {
			statement = connection.createStatement();
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "Statement in WorkerDAO.getWorkersByRoom2()");
			e.printStackTrace();
		}
		
		final String sqlScript = sqlScripts.getWorkerListByRoom2();
		try {
			resultSet = statement.executeQuery(sqlScript);
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "ResultSet in WorkerDAO.getWorkersByRoom2()");
			e.printStackTrace();
		}
		return getWorkerList(resultSet);
	}
	
	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for displaying all of the worker names in the worker Table in the
	 * Database <br/>
	 *
	 * PSEUDOCODE: <br/>
	 * Create a new connection to the database. <br/>
	 * Prepare a statement object using the connection that gets all the worker
	 * names from the worker table. <br/>
	 * Execute the SQL statement and keep a reference to the result set.<br/>
	 * Return the ArrayList to the calling method. <br/>
	 *
	 * @return Collection of Events
	 *
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public ArrayList<Worker> getWorkersByRoom3() {

		Statement statement = null;
		connection = DataConnection.createConnection();	
		try {
			statement = connection.createStatement();
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "Statement in WorkerDAO.getWorkersByRoom3()");
			e.printStackTrace();
		}
		
		final String sqlScript = sqlScripts.getWorkerListByRoom3();
		try {
			resultSet = statement.executeQuery(sqlScript);
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "ResultSet in WorkerDAO.getWorkersByRoom3()");
			e.printStackTrace();
		}
		return getWorkerList(resultSet);
	}
	
	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for displaying all of the worker names in the worker Table in the
	 * Database <br/>
	 *
	 * PSEUDOCODE: <br/>
	 * Create a new connection to the database. <br/>
	 * Prepare a statement object using the connection that gets all the worker
	 * names from the worker table. <br/>
	 * Execute the SQL statement and keep a reference to the result set.<br/>
	 * Return the ArrayList to the calling method. <br/>
	 *
	 * @return Collection of Events
	 *
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public ArrayList<Worker> getWorkersByRoom4() {

		Statement statement = null;
		connection = DataConnection.createConnection();	
		try {
			statement = connection.createStatement();
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "Statement in WorkerDAO.getWorkersByRoom4()");
			e.printStackTrace();
		}
		
		final String sqlScript = sqlScripts.getWorkerListByRoom4();
		try {
			resultSet = statement.executeQuery(sqlScript);
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "ResultSet in WorkerDAO.getWorkersByRoom1()");
			e.printStackTrace();
		}
		return getWorkerList(resultSet);
	}
	
	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for displaying all of the worker names in the worker Table in the
	 * Database <br/>
	 *
	 * PSEUDOCODE: <br/>
	 * Create a new connection to the database. <br/>
	 * Prepare a statement object using the connection that gets all the worker
	 * names from the worker table. <br/>
	 * Execute the SQL statement and keep a reference to the result set.<br/>
	 * Return the ArrayList to the calling method. <br/>
	 *
	 * @return Collection of Events
	 *
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public ArrayList<Worker> getWorkersByRoom5() {

		Statement statement = null;
		connection = DataConnection.createConnection();	
		try {
			statement = connection.createStatement();
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "Statement in WorkerDAO.getWorkersByRoom5()");
			e.printStackTrace();
		}
		
		final String sqlScript = sqlScripts.getWorkerListByRoom5();
		try {
			resultSet = statement.executeQuery(sqlScript);
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "ResultSet in WorkerDAO.getWorkersByRoom5()");
			e.printStackTrace();
		}
		return getWorkerList(resultSet);
	}
	
	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for displaying all of the worker names in the worker Table in the
	 * Database <br/>
	 *
	 * PSEUDOCODE: <br/>
	 * Create a new connection to the database. <br/>
	 * Prepare a statement object using the connection that gets all the worker
	 * names from the worker table. <br/>
	 * Execute the SQL statement and keep a reference to the result set.<br/>
	 * Using a WHILE LOOP, store each record in the result set returned in a Worker
	 * object by setting the values of the Event attributes as the corresponding
	 * values in the Result set.<br/>
	 * Return the ArrayList to the calling method. <br/>
	 *
	 * @return Collection of Events
	 *
	 */
	public ArrayList<Worker> getWorkersByCost() {

		Statement statement = null;
		connection = DataConnection.createConnection();	
		try {
			statement = connection.createStatement();
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "Statement in getWorkers WorkerDAO");
			e.printStackTrace();
		}
		
		final String sqlScript = sqlScripts.getWorkerListByCost();
		try {
			resultSet = statement.executeQuery(sqlScript);
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "ResultSet in getWorkers WorkerDAO");
			e.printStackTrace();
		}

		return getWorkerList(resultSet);
	}
	
	/**
	 * <br/>
	 * Now we collect the data from the result in order to display them in
	 * the Java Server Page <br/>
	 * 
	 * @return ArrayList<Worker>
	 *
	 */
	private ArrayList<Worker> getWorkerList(ResultSet resultSet) {

		ArrayList<Worker> workerList = new ArrayList<Worker>();
		try {
			while (resultSet.next()) {
				Worker worker = new Worker();

				short room = resultSet.getShort("Room");
				worker.setRoom(room);

				String name = resultSet.getString("Name");
				worker.setName(name);

				String profession = resultSet.getString("ProfessionName");
				worker.setProfession(profession);

				String endurance = resultSet.getString("EnduranceName");
				worker.setEndurance(endurance);

				long cost = resultSet.getLong("Cost");
				worker.setCost(cost);

				workerList.add(worker);
			}
		} catch (final SQLException e) {
			System.out.println("Error. Problem getting workers.");
			e.printStackTrace();
		}
		try {
			DataConnection.closeConnection();
		} catch (final SQLException e) {
			System.out.println("Error. Problem with closing connection");
			e.printStackTrace();
		}
		return workerList;
	}
	
	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for displaying all the workers in the worker Table in the Database <br/>
	 *
	 * PSEUDOCODE: <br/>
	 * Create a new connection to the database. <br/>
	 * Prepare a statement object using the connection that gets all the workers
	 * from the worker table. <br/>
	 * Execute the SQL statement and keep a reference to the result set.<br/>
	 *
	 * @return The number of the next available room for a new worker
	 *
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public short getNextRoom() {
		
		Statement statement = null;
		connection = DataConnection.createConnection();
		try {
			statement = connection.createStatement();
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "Statement in getNextRoom WorkerDAO");
			e.printStackTrace();
		}
		
		final String sqlScript = sqlScripts.getLastRoom();
		try {
			resultSet = statement.executeQuery(sqlScript);
			resultSet.next();
		} catch (final SQLException e) {
			System.out.println("Error creating "
					+ "ResultSet in getNextRoom WorkerDAO");
			e.printStackTrace();
		}
		short lastRoom = -1;
		try {
			lastRoom = resultSet.getShort("LastRoom");
		} catch (final SQLException e) {
			System.out.println("Error. Problem getting next free room.");
			e.printStackTrace();
		}
		if (lastRoom % 10 == 3) {
			final Integer nextRoom = lastRoom + 98;
			return Short.parseShort(nextRoom.toString());
		}
		else {
			final Integer nextRoom = lastRoom + 1;
			return Short.parseShort(nextRoom.toString());
		}
	}
	
	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for inserting a new worker into the worker table in the Database <br/>
	 *
	 * @return void
	 * 
	 */
	public void insertWorker(Worker worker) {
		
		// Create a new connection to the database
		connection = DataConnection.createConnection();
		final String insertSqlStatement = sqlScripts.getInsert();
		try {
			// Prepare a statement object using the connection for provided worker room
			preparedStatement = connection.prepareStatement(insertSqlStatement);		
			preparedStatement.setShort(1, worker.getRoom());
			preparedStatement.setString(2, worker.getName());
			byte profession = Byte.parseByte(worker.getProfession());
			preparedStatement.setByte(3, profession);
			byte endurance = Byte.parseByte(worker.getEndurance());
			preparedStatement.setByte(4, endurance);
			preparedStatement.setLong(5, worker.getCost());
			
			preparedStatement.executeUpdate();
			connection.close();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * <br/>
	 * * METHOD DESCRIPTION: <br/>
	 * This method updates a worker in the worker table in the database <br/>
	 *
	 * @param A worker that need to be updated
	 * @return void
	 */
	public void updateWorker(Worker worker) {

		// Create a new connection to the database
		connection = DataConnection.createConnection();
		final String updateSqlStatement = sqlScripts.getUpdateWorker();
		try {
			// Prepare a statement object using the connection for provided worker room
			preparedStatement = connection.prepareStatement(updateSqlStatement);
			preparedStatement.setString(1, worker.getName());
			byte profession = Byte.parseByte(worker.getProfession());
			preparedStatement.setByte(2, profession);
			byte endurance = Byte.parseByte(worker.getEndurance());
			preparedStatement.setByte(3, endurance);
			preparedStatement.setLong(4, worker.getCost());
			preparedStatement.setShort(5, worker.getRoom());
			
			preparedStatement.executeUpdate();
			connection.close();
		} catch (final SQLException e) {
			System.out.println("Error with preparedStatement: " + e);
			e.printStackTrace();
		}
	}
	
	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for displaying all the workers in the worker Table in the Database <br/>
	 *
	 * PSEUDOCODE: <br/>
	 * Create a new connection to the database. <br/>
	 * Prepare a statement object using the connection that gets all the workers
	 * from the worker table. <br/>
	 * Execute the SQL statement and keep a reference to the result set.<br/>
	 * Return the ArrayList to the calling method. <br/>
	 *
	 * @return All of the worker's names
	 * 
	 */
	public ArrayList<String> getWorkerNames() {

		Statement statement = null;

		connection = DataConnection.createConnection();

		try {
			statement = connection.createStatement();
		} catch (final SQLException e) {
			System.out.println("Error. Can not create the statement: " + e);
			e.printStackTrace();
		}

		final String sqlScript = sqlScripts.getWorkerNameList();
		try {
			resultSet = statement.executeQuery(sqlScript);
		} catch (final SQLException e) {
			System.out.println("Error. Problem with executeQuery: " + e);
		}

		// Now we collect the data from the result in order to display them in
		// the Java Server Page

		ArrayList<String> namesList = new ArrayList<String>();
		try {
			while (resultSet.next()) {
				String name = resultSet.getString("name");
				namesList.add(name);
			}
		} catch (final SQLException e) {
			System.out.println("Error. Problem reading data: " + e);
		}
		try {
			DataConnection.closeConnection();
		} catch (final SQLException e) {
			System.out.println("Error. Problem with closing connection: " + e);
		}
		return namesList;
	}

	/**
	 * <br/>
	 * METHOD DESCRIPTION: <br/>
	 * DAO for displaying all the workers in the worker Table in the Database <br/>
	 *
	 * PSEUDOCODE: <br/>
	 * Create a new connection to the database. <br/>
	 * Prepare a statement object using the connection that gets all the workers
	 * from the worker table. <br/>
	 * Execute the SQL statement and keep a reference to the result set.<br/>
	 * Return the ArrayList to the calling method. <br/>
	 *
	 * @return Collection of Events
	 *
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *
	 */
	public Worker getWorker(short room) {

		connection = DataConnection.createConnection();
		final String searchString = "SELECT * FROM workers WHERE room=?;";
		Worker worker = new Worker();
		try {
			preparedStatement = connection.prepareStatement(searchString);
			preparedStatement.setShort(1, room);
			resultSet = preparedStatement.executeQuery();

			// Now we collect the data from the result in order to display them in
			// the Java Server Page

			while (resultSet.next()) {
				worker.setRoom(room);

				String name = resultSet.getString("name");
				worker.setName(name);

				String profession = resultSet.getString("profession");
				worker.setProfession(profession);

				String endurance = resultSet.getString("endurance");
				worker.setEndurance(endurance);

				long cost = resultSet.getLong("cost");
				worker.setCost(cost);
			}
			DataConnection.closeConnection();
		} catch (final SQLException exception) {
			System.out.println(exception.getMessage());
		}
		return worker;
	}
}
