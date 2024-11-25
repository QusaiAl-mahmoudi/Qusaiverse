import java .util.Scanner;
public class FirstSemesterGraduationProject {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your Email : ");
        String Em=in.next();
        System.out.print("Enter your password : ");
        String pass=in.next();
        String em="qusai";
        String pas="3605";
        if (em.equals (Em)){
            if (pas.equals(pass)){
                while(true){
                System.out.print("\n###################################"+
                "#\n\n\t\tWelcome "+
              "\n#Our project offers the following operations :"+
                "\n#   1- About us"+
                "\n#   2- Use the calculators "+
                "\n#   3- calculater the final salary "+
                "\n#   4- Using Mathematical Functions "+
                "\n#   5- Find the largest number "+
                "\n#          between Two numbers "+
                "\n#   6- Find the Largest number "+
                "\n#          Among Three numbers "+
                "\n#   7- Convert Numeric Days "+
                "\n#          to day Namse"+
                "\n#   8- Time Conversions"+
                "\n#   9- Register personal data"+
                "\n#  10- Exit the program "+
               "\n################################" );
                System.out.print("\nEnter number opration you want to execute:   ");
                short ch=in.nextShort();
                switch(ch){
                    case 1:
                    System.out.print(" Name :Qusai Adam Abdullah Almhmoudi \n Department :IT\n group: 4");
                    break;
                    case 2:
                    System.out.print("Enter first number :");
                    int n1=in.nextInt();
                     System.out.print("Eneter the operation : ");
                    char operat=in.next().charAt(0);
                     System.out.print("Enter the secaned number :");
                    int n2=in.nextInt();
                    switch(operat){
                        case '+':
                        System.out.print(n1+"+"+n2+"="+(n1+n2));
                        break;
                        case '-':
                        System.out.print(n1+"-"+n2+"="+(n1-n2));
                        break;
                        case '*' :
                        System.out.print(n1+"*"+n2+"="+(n1*n2));
                        break;
                        case '/':
                        if (n2!=0)
                            System.out.println(n1/n2);
                        else
                        System.out.print("error");
                        break;
                        default:
                        System.out.print("sorry,invalid operation  ");}
                    break;
                    case 3:
                    System.out.print("Enter your Basic salary :");
 double basic_slaray=in.nextInt();
 System.out.print("Enter the number of additional hours :");
 short overtime_hours=in.nextShort();
 System.out.print("Enter the number of days of absence :");
 short adsent_days=in.nextShort();
        //العمليات الحسابيه
 double overtime_par= overtime_hours*1000;//حساب الساعات الاضافية
 double housing_allowance=basic_slaray*(0.25);//حساب بدل السكن ي
 double transportation_allowance=basic_slaray*(0.1);//حساب بدل المواصلات
 double  income_day=basic_slaray/30;//حساب دخل الموظف باليوم
 double  absent=adsent_days*income_day;//حساب الغيابات 
 double Total_salary=basic_slaray+overtime_par+housing_allowance
 +transportation_allowance;// حساب اجمالي الزاتب مع جمع الساعات الاضافية
      //  وبدل السكن وبدل المواصلات
 double tax=Total_salary*0.05;//حساب الضريبة من اجمالي الراتب 
 double Insurance=Total_salary*0.08;//حساب التامين من اجمالي الراتب 
 double Final_Salary=Total_salary-tax-Insurance-absent;//حساب الراتب النهائي
 System.out.println("____________________");
 System.out.print("final Salary :"+
        Final_Salary);
        break;
           case 4:
               System.out.print("1- Math.abs()"+
                    " \n 2- Math.ceil()"+
                    " \n 3- Math.pow()"+
                    " \n 4- Math.max()"+
                    " \n 5- Math.min()"+
                    " \n 6- Math.round()");
                    System.out.print("\nEnter the number of operation ");
                    int op=in.nextInt();
                    switch(op){
                        case 1:
                        System.out .print("Enter number :");
                        int num1=in.nextInt();
                        double abs=Math.abs(num1);
                        System.out .print("abs of number :"+abs);
                        break;
                        case 2:
                        System.out .print("Enter number :");
                        int nu1=in.nextInt();
                        double ceil=Math.ceil(nu1);
                        System.out .print("ceil of number:"+ceil);
                        break;
                        case 3:
                        System.out .print("Enter the first number :");
                        int numb1=in.nextInt();
                        System.out .print("Enter the sacnend number :");
                        int numb2=in.nextInt();
                        double pow=Math.pow(numb1,numb2);
                        System.out .print("power of number:"+pow);
                        break;
                        case 4:
                        System.out .print("Enter the first number :");
                        int number1=in.nextInt();
                        System.out .print("Enter the sacnend number :");
                        int number2=in.nextInt();
                        double max=Math.max(number1,number2);
                        System.out .print("Max of number:"+max);
                        break;
                        case 5:
                        System.out .print("Enter the first number :");
                        int number=in.nextInt();
                        System.out .print("Enter the sacnend number :");
                        int numbe=in.nextInt();
                        double min=Math.min(number,numbe);
                        System.out .print("Min of number:"+min);
                        break;
                        case 6:
                        System.out .print("Enter number :");
                        int x=in.nextInt();
                        double round=Math.ceil(x);
                        System.out .print("round of number:"+round);
                        break;
                        default:
                        System.out.print ("invalid choices");
                    }
             break; 
              case 5: 
                    System.out .print("Enter the first number :");
                        int n=in.nextInt();
                    System.out .print("Enter the saconed number :");
                        int n0=in.nextInt();
                    if (n>n0)
                        System.out.print("The largest number :"+n);
                    else
                        System.out.print("The largest number :"+n0);
                    break;
                    case 6:
                    System.out .print("Enter the first number :");
                        int n3=in.nextInt();
                    System.out .print("Enter the saconed number :");
                        int n4=in.nextInt();
                    System.out .print("Enter the Third number :");
                        int n5=in.nextInt();
                  int   max = n3;
                    if (max<n4)
                        max=n4;
                    if(max<n5)
                        max=n5;
                    System.out.print("the Largest number :"+max);
                    break;
                    case 7:
                    System.out.print("Enter today's number");
                    byte d=in.nextByte();
                    switch(d){
                        case 1:
                        System.out.print("Sunday");
                        break;
                        case 2:
                        System.out.print("Monday");
                        break;
                        case 3:
                        System.out.print("Tuesday");
                        break;
                        case 4:
                        System.out.print("Wednesday");
                        break;
                        case 5:
                        System.out.print("Thursday");
                        break;
                        case 6:
                        System.out.print("Friday");
                        break;
                        case 7:
                        System.out.print("Saturday");
                        break;
                        default:
                        System.out.print("invalid choice");}
                    break;
                    case 8:
                    System.out.print("Enter seconds : ");
                    int s=in.nextInt();
                    int h=s/3600;
                    int mod=s%3600;
                    int m=mod/60;
                    int s1= mod%60;
                    System.out.print(h +":"+m+":"+s1);
                    break;
                    case 9:
                    int Age=18;
 System.out.print("Enter your salary :");
 double u=in.nextDouble();
 System.out.print("Enter your Name :");
 String y=in.next();
 char i=y.charAt(0);
 System.out.print("are you an employee :");
 boolean t=in.nextBoolean();
 double incomeYear=(u*12);
 System.out.println("Age :"+Age);
 System.out.print("\n_______________________"+
 "\n*\n*   "   +  "Name :"+u+
 "\n*   "   +  "income :"+incomeYear+
 "\n*   "   + "first letter :"+i+
 "\n*_______________________");
                    break;
                    case 10:
                    System.exit(9);
                    break;
            default: 
                System.out.print("invalid choice !") ;   
                }
              System.out.print("\n")  ;  
                } 
            }else
                System.out.print("Error in password!");
        }
        else
        System.out.println("error in Email");
    }}
    
