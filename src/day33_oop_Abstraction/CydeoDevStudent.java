package day33_oop_Abstraction;

import day32_finalKeyWord.personTask.Person;

import java.awt.desktop.SystemEventListener;
import java.time.LocalDate;

 public final class CydeoDevStudent extends Person {


    private final String id;
    private String batchName;
    private int batchNumber;
    private static final String programmingLanguage;

    static {
        programmingLanguage = "Java";
    }

    public CydeoDevStudent(String name, char gender, LocalDate dob, String id, String batchName, int batchNumber) {
        super(name, gender, dob);
        if(getAge()< 18){
           System.out.println("Cydeo developer student must be 19");
           System.exit(1);
       }

        this.id = id;
       setBatchName(batchName);
       setBatchNumber(batchNumber);
    }

    public String getId() {
        return id;
    }


    public String getBatchName() {
        return batchName;
    }

     public void setBatchName(String batchName) {
         if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni dev")) {
             this.batchName = batchName;
         } else { // otherwise: if the batch name is invalid
             System.err.println("Invalid batch name: " + batchName + " \nNo such a batch at Cydeo");
             System.exit(1);
         }
     }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("Invalid batch number");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

     @Override
     public void eat() {
         System.out.println(getName()+" is eating during the break "+ programmingLanguage);
     }

     @Override
     public void drink() {
         System.out.println(getName()+" is drinking during the break "+programmingLanguage);
     }

     @Override
     public String toString() {
         return getClass().getSimpleName() + "{" +
                 "name='" + getName() + '\'' +
                 ", age=" + getAge() +
                 ", gender=" + getGender() +
                 ", dob=" + getDob() +
                 ", batchName='" + batchName + '\'' +
                 ", batchNumber=" + batchNumber +
                 '}';
     }
 }
