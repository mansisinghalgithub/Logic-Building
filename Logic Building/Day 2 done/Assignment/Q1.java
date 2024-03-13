class Room
{
float height=5.5f;
float width=1.5f;
float breadth=5.5f;
float volume;


float calculateVolume()
{
volume=height*width*breadth;
return volume;
}

public static void main(String args[])
{
Room obj=new Room();
float volume=obj.calculateVolume();
System.out.println(volume);

}
}