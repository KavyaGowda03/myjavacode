class Vehicle
{
  //using constructor
  Vehicle(String brand,int cost)
  {
   System.out.println("Brand:"+brand+"Cost:"+cost);
  }
   public static void main(String[] args)
   {
    Vehicle v1=new Vehicle("Audi",70000);
   }
  
}
