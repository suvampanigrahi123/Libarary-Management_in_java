import java.util.ArrayList;
import java.util.Scanner;

class Libarary{
    ArrayList<String> books=new ArrayList<String>();
    Libarary(ArrayList<String> books){
        this.books=books;
    }
    public void addbook(String bookname){
        books.add(bookname);
    }
    public void Availablebooks(){
        for(String book:books){
            System.out.println(book);
        }
    }
    public void issuebook(String bookname){
        int avail=books.indexOf(bookname);
        if(avail==-1){
            System.out.println("sorry The books You are want This is Not Available..");
        }
        else{
            books.remove(bookname);
            System.out.println("Take ur book keep it save..");
        }
    }
    public void returnbook(String boook){
        addbook(boook);
        System.out.println("Thanks for rerturn..");
    }
}
public class Excercise_07 {
    public static void main(String[] args) {
        /*
        problem statem,ent:-
        create a libarary management system which is capable to :
        1.books info like
        :-book name
        :-book author
        :-issued to
        :-issued on
        user should be able to:
        :-add books
        :-return issued books
        */

        ArrayList<String> l1=new ArrayList<>();
        l1.add("Physics");
        l1.add("Python");
        l1.add("Java JdBc");
        l1.add("Odia");
        l1.add("C fundamentals");
        l1.add("Math");
        Libarary l=new Libarary(l1);
     
        Scanner sc=new Scanner(System.in);
        int n=0;
        do{
            System.out.println("enter 1 for see the books are avaiable");
            System.out.println("enter 2 for give any books to libararay");
            System.out.println("enter 3 for take any books which are avail");
            System.out.println("enter 4 for Return any books");
            System.out.println("enter 5 for Exit");
            int choice=sc.nextInt();
            if(choice==1){
                l.Availablebooks();
            }
            else if(choice==2){
                System.out.println("which books u want to add");
                sc.nextLine();
                String book=sc.nextLine();
                l.addbook(book);
            }
            else if(choice ==3){
                System.out.println("which books u want to take");
                sc.nextLine();
                String book=sc.nextLine();
                l.issuebook(book); 
            }
            else if(choice==4){
                System.out.println("which books u want to return");
                sc.nextLine();
                String book=sc.nextLine();
                l.returnbook(book);
            }
            else if(choice==5){
                n=1;
            }
        }
        while(n!=1);
        System.out.println("Thanks for use our Libarary");
        sc.close();
    }
}
