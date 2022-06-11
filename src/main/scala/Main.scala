import user.User;
import user.HairColor;
import data.TestingData;

@main def main = {
  println("In the main funciton");
  val n = new User(27, "Vic", "P", HairColor.Brown, List("Ringo"));
  println("User ID: " + n.getUserID());

  println("Calling function");
  val data = TestingData.generateUserData(1);
//   println(data);

}
