public abstract class Vehicle {

  
  private String brand;
  private int kilometers;

  public Vehicle(String brand){
    this.brand = brand;
    this.kilometers = 0;
  }

  //getters
  public String getBrand(){
    return this.brand;
  }

  public int getKilometers(){
    return this.kilometers;
  }

  //setters
  public void setBrand(String brand){
    this.brand = brand;
  } 

  public void setKilometers(int kilometers){
    this.kilometers = kilometers;
  }

  //methodes
  public abstract String doStuff();
}
