public class IntToHex
{

public static String hexHelper(int i)
{
  if(i == 10)
    return "a";
  else if(i == 11)
    return "b";
  else if(i == 12)
    return "c";
  else if(i == 13)
    return "d";
  else if(i == 14)
    return "e";
  else if(i == 15)
    return "f";
  else 
    return "" + i;
}

// mod then divide
public static String toHex(int i)
{
  boolean flag = false;
  if(i < 16)
    flag = true; 
  String result = "";
  while(i / 16 != 0){
  result = hexHelper(i % 16) + result;
  i = i / 16;
  }
  result = hexHelper(i % 16) + result;
  if(flag)
    return "0" + result;
  else
    return result;
}

public static void main(String[] args) 
{
  for(int i = 0x00; i < 15*16 + 15 + 1; i++)
    System.out.print("grep Cheyenne " + toHex(i) + "/* >> newfile ");
  return;
}

}
