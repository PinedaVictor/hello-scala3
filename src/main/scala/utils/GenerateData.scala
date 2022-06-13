package data;
import scala.util.Random;
import scala.StringBuilder
import user.User
import scala.collection.mutable

object TestingData {

  val random = new Random();

  def generateUserData(numberOfUsers: Int) = {
    var i = 1;
    for i <- i to numberOfUsers
    yield new User(
      random.nextInt(121) + 1,
      generateString(5),
      generateString(7),
      user.HairColor.Brown,
      List("Ringo", "Marty")
    )
  }

  def generateUser() = {
    new User(
      97,
      "John",
      "Conner",
      user.HairColor.Brown,
      List("Ringo", "Marty")
    )
  }

  def generateString(length: Int) = {
    val alphabet = "abcdefghijklmnopqrstuvwxyz";
    var strBuild = new mutable.StringBuilder();
    var i = 0;
    while i < length do {
      val index = random.between(1, alphabet.length);
      strBuild.append(alphabet.charAt(index));
      i += 1;
    }
    strBuild.toString();
  }

}
