package data;
import scala.util.Random;

object GenerateString {}

object TestingData {
  val random = new Random;
// TODO: We need random age Int 1 - 120
//          first name String,
//          last name String,
//          hairColor Ing 1- 5
//          pets list[String]
  def generateUserData(numberOfUsers: Int) = {
    var i = 1;
    for i <- 1 to numberOfUsers do println("Creating user: " + i)
  }
}
