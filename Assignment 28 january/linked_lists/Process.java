class Process {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnaroundTime;
    Process next;

    Process(int pid, int burstTime, int priority){
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        this.next = null;
    }
}

class RoundRobinScheduler {
    Process head;

    RoundRobinScheduler(){
        head = null;
    }

    void addProcess(int pid, int burstTime, int priority){
        Process newNode = new Process(pid, burstTime, priority);
        if(head == null){
            head = newNode;
            newNode.next = newNode;
            return;
        }
        Process temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
    }

    void removeProcess(Process prev, Process curr){
        if(curr == head && curr.next == head){
            head = null;
            return;
        }
        if(curr == head){
            head = head.next;
        }
        prev.next = curr.next;
    }

    void display(){
        if(head == null) return;
        Process temp = head;
        do{
            System.out.println(temp.pid + " " + temp.remainingTime);
            temp = temp.next;
        } while(temp != head);
    }

    void schedule(int timeQuantum){
        if(head == null) return;

        int time = 0;
        int totalWaiting = 0;
        int totalTurnaround = 0;
        int count = 0;

        Process curr = head;
        Process prev = null;

        while(head != null){
            if(curr.remainingTime > 0){
                int exec = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= exec;
                time += exec;

                Process temp = curr.next;
                while(temp != curr){
                    temp.waitingTime += exec;
                    temp = temp.next;
                }

                if(curr.remainingTime == 0){
                    curr.turnaroundTime = time;
                    totalWaiting += curr.waitingTime;
                    totalTurnaround += curr.turnaroundTime;
                    count++;
                    removeProcess(prev, curr);
                    curr = (prev == null) ? head : prev.next;
                } else {
                    prev = curr;
                    curr = curr.next;
                }
            }
            display();
            if(head == null) break;
        }

        System.out.println((double)totalWaiting / count);
        System.out.println((double)totalTurnaround / count);
    }

    public static void main(String[] args){
        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 5, 1);
        rr.addProcess(2, 3, 2);
        rr.addProcess(3, 7, 1);

        rr.schedule(2);
    }
}
