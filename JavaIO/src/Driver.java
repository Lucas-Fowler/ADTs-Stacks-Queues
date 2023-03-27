import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Arrays;


public class Driver {
	
	public static void toString(boolean[][] stuf) {
		for (int row = 0; row < stuf.length; row++) {
			System.out.println(Arrays.toString(stuf[row]));
		}
	}
	
	public static void getAverageInt() {
		//average for ints.txt
				int sum = 0;
				//count is the # of elements in the text file, we divide by this to get the average
				double count = 0;
				try {
				      File myObj = new File("ints.txt");
				      Scanner myReader = new Scanner(myObj);  
				      while (myReader.hasNextLine()) {
				    	  //reading the next line in the file
				        String data = myReader.nextLine();
				        //convert the text file String to an integer to add to the sum
				        sum += Integer.parseInt(data);
				        count++;
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    } 
				//return average as a double by dividing an int by a double
				System.out.println("Average of ints in ints.txt is: " + (sum / count));
				System.out.println();
	}
	
	public static void getAverageStringDouble() {
		//average for "stringDouble.txt
				double newsum = 0;
				//num is the # of doubles in this text file, we divide by this number to find the average
				int count = 0;
				try {
				      File myObj = new File("stringDouble.txt");
				      Scanner myReader = new Scanner(myObj);  
				      //while the file has another line below, continue
				      while (myReader.hasNextLine()) {
				        String data = myReader.nextLine();
				        //find the substring of the space because thats what separates the doubles from the strings in this file
				        newsum += Double.parseDouble(data.substring(data.indexOf(" ")+1));
				        count++;
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    } 
				System.out.println("Average of doubles in this file is: " + (newsum / count));
				System.out.println();
	}
	
	public static void getAverageBoolean() {
		//return a boolean array representing this text file of values of 0 and 1 and expressing them as true or false
				boolean[][] stuff = new boolean[8][9];
				int index = 0;
				try {
				      File myObj = new File("boolean (1).txt");
				      Scanner myReader = new Scanner(myObj);  
				      //while the file has another line below, continue
				      while (myReader.hasNextLine()) {
				        String data = myReader.nextLine();
				        //find the substring of the space because thats what separates the doubles from the strings in this file
				        for (int col = 0; col < data.length()-1; col++) {
				        	if (data.substring(col,col+1).equals("1")) {
				        		stuff[index][col] = true;
				        	} else {
				        		stuff[index][col] = false;
				        	}
				        }
				        index++;
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    } 
				System.out.println("boolean.txt stored as a 2D array of booleans: ");
				toString(stuff);
				System.out.println();
	}
	
	public static void getAverageFirstAndLast() {
		//returns the average of the first column of integers
				int count= 0;
				double firstCol = 0; 
				double lastCol = 0;
				try {
				      File myObj = new File("intStringDouble.txt");
				      Scanner myReader = new Scanner(myObj);  
				      while (myReader.hasNextLine()) {
				        String data = myReader.nextLine();
				        firstCol += Double.parseDouble(data.substring(0, 1));
				        lastCol += Double.parseDouble(data.substring(data.indexOf(" ", 2)));
				        count++;
				      }
				      myReader.close();
				    } catch (FileNotFoundException e) {
				      System.out.println("An error occurred.");
				      e.printStackTrace();
				    } 
				System.out.println("Average of the first column: " + (firstCol/count));
				System.out.println("Average of the last column: " + (lastCol/count));
	}
	
	public static void numFemaleBabies() {
		int num = 0;
		try {
		      File myObj = new File("Popular_Baby_Names.csv");
		      Scanner myReader = new Scanner(myObj);  
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        if (data.contains("FEMALE")) {
		        	num++;
		        }
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    } 
		System.out.println("Number of female babies: " + num);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getAverageInt();
		getAverageStringDouble();
		getAverageBoolean();
		getAverageFirstAndLast();
		numFemaleBabies();
	}	
		
}
