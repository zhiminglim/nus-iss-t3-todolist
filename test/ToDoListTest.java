import java.util.Collection;

import org.junit.*;
import org.junit.Test;
import junit.framework.*;


public class ToDoListTest extends TestCase{
	// Define Test Fixtures
	private Task t1, t2;
	private ToDoList toDoList;
	private Collection<Task> toDoListCollection;
	
	public ToDoListTest() {
		super();
	}
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
		t1 = new Task("Finish ToDoListTest", false);
		t2 = new Task("Buy lamborghini", true);
		
		toDoList = new ToDoList();
	}

	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {		
		toDoList.addTask(t1);
		toDoListCollection = toDoList.getAllTasks();
		assertFalse(toDoListCollection.isEmpty());
	}
	
	@Test
	public void testgetNotCompletedStatus() {		
		toDoList.addTask(t1);
		assertFalse(toDoList.getStatus(t1.getDescription()));
	}
	
	@Test
	public void testgetIsCompletedStatus() {		
		toDoList.addTask(t2);
		assertTrue(toDoList.getStatus(t2.getDescription()));
	}
	
	@Test
	public void testRemoveTask() {
		toDoList.addTask(t1);
		toDoListCollection = toDoList.getAllTasks();
		assertFalse(toDoListCollection.isEmpty());
		
		toDoList.removeTask(t1.getDescription());
		toDoListCollection = toDoList.getAllTasks();
		assertTrue(toDoListCollection.isEmpty());
	}

	@Test
	public void testGetCompletedTasks() {
		//fail("Not implemented yet");
	}
}
