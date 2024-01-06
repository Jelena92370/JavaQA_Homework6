public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private double rating;
    private int uniqueIdentifier;


    public Student(String firstName, String lastName, int age, double rating, int uniqueIdentifier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.rating = rating;
        this.uniqueIdentifier = uniqueIdentifier;
    }

    public String getFirstNameAndLastName() {
        return firstName + " " + lastName;
    }

    public int getUniqueIdentifier() {
        return uniqueIdentifier;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + getFirstNameAndLastName() + '\'' +
                ", age=" + age +
                ", rating=" + rating +
                ", uniqueIdentifier=" + uniqueIdentifier +
                '}';
    }



}


