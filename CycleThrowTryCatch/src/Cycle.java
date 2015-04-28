/**
Requirements: 
	Revisit the Cycle class in Unit 3.10.1.  
	Modify your application such that the properties, 
	numberOfWheels and weight are entered as double values interactively (at the keyboard).  
	Exception handling will be used to determine whether a type mismatch occurs.  
	Edit your application such that, in addition to 
	[A], the values for numberOfWheels and weight, entered interactively, 
	will throw a new exception “Values cannot be less than or equal to zero” only If the values are less than or equal to zero.  
	Add or use the appropriate try and/or catch blocks. 

Directions
	Examine your application for the class called Cycle
	Add Try and Catch blocks appropriately
	Add the throw statement for the new exception
	Display an appropriate message if an exception occurs.
	Display the properties of the object
	Document each statement concisely.
	Post your Java source code file and output text file in Blackboard using the Assignment Upload area below.
 */
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Cycle {
	static double numberOfWheels; // initialize values
	static double weight;	
	
	public Cycle(double numberOfWheels,  double weight) { //constructor
		this.numberOfWheels=numberOfWheels;
		this.weight=weight;
	}
	
	public String toString() { // to string
		return "Cycle [numberOfWheels=" + numberOfWheels + ", weight=" + weight + "]";
	}

	public static void main(String[] args) throws ValueMismatch {
		// TODO Auto-generated method stub	
		JTextField NumberOfWheels = new JTextField(10); // Jpanel and Jtextfield set up
		JTextField Weight = new JTextField(10); 
		JLabel label = new JLabel("Enter integer Number of Wheels and Weight.");
		JPanel panel = new JPanel();

		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); // panel layout
		panel.add(label);
		panel.add(NumberOfWheels);
		panel.add(Weight);
		
		JOptionPane.showMessageDialog(null, panel); //prompt user to enter the number of wheels and weight
		
		try { //try catch methods
			setData(NumberOfWheels.getText(),Weight.getText());
			}
		catch(Exception ValueMismatch) {
			throw new ValueMismatch("Values cannot be less than or equal to zero");
		}
		
		Cycle c = new Cycle(numberOfWheels, weight); // new cycle
		System.out.println(c.toString());
	}
	
	public static void setData(String NumberOfWheels, String Weight) throws ValueMismatch {
				numberOfWheels = Double.parseDouble(NumberOfWheels); // sets values
				weight = Double.parseDouble(Weight);
				
				if (numberOfWheels<=0 || weight<=0) //throw when the value <= 0
					throw new ValueMismatch("Values cannot be less than or equal to zero");
				}			
			
		}