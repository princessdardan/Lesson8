public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
    
	//turn this into an array///////////////
    	private int test[]= new int[3];
        


 //constructor methods - 3 ways you can make a student


	//Additonal Constructor
	public Student(String nm, int t[]){
            name = nm;
            test = t;
		
	}

	//Another constructor
	public Student(Student s) {
		this(s.name, s.test);
	}

    /*
    other methods
    these give our object more abilities
    */


    public void setName(String nm) {
    	name = nm;
    }
    public String getName()
    {
        return name;
    }
    public void setScore(int i, int score){
        test[i-1]= score;
    }
    public int getScore(int i){
        return test[i-1];
    }
    public int getAverage() {
    	int average;
        average = (test[0] + test[1] + test[2])/3;
        return average;
    }
    public String toString(){
        //prints the details of student when it is printed
        String str;
        str = "Name:\t\t" + name + "\n";
        str+= ""+ getAverage();
        return str;
    }
    public String validateData(){
        String errormessage = null;
    if(name.length()<2)
        errormessage = "Name is required\n";
    if (test[0]<0|| test[0]>100|| test[1]<0 || test[1]>100 || test[2]<0|| test[2]>100)
        errormessage += ("At least one mark is not within acceptable range.");    
    if(errormessage != null)
        errormessage += ("\n Please re-enter all data. ");
    return errormessage;
    }
}