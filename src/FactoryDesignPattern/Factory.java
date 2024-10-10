package FactoryDesignPattern;

class LaptopFactory{  
    public Laptop getLaptop(String laptop){  
            if(laptop == null){  
             return null;  
            }  
          if(laptop.equalsIgnoreCase("HP")) {  
                 return new HP();  
               }   
           else if(laptop.equalsIgnoreCase("Lenovo")){  
                return new Lenovo();  
            }   
          else if(laptop.equalsIgnoreCase("Dell")) {  
                return new Dell();  
          }  
      return null;  
   }  
}