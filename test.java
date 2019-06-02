import java.util.Scanner;

public class Book {
    private String IDBook,NameBook,Author,PublishingCompany,Specialized;
    private int NumPage;
    public Book(String IDBook,String NameBook,String Author,String PublishingCompany,String Specialized,int NumPage){
        this.IDBook=IDBook;
        this.NameBook=NameBook;
        this.Author=Author;
        this.PublishingCompany=PublishingCompany;
        this.Specialized=Specialized;
        this.NumPage=NumPage;
    }
    public String getIDBook(){return IDBook;}
    public void setIDBook(){this.IDBook=IDBook;}

    public String getNameBook(){return NameBook;}
    public void setNameBook(){this.NameBook=NameBook;}

    public String getAuthor(){return Author;}
    public void setAuthor(){this.Author=Author;}

    public String getPublishingCompany(){return PublishingCompany;}
    public void setPublishingCompany(){this.PublishingCompany=PublishingCompany;}

    public String getSpecialized(){return Specialized;}
    public void setSpecialized(){this.Specialized=Specialized;}

    public int getNumPage(){return NumPage;}
    public void setNumPage(){this.NumPage=NumPage;}

    public String toString(){
        return "Mã sách: " + this.IDBook + ",Tên sách : "+this.NameBook + ",Tac gia :"+ this.Author +",Tên nhà xuất bản: " + this.PublishingCompany + ",Chuyen nganh : "+this.Specialized + ",So trang: " +
                this.NumPage ;
    }
}

class Exam {
    public static void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap ma sach :");
        String IDBook = scanner.nextLine();

        System.out.println("Nhap ten sach :");
        String NameBook = scanner.nextLine();

        System.out.println("Nhap tac gia :");
        String Author = scanner.nextLine();

        System.out.println("Nhap nha xuat ban :");
        String PublishingCompany = scanner.nextLine();

        System.out.println("Nhap chuyen nganh :");
        String Specialized = scanner.nextLine();

        System.out.println("nhap so trang :");
        int NumPage = scanner.nextInt();
        Book book=new Book(IDBook,NameBook,Author,PublishingCompany,Specialized,NumPage);
        System.out.println(book.toString());

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1: Cong nghe - Thong tin");
        System.out.println("2: Khoa hoc - Doi song");
        System.out.println("3: Van hoc - Nghe thuat");
        System.out.println("0: Thoat");
        int number = scanner.nextInt();
        while (true) {
            if (number < 0 || number > 3) System.out.println("Mời bạn nhập lại");
            else if (number == 0) break;
            else {
                switch (number) {
                    case 1:
                        input();
                        break;
                    case 2:
                        input();
                        break;
                    case 3:
                        input();
                        break;
                }
            }

        }
    }
}
