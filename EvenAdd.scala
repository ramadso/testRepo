class Adding(p:Int,q:Int){
var start:Int =p;
var end:Int =q;
def sumonlyeven(){
var x =0;
while(start < end){
if(start%2==0){
x = x + start;
start = start +1;
}
else{
start = start+1;
}
}
println("The sum of even numbers is:" + x);
}
}
object EvenAdd{
def main(args: Array[String]){
println("Enter the start number:");
var s = Console.readInt;
println("Enter the end number:");
var e = Console.readInt;
var a = new Adding(s,e);
a.sumonlyeven();
}
}
