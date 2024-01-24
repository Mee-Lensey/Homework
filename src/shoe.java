import com.sun.org.apache.xerces.internal.impl.xs.identity.UniqueOrKey;

public class shoe {

    public String shoe;
    public String brand;
    public String color;
    public int size;
    public String type;
    public double price;




//this is the constructor method



public shoe(String pShoe, String pBrand,String pColor,int pSize, String pType, double pPrice) {

    brand = pBrand;
    shoe = pShoe;
    color = pColor;
    size = pSize;
    type = pType;
    price = 120;
}

    public void printInfo(){
        System.out.println("shoe");
        System.out.println();
        shoe= new shoe("Tatum 1 ", "Nike","Black+Green", 9,"Basketball Shoes", 120,);




   }









}
