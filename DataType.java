class DataType
{
public static void main(String[] ar)
{
double d=3.2;
int x=34;
short y=7890;
byte z=4;
float f=4.980f;
long l=1234556789900l;

/*  x=x+d; 
* DataType.java:7: error: incompatible types: possible lossy convere to int
x=x+d;
   ^
1 error

y=y+x;

DataType.java:18: error: incompatible types: possible lossy conversion from int
to short
y=y+x;
   ^
1 error
*/




System.out.println(y);
}
}