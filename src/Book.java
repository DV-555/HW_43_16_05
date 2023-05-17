import java.util.Objects;

//public class Book {
  public class Book{
    private final String author;
    private final String title;
    private final int numberOfPages;

    public Book(String author, String title, int numberOfPages) {
      this.author = author;
      this.title = title;
      this.numberOfPages = numberOfPages;
    }
    public String getAuthor() {
      return author;
    }
    public String getTitle() {
      return title;
    }
    public int getNumberOfPages() {
      return numberOfPages;
    }
    @Override
    public String toString() {
      return "Book{" +
          "author='" + author + '\'' +
          ", title='" + title + '\'' +
          ", numberOfPages=" + numberOfPages +
          '}'+'\n';
    }
  // @Override
  // public int compareTo(Book o) {
  //   // Сравнение по авторам
  //   int authorComparison = this.author.compareTo(o.author);
  //   if (authorComparison < 0) {
  //     return -1; // Текущая книга должна быть перед другой
  //   } else if (authorComparison > 0) {
        // Текущая книга должна быть после другой
        //__________________________________________________________________________
        //if (!author.equals(o.author)){ - если авторы неодинаковые
        //return author.compareTo(o.author) - сравнение авторов в алф порядке
        //}
  //   }
  //   return 1; //return author.compareTo(o.author);
  // }
  // @Override
  // public boolean equals(Object obj) {
  //   if (this == obj) {
  //     return true;
  //   }
  //   return false;
  // }
  // @Override
  // public int hashCode() {
  //   return Objects.hash(author, title, numberOfPages);
    }


