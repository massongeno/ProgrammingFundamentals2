
/**
 *
 * @author Mason
 */

public class RoomDimension implements Cloneable{
    private double length;
    private double width;
    
    public RoomDimension(double length, double width){
        super();
        this.length = length;
        this.width = width;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public double getArea(){
        return length * width;
    }
    
    public RoomDimension getRoomDimension()
   {
      return new RoomDimension(this.length,this.width);
   }
    
    @Override
    public String toString(){
        String str = "Area: " + getArea();
        
        return str;
    }
    
    public boolean equals(RoomDimension obj){
        if (obj == null)
        {    
            return false;
        }    
        if (obj == this)
        {    
            return true;
        }    
        if (getClass() != obj.getClass())
        {    
            return false;
        }    else {
            return false;
        }           
    }
    
    public int sizeCompareTo(RoomDimension a) {
        
        if (Double.compare(length * width, a.length * a.width) == 0){
         System.out.println("Equal");
        }
        else if (Double.compare(length * width, a.length * a.width) < 0){
         System.out.println("Smaller");
        }
        else{
         System.out.println("Larger");
        } 
        return Double.compare(length * width, a.length * a.width);
    }
    
    @Override
    public RoomDimension clone() throws CloneNotSupportedException {
        RoomDimension result = (RoomDimension)super.clone();
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
        final RoomDimension other = (RoomDimension) obj;
        if (Double.doubleToLongBits(this.length) != Double.doubleToLongBits(other.length)) {
            return false;
        }
        return Double.doubleToLongBits(this.width) == Double.doubleToLongBits(other.width);
    }

    @Override
    public int hashCode() {
        int hash = 17;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.length) ^ (Double.doubleToLongBits(this.length)));
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.width) ^ (Double.doubleToLongBits(this.width)));
        return hash;
    } 
}
