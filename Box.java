  class Box {
    double width;
    double height;
    double breath;

    double Area(){
        double a;
          a = (height*width+height*breath+width*breath)*2;
          return a;
    }
    
    double volume (){
        double v;
        v=(height*width*breath);
        return v;
    }
}

class multiclass {
    public static void main(String [] args ){
        Box Lav = new Box();
        circle kar = new circle();
        kar.k=1.2;
        kar.l=3.4;
        kar.r=8.1;
        Lav.height=1.23;
        Lav.width=2.34;
        Lav.breath=3.45;
        System.out.println("The circumference value is : " + kar.circumfrence());
        System.out.println("The area value is : "+ kar.radius());
        System.out.println("The area of the box is :"+ Lav.Area());
        System.out.println("The volume of the Box is :"+Lav.volume());
    }

}