public class Boat extends Vehicle{
  

  //constructor
  public Boat(String brand){
    super(brand);
  }

  //methodes
  @Override
  public String doStuff(){
    return "Je suis " + getBrand() + " et je fais glou glou !";
  }
}
