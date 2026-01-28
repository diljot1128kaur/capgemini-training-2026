class MovieManagement {
    String title;
    String director;
    int year_of_release;
    int rating;
    MovieManagement next;
    MovieManagement prev;

    MovieManagement(String title, String director,int year_of_release, int rating){
        this.director = director;
        this.title = title;
        this.rating = rating;
        this.year_of_release = year_of_release;
        this.next = null;
        this.prev = null;
    }
}

class MovieManagementLinkedList {
    MovieManagement head;

    MovieManagementLinkedList(){
        head = null;
    }

    void addAtBeginning(String title, String director,int year_of_release, int rating){
        MovieManagement newNode = new MovieManagement(title,director,year_of_release,rating);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    void addAtTheEnd(String title, String director,int year_of_release, int rating){
        MovieManagement newNode = new MovieManagement(title,director,year_of_release,rating);
        if(head == null){
            head = newNode;
            return;
        }
        MovieManagement temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    void addAtPosition(String title, String director,int year_of_release, int rating,int position){
        MovieManagement newNode = new MovieManagement(title,director,year_of_release,rating);

        if(position == 1){
            if(head == null){
                head = newNode;
                return;
            }
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return;
        }

        int cnt = 1;
        MovieManagement temp = head;
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

    void removeMovieRecord(String movieTitle){
        if(head == null) return;

        MovieManagement temp = head;
        while(temp != null){
            if(temp.title.equals(movieTitle)){
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

    void searchByRating(int rating){
        if(head == null) return;
        MovieManagement temp = head;
        boolean found = false;

        while(temp != null){
            if(temp.rating == rating){
                System.out.println(temp.title);
                found = true;
            }
            temp = temp.next;
        }

        if(!found)
            System.out.println("No movie found with given rating");
    }


    void displayForward(){
        if(head == null) return;
        MovieManagement temp = head;
        while(temp != null){
            System.out.println(
                temp.title + " " +
                temp.director + " " +
                temp.year_of_release + " " +
                temp.rating
            );
            temp = temp.next;
        }
    }

    void displayReverse(){
        if(head == null) return;

        MovieManagement temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        while(temp != null){
            System.out.println(
                temp.title + " " +
                temp.director + " " +
                temp.year_of_release + " " +
                temp.rating
            );
            temp = temp.prev;
        }
    }

    void updateRating(String movieTitle, int newRating){
        if(head == null) return;
        MovieManagement temp = head;

        while(temp != null){
            if(temp.title.equals(movieTitle)){
                temp.rating = newRating;
                System.out.println("Rating updated");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    public static void main(String[] args){
        MovieManagementLinkedList list = new MovieManagementLinkedList();

        list.addAtBeginning("abc", "xyz", 2010, 9);
        list.addAtTheEnd("jk", "xyz", 2014, 8);
        list.addAtPosition("ty", "opl", 2009, 7, 2);

        list.displayForward();
        System.out.println();

        list.updateRating("jk", 9);
        list.removeMovieRecord("ty");

        list.displayReverse();
        System.out.println();

        list.searchByRating(9);
    }
}
