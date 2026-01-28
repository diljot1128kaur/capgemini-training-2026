class FriendNode {
    int friendId;
    FriendNode next;

    FriendNode(int friendId) {
        this.friendId = friendId;
        this.next = null;
    }
}

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friendHead;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendHead = null;
        this.next = null;
    }
}

class SocialMedia {
    UserNode head;

    void addUser(int id, String name, int age) {
        UserNode newUser = new UserNode(id, name, age);
        if (head == null) {
            head = newUser;
            return;
        }
        UserNode temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newUser;
    }

    UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id)
                return temp;
            temp = temp.next;
        }
        return null;
    }

    UserNode findUserByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    void addFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.friendHead = addFriendNode(u1.friendHead, id2);
        u2.friendHead = addFriendNode(u2.friendHead, id1);
    }

    private FriendNode addFriendNode(FriendNode head, int friendId) {
        FriendNode newNode = new FriendNode(friendId);
        newNode.next = head;
        return newNode;
    }

    void removeFriend(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.friendHead = removeFriendNode(u1.friendHead, id2);
        u2.friendHead = removeFriendNode(u2.friendHead, id1);
    }

    private FriendNode removeFriendNode(FriendNode head, int friendId) {
        if (head == null) return null;

        if (head.friendId == friendId)
            return head.next;

        FriendNode temp = head;
        while (temp.next != null) {
            if (temp.next.friendId == friendId) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        System.out.print("Friends of " + user.name + ": ");
        FriendNode temp = user.friendHead;
        while (temp != null) {
            System.out.print(temp.friendId + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void mutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        System.out.print("Mutual Friends: ");
        FriendNode f1 = u1.friendHead;

        while (f1 != null) {
            FriendNode f2 = u2.friendHead;
            while (f2 != null) {
                if (f1.friendId == f2.friendId)
                    System.out.print(f1.friendId + " ");
                f2 = f2.next;
            }
            f1 = f1.next;
        }
        System.out.println();
    }

    void countFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        int count = 0;
        FriendNode temp = user.friendHead;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        System.out.println("Total friends of " + user.name + ": " + count);
    }
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "a", 22);
        sm.addUser(2, "b", 24);
        sm.addUser(3, "c", 21);
        sm.addUser(4, "d", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(2, 4);

        sm.displayFriends(1);
        sm.displayFriends(2);

        sm.mutualFriends(1, 2);

        sm.countFriends(2);

        sm.removeFriend(1, 2);
        sm.displayFriends(1);
    }
}


