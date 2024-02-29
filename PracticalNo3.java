/* Aim:- Practical No.3
   Author:- Sharayu Kadu
   Version:- 3.0
   Date:- 13 Feb 2024
*/
class Volume
{
    public Double calVolume(Double side)
    {
        return side * side * side;
    }

    public Double calVolume(Double radius,Double height)
    {
        return Math.PI * radius * radius * height;
    }

    public Double calVolume(Double length,Double width,Double height)
    {
        return length * width * height;
    }

}

class PracticalNo3
{
    public static void main(String [] argv)
    {
        Volume cal = new Volume();

        Double cube= cal.calVolume(7.);
        System.out.println("Volume of Cube: "+ cube);
        
        Double cylinder= cal.calVolume(4.8,6.8);
        System.out.println("Volume of Cylinder: "+ cylinder);

        Double box= cal.calVolume(3.0,5.0,3.0);
        System.out.println("Volume of Box: "+ box);
           
       
    }
}