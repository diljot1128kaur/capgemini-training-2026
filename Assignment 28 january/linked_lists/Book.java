class Book {
    int bookId;
    String title;
    String author;
    String genre;
    boolean available;
    Book next;
    Book prev;

    Book(int bookId, String title, String author, String genre, boolean available){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.available = available;
        this.next = null;
        this.prev = null;
    }
}

class LibraryManagement {
    Book head;

    LibraryManagement(){
        head = null;
    }

    void addAtBeginning(int bookId, String title, String author, String genre, boolean available){
        Book newNode = new Book(bookId, title, author, genre, available);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void addAtTheEnd(int bookId, String title, String author, String genre, boolean available){
        Book newNode = new Book(bookId, title, author, genre, available);
        if(head == null){
            head = newNode;
            return;
        }
        Book temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void addAtPosition(int position, int bookId, String title, String author, String genre, boolean available){
        if(position == 1){
            addAtBeginning(bookId, title, author, genre, available);
            return;
        }
        Book newNode = new Book(bookId, title, author, genre, available);
        Book temp = head;
        int cnt = 1;
        while(temp != null){
            if(cnt == position - 1){
                newNode.next = temp.next;
                if(temp.next != null) temp.next.prev = newNode;
                newNode.prev = temp;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
            cnt++;
        }
    }

    void removeBook(int bookId){
        if(head == null) return;
        Book temp = head;
        while(temp != null){
            if(temp.bookId == bookId){
                if(temp.prev == null){
                    head = temp.next;
                    if(head != null) head.prev = null;
                } else {
                    temp.prev.next = temp.next;
                    if(temp.next != null) temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }

    void searchByTitle(String title){
        Book temp = head;
        while(temp != null){
            if(temp.title.equals(title)){
                System.out.println(temp.bookId + " " + temp.author + " " + temp.genre + " " + temp.available);
                return;
            }
            temp = temp.next;
        }
    }

    void searchByAuthor(String author){
        Book temp = head;
        while(temp != null){
            if(temp.author.equals(author)){
                System.out.println(temp.bookId + " " + temp.title + " " + temp.genre + " " + temp.available);
            }
            temp = temp.next;
        }
    }

    void updateAvailability(int bookId, boolean status){
        Book temp = head;
        while(temp != null){
            if(temp.bookId == bookId){
                temp.available = status;
                return;
            }
            temp = temp.next;
        }
    }

    void displayForward(){
        Book temp = head;
        while(temp != null){
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.available);
            temp = temp.next;
        }
    }

    void displayReverse(){
        if(head == null) return;
        Book temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        while(temp != null){
            System.out.println(temp.bookId + " " + temp.title + " " + temp.author + " " + temp.genre + " " + temp.available);
            temp = temp.prev;
        }
    }

    int countBooks(){
        int count = 0;
        Book temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public static void main(String[] args){
        LibraryManagement library = new LibraryManagement();

        library.addAtBeginning(1, "title1", "abc", "Thriller", true);
        library.addAtTheEnd(2, "title2", "xyz", "Fantasy", true);
        library.addAtPosition(2, 3, "title3", "uty", "SciFi", false);

        library.displayForward();
        System.out.println(library.countBooks());

        library.searchByTitle("title");
        library.searchByAuthor("uty");

        library.updateAvailability(3, true);
        library.removeBook(2);

        library.displayReverse();
    }
}
