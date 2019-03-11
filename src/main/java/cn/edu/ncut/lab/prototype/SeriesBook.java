package cn.edu.ncut.lab.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: pilchard
 * Date: 2019-03-11
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 */
public class SeriesBook extends Book {
    private String seriesName;

    public String getSeriesName() {
        return seriesName;
    }
    /**
     * 克隆该实例
     * 浅克隆
     */
    @Override
    public Object clone(){
        Book book = null;
        try {
            book = (Book) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return book;
    }
    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    /**
     * 深克隆
     * @param b
     * @return book
     */
    public Object deepClone(Book b ){
        SeriesBook book = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream() ;
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(b);

            ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream=new ObjectInputStream(byteArrayInputStream);
            book =(SeriesBook)objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public String toString() {
        return "SeriesBook{" +
                "seriesName='" + seriesName + '\'' +
                "bookName='" +getBookName()  + '\'' +
                ", authorName=" + Arrays.toString(getAuthorName()) +
                ", publisher='" + getPublisher() + '\'' +
                ", price=" + getPrice() +
                '}';
    }
}
