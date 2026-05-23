/*Task -> Student List Manager*/
import java.util.ArrayList;
import java.util.Scanner;
public class Student{
	private int id;
	private String name;
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	public void setId(int id){
		this.id = id;
	}
	public void setName(String name){
		this.name = name;
	}
	public int getInt(){
		return id;
	}
	public String getName(){
		return name;
	}
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<>();
	}
}