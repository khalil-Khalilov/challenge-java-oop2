public class Car extends Vehicle{

  //constructor
  public Car(String brand){
    super(brand);
  }

  //methodes
  @Override
  public String doStuff(){
    return "Je suis " + getBrand() + " et je fais vroum vroum !";
  }
}
