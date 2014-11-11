public class Student {

    //instance variables
    //these are the properties of a student

    	private String name;
    
	//turn this into an array
    	private int test[]= new int[3];
        


 //constructor methods - 3 ways you can make a student
        public Student(){
            this("",0,0,0);
        }
        public Student(String nm, int t1, int t2, int t3){
            name = nm;
            test[0] = t1;
            test[1] = t2;
            test[2] = t3;
        }

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
    public int getHighscore() {
    	if (test[0] > test[1] && test[0] > test[2]) {
    		return test[0];
    	}
    	else if (test[1] > test[0] && test[1] > test[2]){
    		return test[1];

    	} else {
    		return test[2];
    	}
    }
    public String toString(){
        //prints the details of student when it is printed
        String result = "Name: " + name;
    	result += "\nMark 1:\t" + test[0];
    	result += "\nMark 2:\t" + test[1];
    	result += "\nMark 3:\t" + test[2];
    	result += "\n~~~~~~~~~~~~~~~~~~";
    	result += "\nAverage:\t" + getAverage();
    	return result;
    }
    public String validateData(){
        String emessage = null;
    	
    	if (name.equals("")) 
    		emessage += "\nName is required\nPlease re-enter all data";
    	
	if (test[0] < 0 || test[0] > 100 || test[1] < 0 || test[1] > 100 || test[2] < 0 || test[2] > 100) 
    		emessage += "\nAtleast one mark is unexceptable,  please re-enter all the data";
	return emessage;
    	}
}