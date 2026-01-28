class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    Task next;

    Task(int taskId, String taskName, int priority, String dueDate){
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

class TaskScheduler {
    Task head;
    Task current;

    TaskScheduler(){
        head = null;
        current = null;
    }

    void addAtBeginning(int taskId, String taskName, int priority, String dueDate){
        Task newNode = new Task(taskId, taskName, priority, dueDate);
        if(head == null){
            head = newNode;
            newNode.next = newNode;
            current = head;
            return;
        }
        Task temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
    }

    void addAtTheEnd(int taskId, String taskName, int priority, String dueDate){
        Task newNode = new Task(taskId, taskName, priority, dueDate);
        if(head == null){
            head = newNode;
            newNode.next = newNode;
            current = head;
            return;
        }
        Task temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    void addAtPosition(int taskId, String taskName, int priority, String dueDate, int position){
        if(position == 1){
            addAtBeginning(taskId, taskName, priority, dueDate);
            return;
        }
        Task newNode = new Task(taskId, taskName, priority, dueDate);
        Task temp = head;
        int cnt = 1;
        while(temp.next != head && cnt < position - 1){
            temp = temp.next;
            cnt++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void removeTask(int taskId){
        if(head == null) return;

        Task temp = head;
        Task prev = null;

        do{
            if(temp.taskId == taskId){
                if(prev == null){
                    if(head.next == head){
                        head = current = null;
                        return;
                    }
                    Task last = head;
                    while(last.next != head){
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                    current = head;
                } else {
                    prev.next = temp.next;
                    if(temp == head)
                        head = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while(temp != head);
    }

    void viewCurrentAndMoveNext(){
        if(current == null) return;
        System.out.println(current.taskId + " " + current.taskName + " " + current.priority + " " + current.dueDate);
        current = current.next;
    }

    void display(){
        if(head == null) return;
        Task temp = head;
        do{
            System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while(temp != head);
    }

    void searchByPriority(int priority){
        if(head == null) return;
        Task temp = head;
        boolean found = false;
        do{
            if(temp.priority == priority){
                System.out.println(temp.taskId + " " + temp.taskName);
                found = true;
            }
            temp = temp.next;
        } while(temp != head);
        if(!found)
            System.out.println("No task found");
    }

    public static void main(String[] args){
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtBeginning(1, "TaskA", 1, "10-02-2026");
        scheduler.addAtTheEnd(2, "TaskB", 2, "12-02-2026");
        scheduler.addAtPosition(3, "TaskC", 1, "15-02-2026", 2);

        scheduler.display();
        System.out.println();

        scheduler.viewCurrentAndMoveNext();
        scheduler.viewCurrentAndMoveNext();

        scheduler.searchByPriority(1);

        scheduler.removeTask(2);
        System.out.println();

        scheduler.display();
    }
}
