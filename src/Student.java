public class Student {
  int rating;
  private String name;
  static double ratingSum;
  static int count;

  // TODO implement Student class according to the instructions provided in the README.md file

  public Student(String name) {
    this.name = name;    //TODO initialize name
    count ++;
  }

  public static double getAvgRating() {
    if(count == 0) {
      return 0;
    } else {
      return ratingSum / count;        // TODO return average rating of all students
    }
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;  // TODO set student's name
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;  // TODO initialize rating;
    ratingSum += rating;
  }

  public boolean betterStudent(Student student) {
    return rating >= student.getRating();  // TODO return the result of comparing this.student's rating with the student's rating
  }

  public void changeRating(int rating) {
   ratingSum -= this.getRating();
   this.rating = rating;
   ratingSum += this.getRating(); // TODO change this student's rating and average rating of all students
  }

  public static void removeStudent(Student student) {
    ratingSum -= student.getRating();  // TODO remove student
    count --;
  }

  @Override
  public String toString() {
    return String.format("Student: %s, Rating: %d", this.name, this.rating);
    // TODO return String with name and rating of this student
    return "";
  }
  public static void main(String[] args) {

  }
}
