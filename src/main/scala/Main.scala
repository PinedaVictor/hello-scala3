import user.User;
import user.HairColor;
import data.TestingData;

@main def main = {
  println("In the main funciton");
  println("Calling function");
  val oneUser = TestingData.generateUser();
  println(oneUser.getFullName());
  val multipleUsers = TestingData.generateUserData(100);
  println("Number of users: " + multipleUsers.length);

  for i <- multipleUsers yield println(s"${i.getAge()} ${i.getFullName()} ${i.getUserID()}");


}
