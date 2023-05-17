import java.util.Comparator;
import java.util.Objects;


public class BooksComparator implements Comparator<Book> {

  @Override
  public int compare(Book o1, Book o2) {
    int titleCompare = o1.getTitle().compareTo(o2.getTitle());
    if (!Objects.equals(o1.getTitle(), o2.getTitle())){
      return titleCompare;}
    else {
      return o1.getAuthor().compareTo(o2.getAuthor());
    }

  }
}
