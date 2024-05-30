package chapter3;

public class HeartRate{
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private int yearOfBirth;

    public HeartRate (String firstName, String lastName, String dateOfBirth, int yearOfBirth){

        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.yearOfBirth = yearOfBirth; }

    public void setFirstName(String firstName){
        this.firstName = firstName; }

    public void setLastName(String lastName){
        this.lastName = lastName; }

    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth; }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth; }


    public String getFirstName(){
        return firstName; }

    public String getLastName(){
        return lastName; }

    public String getDateOfBirth(){
        return dateOfBirth; }

    public int getYearOfBirth(){
        return yearOfBirth; }

    public int getAgeInYears(){
        int ageInYears = 2024 - getYearOfBirth();
        return ageInYears; }

    public int getMaxHeartRate(){
        int maxHeartRate = 220 - getAgeInYears();
        return maxHeartRate; }

    public double getMinTargetHeartRate(){
        double minTargetHeartRate = (double) 0.5 * getMaxHeartRate();
        return minTargetHeartRate; }

    public double getMaxTargetHeartRate(){
        double maxTargetHeartRate = (double) 0.85 * getMaxHeartRate();
        return maxTargetHeartRate; }

}
