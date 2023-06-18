public class User {

 private int id;
 private String firstName;
 private String lastName;
 private int age;

 public int getId() {
  return id;
 }

 public String getFirstName() {
  return firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public int getAge() {
  return age;
 }

 public User(int id, String firstName, String lastName, int age) {
  this.id = id;
  this.firstName = firstName;
  this.lastName = lastName;
  this.age = age;
 }

}
