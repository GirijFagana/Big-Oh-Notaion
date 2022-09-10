
class Person extends vehicle
{
     String name;
     String vehicle1;
     String Vehicle2;
    void setDetails(String Name,String vehicle1,String vehicle2)
    {
       this.name=Name;
       this.vehicle1=vehicle1;
       this.Vehicle2=vehicle2;
    }
    void getDetails()
    {
        System.out.println(name+" has Two vehicle one is "+vehicle1+" and another is "+Vehicle2 );
    }

    public static void main(String[] args)
    {
       Person p = new Person();
       p.setDetails("Sourabh","Honda Accord car","Ducati Bike");
       p.getDetails();
       

       vehicle h = new vehicle();
       h.setDetail(p.vehicle1,"diesel","new","made in india");
       h.getDetail();

        vehicle d = new vehicle();
       d.setDetail(p.Vehicle2, "petrol", "used", "imported");
       d.getDetail();

}
}


class vehicle
 {
     String vehicle;
     String fuel;
     String status;
     String meded;
     void setDetail(String vehicle1,String Fuel,String uses,String madein)
     {
         this.vehicle=vehicle1;
         this.fuel=Fuel;
         this.status= uses;
         this.meded=  madein;
     }
   
     void  getDetail()
       {
           System.out.println(vehicle+" runs on fuel called "+fuel);
           System.out.println(vehicle+" is "+status+" and "+meded);
       }
   }
   


