import user.User;
import user.HairColor;
import data.TestingData;

import org.apache.spark


@main def main = {
  println("In the main funciton");
  println("Calling function");
  val oneUser = TestingData.generateUser();
  println(oneUser.getFullName());
  val multipleUsers = TestingData.generateUserData(12);
  println("Number of users: " + multipleUsers.length);

  for i <- multipleUsers yield println(s"${i.getAge()} ${i.getFullName()} ${i.getUserID()}");


}
