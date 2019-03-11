package cn.edu.ncut.lab.prototype;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */
public class Client {

    public static void main(String[] args) {
        SeriesBook book1=new SeriesBook();
        book1.setBookName("Java 编程思想");
        book1.setPrice(66.00);
        book1.setPublisher("机械工业出版社");
        book1.setAuthorName(new String []{"Bruce Eckel","Bruce Eckel2"});
        //浅克隆
        Book book2=(Book) book1.clone();
        System.out.println("浅克隆，book对象："+(book2==book1));
        System.out.println("浅克隆，author对象："+(book2.getAuthorName()==book1.getAuthorName()));

        //深克隆
        Book book3=(SeriesBook) book1.deepClone(book1);
        System.out.println("深克隆，book对象："+(book3==book1)+"\r\n"+book3.toString());
        System.out.println("深克隆，author对象："+(book3.getAuthorName()==book1.getAuthorName()));
    }

}
