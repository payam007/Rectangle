import javax.swing.JOptionPane;
public class Rectangle{

	public static void main(String[] args){
	
		String areaString = JOptionPane.showInputDialog("Enter Lenght: ");
		
				double length = Double.parseDouble(areaString);
		String perimeterString = JOptionPane.showInputDialog("Enter Width: ");
				double width = Double.parseDouble(perimeterString);

				double area, perimeter;
				area = (length * width);
				perimeter = 2 * (length + width);
				
				JOptionPane.showMessageDialog(null, area + "is the Area of the Rectangle is\n" + perimeter + "is the Perimeter of the Rectangle");
 
			System.exit(0);
	}
}
			