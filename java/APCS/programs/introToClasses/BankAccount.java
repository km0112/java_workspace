public class BankAccount
{
  //instance fields

  //amount of money in account
  private int balance;

  //id Number of account
  private int IdNumber;

  //Name of person who owns account
  private String Owner;

//constructors

  //creates a new bank account 
  //Precondition: balance can't be negative
  public BankAccount(int B, int id, String O)
  {
    balance = B;
    IdNumber = id;
    Owner = O;
  }

//Methods

  //this gets the ID number of the account
  public String getIdNumber()
  {
    return IdNumber;
  }

  //this gets the owner name
  public String getOwner()
  {
    return Owner;
  }

  //deposits money into the account
  //Precondition: amount deposited is greater than 0
  public void deposit(double D)
  {
    balance = D + balance;
  }

  //Takes money out of the Account
  //Precondition: W >= 0
  public void withdraw(double W)
  {
    if(W > balance)
    {
      W = 0;
    }

    if(W == 0)
    {
      System.out.println("Why in the world did you make this trip?");
    }

    else
    {
      balance = balance - W;
    }
  }

  //returns the amount of money in the account
  public double checkBalance()
  {
    return balance;
  }

  //writes out the details of the account in string format
  @Override
  public String toString()
    {
      return "Bank Account number " + idNumber + " with" + balance + " dollars in it. The owner of the account is " + Owner;
    }
  //if you have 200$ in account and you try to withdraw 300$, you get nothing









}
