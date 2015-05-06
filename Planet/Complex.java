import java.util.*;

public class Complex
{
   private double real;
   private double imaginary;
   double magnitude;
   double argument;
   
   public static int useless=0;
   
   public Complex()
   {
      this(0.0, 0.0);
   }
   
   public Complex(double real, double imaginary)
   {
      this.real=real;
      this.imaginary=imaginary;
   }
   
   public double getReal()
   {
      return real;
   }
   
   public void setReal(double newReal)
   {
      real= newReal;
   }
   
   public double getImaginary()
   {
      return imaginary;
   }
   
   public void setImaginary(double newImag)
   {
      imaginary= newImag;
   }
   
   public double magnitude()
   {
      double mag= Math.sqrt(real*real +imaginary*imaginary);
      return mag;
   }
    
   public void setMag()
   {
      magnitude=Math.sqrt(real*real + imaginary*imaginary);
      
   }
   
   public void setArg()
   {
   
      argument=Math.atan(imaginary/real);
   }
   
   public double argument()
   {
      double arg=Math.atan(imaginary/real);
      return arg;
   }
   //Math.atan
   
   public static Complex sum(Complex y, Complex z)
   {
      double nreal=y.real+z.real;
      double nimag=y.imaginary+z.imaginary;
      Complex n= new Complex(nreal, nimag);
      return n;
   }
   
   public Complex sum(Complex i)//what is wrong with this method
   {
      double nreal=this.real +i.real;
      double nimag=this.imaginary +i.imaginary;
      Complex x = new Complex(nreal, nimag);
      return x;
   }
   public String toString()
   {
      return "real= " + real + " imaginary =  " + imaginary + " magnitude = " + magnitude + " argument= " + argument ; 
   }
   
   public boolean equals(Object other)
   {
      if( other instanceof Complex )
      {
         Complex p = (Complex) other;
         return (Math.abs(real-p.real)<0.01)&& 
                (Math.abs(imaginary-p.imaginary)<0.01 )&&
                (Math.abs(magnitude-p.magnitude)<0.01 )&&
                (Math.abs(argument-p.argument)<0.01);
      }
      return false;
   }      

   
}
