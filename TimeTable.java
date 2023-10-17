import java. util. Scanner;
class SC1
{
public void Switch(String s)
{
switch (s)
case "Monday":
System.out.print ("Monday: \n9-10am: DBMS \n10-11am: 00C");
break；
｝
case. "Tuesday":
System.out. print("Tuesday: \n9-10am: DAST n10-11am: 00L");
breaK；
｝
case
"Wednesday":
System.out. print ("Wednesday: \n9-10am: AM Nn10-11am: DS"):
break；
}
case "Thursday"
{
System.out. print (Thursday: \n9-10am: 00C An10-11am: AM"); break;
case "Friday":
{
System.out.print Friday: \n9-10am: DS \n10-11am: DAST"): break;
}
{
case "Saturday":
System.out. print ("Saturday: \n9-10am: DBSM"); break;
case
{
"Sunday":
System.out.println("==HOLIDAY=="); break;
}
case "Thursday":
System.out.print ("Thursday: \n9-10am: 00C An10-11am: AM"); break;
｝
Case
"Friday":
System.out. print("Friday: \n9-10am: DS An10-11am: DAST"); break;
}
case. "Saturday":
{
System.out.print ("Saturday: \n9-10am: DBSM"); break;
}
case
"Sunday":
System.out.printtn（"==HOLIDAY=="）：
break;
}
default:
{
System.out.print ("Enter a valid day:");
break;
public class TimeTable
public static void main(String args])
System,out.print("Enter day:");
Scanner sc=new Scanner(System.in);
String s=sc.next();
SC1 sd=new SC1();
sd. Switch (s);
sc. close():