public class Menu {
    String title;
    double price ;
    Menu(String title,double price){
        this.title=title;
        this.price=price;
    }
    public void print(){
        System.out.println("title is: "+ title+"\nprice is:"+ price);
        System.out.println("***********");
    }
}

