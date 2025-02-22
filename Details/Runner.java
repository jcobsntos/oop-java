package week5;

//JACOB S. SANTOS BSCOE 2-1
public class Runner{
	public static void main(String[] args) {
		
		Ferson jacob = new Ferson("Jacob", "Tondo, Manila", 19, 'M', "Painting", "INFJ");
		
		System.out.println("Encapsulation \"get\" \n"  + jacob.getName());
		
		System.out.println(jacob.getAddress());
		System.out.println(jacob.getAge());
		System.out.println(jacob.getSex());
		System.out.println(jacob.getHobby());
		System.out.println(jacob.getPersonalityType());
		
		jacob.setName("Hakob");
		jacob.setAddress("Manila, Philippines");
		jacob.setAge(19);
		jacob.setSex('M');
		jacob.setHobby("Reading");
		jacob.setPersonalityType("INTP");
		System.out.println("\nEncapsulation \"set\" \n" + jacob.getName());
		System.out.println(jacob.getAddress());
		System.out.println(jacob.getAge());
		System.out.println(jacob.getSex());
		System.out.println(jacob.getHobby());
		System.out.println(jacob.getPersonalityType());
	
	}

}