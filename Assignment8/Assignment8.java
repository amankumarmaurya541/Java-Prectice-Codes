package Assignment8;

public class Assignment8 {
    public static void main(String[] args) {
        Patient p = new Patient("Shubham Maurya", 17);
        System.out.println("----------------------Before Admit Status----------------------");
        p.printStatus();
        p.admitPatient("Dengue", 6);
        System.out.println("----------------------After Admit Status----------------------");
        p.printStatus();
        p.dischargePatient();
        System.out.println("----------------------After Discharge Status----------------------");
        p.printStatus();

    }
}
class Patient{
    private String patientName;
    private int age;
    private String disease;
    private int roomNumber;
    private Boolean isAdmitted;

    Patient(String patientName , int age){
        this.patientName = patientName;
        if(age >= 0 && age <= 120){
            this.age = age;
        }else {
            System.out.println("Invalid Age");
        }
        this.disease = "None";
        this.roomNumber = 0;
        this.isAdmitted = false;

    }
    public String getPatientName(){
        return patientName;
    }
    public int getAge() {
        return age;
    }
    public String getDisease(){
        return disease;
    }
    public int getRoomNumber(){
        return roomNumber;
    }
    public Boolean getIsAdmitted(){
        return isAdmitted;
    }
    public void setAge(int age){
        if(age >= 0 && age <= 120){
            this.age = age;
        }else {
            System.out.println("Invalid Age");
        }
    }
    public void setDisease(String disease){
        if (!disease.isEmpty()){
            this.disease = disease;
        }else {
            System.out.println("Patient have no disease");
        }

    }
    public void setRoomNumber(int roomNumber){
        if (isAdmitted ){
            this.roomNumber = roomNumber;
        }else {
            System.out.println("Patient is not Admit");
        }
    }
    public void admitPatient(String disease, int roomNumber){
        isAdmitted = true;
        setDisease(disease);
        setRoomNumber(roomNumber);

    }
    public void  dischargePatient(){
        isAdmitted = false;
        roomNumber = 0;

    }

    public void printStatus(){
        System.out.println("Patient Name: " + getPatientName());
        System.out.println("Age: " + getAge());
        System.out.println("disease: " + getDisease());
        System.out.println("Room Number: " + getRoomNumber());
        System.out.println("Admitted     : " + isAdmitted);
    }
}