/* Aim:- Practical No.5
   Author:- Sharayu Kadu
   Version:- 5.0
   Date:- 5 Feb 2024
*/

// Parent class
class Emerging_Technologie {
    String president;
    String vicePresident;
    String secretary;
    String treasurer;


    // Constructor
    Emerging_Technologie(String president, String vicePresident, String secretary, String treasurer) {
        this.president = president;
        this.vicePresident = vicePresident;
        this.secretary = secretary;
        this.treasurer = treasurer;
    }


    // Forum method
    void forum() {
        System.out.println("This is a forum for Emerging Technologies.");
    }
}


// Child class 1
class AIML extends Emerging_Technologie {
    AIML(String president, String vicePresident, String secretary, String treasurer) {
        super(president, vicePresident, secretary, treasurer);
    }


    @Override
    void forum() {
        System.out.println("Details of AIML (Artificial Intelligence and Machine Learning)");
        System.out.println("President: " + president);
        System.out.println("Vice President: " + vicePresident);
        System.out.println("Secretary: " + secretary);
        System.out.println("Treasurer: " + treasurer);
    }
}


// Child class 2
class AIDS extends Emerging_Technologie {
    AIDS(String president, String vicePresident, String secretary, String treasurer) {
        super(president, vicePresident, secretary, treasurer);
    }


    @Override
    void forum() {
        System.out.println("Details of  AIDS (Artificial Intelligence and Data Science)");
        System.out.println("President: " + president);
        System.out.println("Vice President: " + vicePresident);
        System.out.println("Secretary: " + secretary);
        System.out.println("Treasurer: " + treasurer);
    }
}


// Child class 3
class CSE extends Emerging_Technologie {
    CSE(String president, String vicePresident, String secretary, String treasurer) {
        super(president, vicePresident, secretary, treasurer);
    }


    @Override
    void forum() {
        System.out.println("Details of CSE (Computer Science and Engineering).");
        System.out.println("President: " + president);
        System.out.println("Vice President: " + vicePresident);
        System.out.println("Secretary: " + secretary);
        System.out.println("Treasurer: " + treasurer);
    }
}


// Main class
public class PracticalNo5
 {
    public static void main(String[] args) {
        // Creating objects of each child class with different office bearers
        AIML aiml = new AIML("Vedant Kadu", "Vaibhav Bhagwat", "Priyanshu Bawne", "Aditi Kadu");
        AIDS aids = new AIDS("Sharayu Kadu", "Rudrani Chandore", "Trisha Bhelkar", "Divyanka Kapoor");
        CSE cse = new CSE("Gunjan Mohod", "Mansi Harankhede", "Joy Kapoor", "Atharva Shinde");


        // Calling forum method for each child class
        aiml.forum();
        System.out.println();
        aids.forum();
        System.out.println();
        cse.forum();
    }
}


