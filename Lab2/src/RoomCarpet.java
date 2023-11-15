
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mason
 */
public class RoomCarpet implements Cloneable  {
    private RoomDimension size;
    private double carpetCost;
    
    public RoomCarpet(RoomDimension dim, double cost){
        super();
        this.size = dim;
        this.carpetCost = cost;
        
    }
    
    public double getTotalCost() {
        return carpetCost * size.getArea();
    }
    
    public String toString(){
        String str = "Total Cost: " + getTotalCost();
        
        return str;
    }
    
    public int costCompareTo(RoomCarpet a) {
        
        if (Double.compare(getTotalCost(), a.getTotalCost()) == 0){
         System.out.println("Equal");
        }
        else if (Double.compare(getTotalCost(), a.getTotalCost()) < 0){
         System.out.println("Smaller");
        }
        else{
         System.out.println("Larger");
        } 
        return Double.compare(getTotalCost(), a.getTotalCost());
    }
        

    @Override
    public Object clone() throws CloneNotSupportedException {
        try 
        {
            return super.clone();
        }   
        catch (CloneNotSupportedException e) 
        {
            throw new Error("Exception in the Clone");
        }
    }


    @Override
    public int hashCode()
   {
      String x = getTotalCost() + "";
       int result = 17;
      result = 37 * result + x.hashCode();
      return result;
      
   }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final RoomCarpet other = (RoomCarpet) obj;
        if (Double.doubleToLongBits(this.carpetCost) != Double.doubleToLongBits(other.carpetCost)) {
            return false;
        }
        return Objects.equals(this.size, other.size);
    }
 
    @Override
    public void finalize(){
        System.out.println("RoomCarpet object #1 has been destroyed");
    }
}
