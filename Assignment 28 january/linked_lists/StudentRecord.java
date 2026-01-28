public class StudentRecord {
    int roll_number;
    String name;
    int age;
    char grade;
    StudentRecord next;
    StudentRecord(int roll_number,String name,int age,char grade){
        this.roll_number=roll_number;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}
class StudentLinkedList{
    StudentRecord head;
    StudentLinkedList(){
        head=null;
    }

    void addAtBeginning(int roll_number,String name,int age,char grade){
        StudentRecord newNode=new StudentRecord(roll_number, name, age,grade);
        newNode.next=head;
        head=newNode;
    }
    void addAtTheEnd(int roll_number,String name,int age,char grade){
        StudentRecord newNode=new StudentRecord(roll_number, name, age,grade);
        if(head==null){
            head=newNode;
            return;
        }
        StudentRecord temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    void addAtPosition(int position,int roll_number,String name,int age,char grade){
        StudentRecord newNode=new StudentRecord(roll_number, name, age,grade);
        if(position==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        int cnt=1;
        StudentRecord temp=head;
        while(temp!=null){
            if(cnt==position-1){
                newNode.next=temp.next;
                temp.next=newNode;
                break;
            }
            temp=temp.next;
            cnt++;
        }
    }
    void deleteStudent(int roll){
        if(head==null) return;
        if(head.roll_number==roll){
            head=head.next;
            return;
        }
        StudentRecord temp=head;
        StudentRecord prev=null;
        while(temp!=null){
            if(temp.roll_number==roll){
                prev.next=temp.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
    }
    void searchStudent(int roll){
        if(head==null) return;
        StudentRecord temp=head;
        while(temp!=null){
            if(temp.roll_number==roll){
                System.out.println("Student found");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student doesn't exist");
    }
    void updateGrade(int roll, char newGrade){
        if(head==null) return;
        StudentRecord temp=head;
        while(temp!=null){
            if(temp.roll_number==roll){
                temp.grade=newGrade;
                System.out.println("Grade updated");
                return;
            }
            temp=temp.next;
        }
        System.out.println("Invalid roll number");
    }
    void display(){
        if(head==null) return;
        StudentRecord temp=head;
        while(temp!=null){
            System.out.println("Roll number: "+temp.roll_number);
            System.out.println("Name: "+temp.name);
            System.out.println("Age: "+temp.age);
            System.out.println("Grade: "+temp.grade);
            temp=temp.next;
        }
    }

    public static void main(String[] args){
        StudentLinkedList list=new StudentLinkedList();
        list.addAtBeginning(101,"abc",15,'A');
        list.addAtTheEnd(103, "xyz", 15, 'A');
        list.addAtPosition(2,102,"zs",16,'B');
        list.addAtTheEnd(104, "jk", 16, 'C');
       // list.display();

        list.deleteStudent(103);
        list.display();
        list.searchStudent(101);
        list.updateGrade(102, 'A');
        list.updateGrade(103, 'A');
    }

}