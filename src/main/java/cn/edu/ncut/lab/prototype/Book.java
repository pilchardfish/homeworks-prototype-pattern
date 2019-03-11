package cn.edu.ncut.lab.prototype;

import java.io.*;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 */
//利用原型模式克隆图书
public class Book implements Cloneable, Serializable {
    private String bookName;
    private String[] authorName;
    private String publisher;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String[] getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String[] authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName=" + Arrays.toString(authorName) +
                ", publisher='" + publisher + '\'' +
                ", price=" + price +
                '}';
    }
}
