/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package throwingexception;

/**
 *
 * @author ASUS
 */
public class MathUtils {
    //-------------------------------------------------------------
// Returns the factorial of the argument given
//-------------------------------------------------------------
public static int factorial(int n) throws IllegalArgumentException
{
if(n <0 || n > 16){
throw new IllegalArgumentException("Illegal argument cannot be negative or over 16");
}
int fac = 1;
for (int i=n; i>0; i--)
fac *= i;
return fac;
}
}
