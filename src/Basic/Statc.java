package Basic;

class Friend {

	String name;
	static int numberOfFriends;
	
	Friend(String name){
		this.name=name;
		numberOfFriends++;
	}	
}

public class Statc {
	public static void main(String[] args) {		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static memberfff		
		Friend friend1 = new Friend("Sponegbob");
		Friend friend2 = new Friend("Patrick");
		Friend friend3 = new Friend("MrCrabs");
		
		System.out.println(Friend.numberOfFriends);
		System.out.println(friend1.name);
		System.out.println(friend2.name);
		System.out.println(friend3.name);
    }
}   // when we use the static keyword, the numberoffriends becomes common to all three objects
	// if we haven't use the static, keyword numberoffriends would remain different for each object created. Hence we cannot add numberoffriends for each objects created togeter
    // same static keyword is used in the math.max and math.min methods for example. Here, the name of the classes Maths.
    // to use static members we directly use the name of the Class itself
