class Vehicle
{
  //using constructor
  Vehicle(String brand,int cost)
  {
   System.out.println("Brand:"+brand+"Cost:"+cost);
  }
  Vehicle(String brand)
   {
    System.out.println("Brand:"+brand);
   }
   public static void main(String[] args)
   {
    Vehicle v1=new Vehicle("Audi",70000);
    Vehicle v2=new Vehickr("KIA");
   }
  
}
