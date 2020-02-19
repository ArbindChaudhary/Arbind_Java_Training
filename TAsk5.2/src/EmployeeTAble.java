  import java.util.Scanner;

    class EmployeeTAble
    {
        int Id;
        String Name;
        int Year;
        int Age;
        long Salary;
        String Address;
        

        
        
        void GetData()                                                
        {

            Scanner sc = new Scanner(System.in);
            
           

            System.out.print("Enter Employee Id : ");
            Id = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Employee Name : ");
            Name = sc.nextLine();
            
            System.out.print("Enter Employee Year of Joining : ");
            Year = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Employee Age : ");
            Age = Integer.parseInt(sc.nextLine());

            System.out.print("Enter Employee Salary : ");
            Salary = Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter Employee Address : ");
            Address = sc.nextLine();
            
            
            
            
         
        }
        
        
        

        void PutData()                                                         
        {
        	
        	
        	
        	System.out.print("\n\t" + Id + "\t" +Name + "\t" +Year +"\t" +Age + "\t" +Salary +"\t" +Address );
        }

        
        public static void main(String args[])
       
        {

        	 
        	
        	
        	Scanner sc = new Scanner(System.in);
            
            

            System.out.print("Enter no of Employee : ");
            int n = Integer.parseInt(sc.nextLine());
        
        	
        	
  	
        	
        	  
        	EmployeeTAble[] Emp = new EmployeeTAble[n];
            int i;

            for(i=0;i<n;i++)
                Emp[i] =  new EmployeeTAble();                               

            for(i=0;i<n;i++)
            {
                System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
                Emp[i].GetData();
            }

            System.out.print("\nDetails of Employees\n");
            System.out.print("\n\t" + "Id" + "\t" + "Name" + "\t" +"Year" +"\t" +"Age" + "\t" +"Salary" +"\t" +"Address" );
            
            for(i=0;i<n;i++)
                Emp[i].PutData();
            
            

        }
    }
