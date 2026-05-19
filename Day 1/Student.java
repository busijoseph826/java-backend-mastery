/*Create a java application with one class called student with constructor, getters/setters and display method*/

public class Student{
	private int id;
	private String name;
	private int marks;
	 
	Student(int id,String name, int marks){
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setMarks(int marks){
		this.marks = marks;
	}
	
	public int getId(){
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public int getMarks(){
		return marks;
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		System.out.println("Enter marks: ");
		int id = sc.nextInt();
		Student s = new Student(id,name,marks);
	}
}