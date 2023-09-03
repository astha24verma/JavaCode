package BasicCode;

import java.util.Scanner;

class Library{

    int no_of_Books;
    int no_of_Books_Issued;
    String[] availBooks;
    String[] issuedBooks;

    Library(){
        this.no_of_Books = 0;
        this.no_of_Books_Issued = 0;
        this.availBooks = new String[10];
        this.issuedBooks = new String[10];
    }


    public void addBook(String book) {
        availBooks[this.no_of_Books] = book;
        this.no_of_Books++;
        System.out.println("Book "+book+" Added Successfully !");
    }


    public void deleteBook(String book){
        boolean flag = false;
        if(availBooks[0] == null) {
            System.out.println(" No Books Available ! First Add one --> ");
        }
        else{
            for (int i =0; i< this.no_of_Books; i++)
            {
                if (availBooks[i].equals(book)) {

                    availBooks[i] = null;

                    for (int j = i; j < this.no_of_Books; j++) {
                            availBooks[j] = availBooks[j + 1];
                    }

                    flag = true;

//                    if (issuedBooks[i].equals(book)) {
//
//                        issuedBooks[i] = null;
//
//                        for (int j =i; j<this.no_of_Books_Issued; j++){
//                            issuedBooks[j] = issuedBooks[j + 1];
//                        }
//
//                    }

                    break;

                }
            }
            if (flag){
                System.out.println("Book Deleted Successfully !");
            }
            else {
                System.out.println("Failed to Delete !! No Book Found.");
            }
        }
    }


    public void issueBook(String book){
        boolean found = false;
        for (int i =0; i< this.no_of_Books; i++){
            if (availBooks[i].equals(book)){

                issuedBooks[this.no_of_Books_Issued] = book;
                this.no_of_Books_Issued++;
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Book "+book+" Issued Successfully !");
        }
        else{
            System.out.println("Failed to Issue !! Book Not Available in Library");
        }

    }


    public void returnBook(String book){
        boolean flag = false;
        for (int i =0; i< this.no_of_Books_Issued; i++)
        {
            if (issuedBooks[i].equals(book)){
                issuedBooks[i] = null;

                for (int j =i; j<this.no_of_Books_Issued; j++){
                    issuedBooks[j] = issuedBooks[j + 1];
                }

                flag = true;
                break;
            }
        }
        if (flag){
            System.out.println("Book Returned Successfully !");
        }
        else {
            System.out.println("Failed to Return !! No Book Found.");
        }
    }
    public void showAvailableBooks(){

        if(availBooks[0] == null) {
            System.out.println(" No Books Available ! Add one --> ");
        }
        else{
                System.out.println("Books Available :--");
                for (int i =0; i< this.no_of_Books; i++)
                {
                    if(availBooks[i] != null){
                        System.out.println(" >> " + availBooks[i]);
                    }
                }
            }
    }

    public void showIssuedBooks() {

        if(issuedBooks[0] == null){
            System.out.println(" You do not have any issued book ! Issue One --> ");
        }
        else{
            System.out.println("Your Issued books are :--");
            for (int i =0; i < this.no_of_Books_Issued; i++) {
                if(issuedBooks[i] != null){
                    System.out.println(" >> " + issuedBooks[i]);
                }
            }
        }
    }

}

public class OnlineLibrary {
    public static void main(String[] args) {

        Library obj = new Library();

        Scanner sc = new Scanner(System.in);
        System.out.println(" Welcome to Library :-- ");
        boolean b = true;
        while(b) {
            System.out.println("\n Choose Number between 1 to 7 :\n" +
                    " 1. Show Available Books \n" +
                    " 2. Add Book To library \n" +
                    " 3. Delete Book From library \n" +
                    " 4. Issue Book \n" +
                    " 5. Show Issued Books \n" +
                    " 6. Return Book \n" +
                    " 7. Exit \n");
            int option = sc.nextInt();
            if (option == 1) {
                obj.showAvailableBooks();
            }
            else if (option == 2) {
                System.out.print("Enter Name of Book : ");
                String bk = sc.next();
                obj.addBook(bk);
            }
            else if (option == 3) {
                System.out.print("Enter Name of Book to Delete : ");
                String delbk = sc.next();
                obj.deleteBook(delbk);
            }
            else if (option == 4) {
                System.out.print("Enter Name of Book to Issue : ");
                String issuebk = sc.next();
                obj.issueBook(issuebk);
            }
            else if (option == 5) {
                obj.showIssuedBooks();
            }
            else if (option == 6) {
                System.out.print("Enter Name of Book to Return : ");
                String rtnbk = sc.next();
                obj.returnBook(rtnbk);
            }
            else {
                b = false;
                break;
            }

        }
//        Library bunny = new Library();
//        bunny.addBook("Tinkerbell");
//        bunny.addBook("HarryPotter");
//        bunny.addBook("JungleBook");
//        bunny.addBook("ResumeLife");
//
//        bunny.showAvailableBooks();
//
//        bunny.issueBook("HarryPotter");
//        bunny.issueBook("JungleBook");
//        bunny.issueBook("Tinkerbell");
//
//       bunny.issueBook("TripToParis");
//
//        bunny.showIssuedBooks();
//
//        bunny.returnBook("Tinkerbell");
//        bunny.returnBook("HarryPotter");
//
//        bunny.showIssuedBooks();

    }
}
