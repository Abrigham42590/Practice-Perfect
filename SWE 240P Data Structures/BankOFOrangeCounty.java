import java.util.Iterator;



public class BankOFOrangeCounty {


    static Node head;//contains head of nodes with account information
    public static CustomLinkedList list = new CustomLinkedList();//called list of accounts as a global object
    public static CustomLinkedList list2 = new CustomLinkedList();//called list of ids as a global object
    private static int count;//counts how many accounts get added per node.
    private static int count1merge;
    private static int count3;
    private static int number;
    private static int payeeid;
    private static int payerid;
    private static int id1;
    private static int id2;
    private static int amount;
    private static String Name;
    private static String Address;
    private static String SocialSecurityNumber;
    private static int InitialDeposit;
    private static int newamountforpayer;
    private static int oldamountforpayer;
    private static int newamountforpayee;
    private static int sumoftwobalances;
    private static String answerquestion;
    private static String mergename;
    private static String mergeaddress;
    private static String mergesocialsecuritynumber;
    private static String mergename2;
    private static String mergeaddress2;
    private static String mergesocialsecuritynumber2;
    private static int mergeinitialdeposit;
    private static int mergeinitialdeposit2;
    private static int mergeid;
    private static int mergeid2;

    //Represents the class Node for account info
    static class Node {

        String name;
        String address;
        String socialsecuritynumber;
        int initialdeposit;
        int id;
        Node next;

    }
    //Represents the class Node for ids

    //Linked List is being implemented below
    static class CustomLinkedList {
        static Node head;
        static Node node;
        static Node node2;
        static CustomLinkedList BankofLosAngeles = new CustomLinkedList();

        //Adds a node for every new account.
        //To merge accounts, traverse to the second added linked list in order to merge the accounts



        public static void add_user(String name, String address, String socialsecuritynumber, int initialdeposit, int id) {

            node = new Node();
            node.name = name;
            node.address = address;
            node.socialsecuritynumber = socialsecuritynumber;
            node.initialdeposit = initialdeposit;
            node.id = id;
            node.next = null;

            if(head == null) {

                head = node;


            }

            else {

                Node current = head;
                while(current.next != null) {
                    current = current.next;


                }

                //adds node at the end of the list and not the front, so from left to right.
                current.next = node;
                current.next.next = node2;


            }


        }

        //is this merging with another linked list?
        public void add_userfromanotherbank(String name, String address, String socialsecuritynumber, int initialdeposit, int id) {

            node2 = new Node();
            node2.name = name;
            node2.address = address;
            node2.socialsecuritynumber = socialsecuritynumber;
            node2.initialdeposit = initialdeposit;
            node2.id = id;
            node2.next = null;

            if(head == null) {

                head = node2;


            }

            Node current = head;

            Node current2 = node;

            while(current.next != null) {
                current = current.next;

            }

            current.next = node2;


        }

        @SuppressWarnings("static-access")
        public void displaymergebanks(CustomLinkedList banka, CustomLinkedList bankb) {
            CustomLinkedList BankofSouthernCalifornia = new CustomLinkedList();

            BankofSouthernCalifornia.display();
        }



        //add a node at any position
        public void add_useratanyposition(String Name, String address, String socialsecuritynumber, int initialdeposit, int position) {

            Node newnode = new Node();
            newnode.name = Name;
            newnode.address = address;
            newnode.socialsecuritynumber = socialsecuritynumber;
            newnode.initialdeposit = initialdeposit;
            newnode.id = position;
            newnode.next = null;

            if(position == 1) {

                newnode.next = head;
                head = newnode;

            }

            else {
                Node previous = head;
                for (int i = 1; i < position - 1; i++) {
                    previous = previous.next;
                }

                newnode.next = previous.next;
                previous.next = newnode;
            }

        }




        // function to create and return a Node




        //for printing Node account information
        public static void display() {

            Node current = head;
            int count1 = 0;
            int count2 = 0;

            while(current != null) {

                System.out.println(current.name + " " + current.address + " " + current.socialsecuritynumber + " " + current.initialdeposit + " " + current.id +" ");

                current = current.next;

            }

        }


        public static int linkedlistsize() {
            Node current = head;
            int count = 0;

            while(current != null) {
                count++;
                current = current.next;

            }

            return count;
        }
        //for printing Node2 id information
        //will delete node or account based off the position of the node
        public static void delete_user(int id) {



            Node temporary = head;
            Node previous = null;


            if(temporary != null && temporary.id == id) {

                head = temporary.next;
                return;
            }

            //loops to that specific id then deletes the node.
            while(temporary != null && temporary.id != id) {
                previous = temporary;
                temporary = temporary.next;
            }

            //if the node is empty it just returns.
            if(temporary == null) {
                return;
            }

            previous.next = temporary.next;


        }


        public static void get_median_id() {

            Node pointer1 = head;
            Node pointer2 = head;
            Node slowpointer = head;

            if(head != null) {

                while(pointer2 != null && pointer2.next != null) {

                    pointer2 = pointer2.next.next;
                    slowpointer = pointer1;
                    pointer1 = pointer1.next;

                }

                if(pointer2 != null) {

                    System.out.println("Middle id is : " + pointer1.id);

                }

                else {

                    System.out.println("Middle id is : " + slowpointer.id);

                }

            }

        }

        //Thoroughly test pay_to_user method to make sure there arent any possible null exceptions etc.
        public static void pay_user_to_user(int payerid, int payeeid, int amount) {

            Node current = head;
            Node current2 = head;
            Node current3 = head;

            int count = 1;
            int count2 = 1;

            oldamountforpayer = current.initialdeposit;

            while(current != null) {

                //if payerid is greater than the size of the list, then that account doesnt exist. Automatic end to program
                if(payerid > linkedlistsize()) {
                    break;
                }
                //same goes for payeeid as above comment
                else if(payeeid > linkedlistsize()) {
                    break;
                }

                else if(count == payerid ) {

                    oldamountforpayer = current.initialdeposit;
                    if(oldamountforpayer < amount) {
                        break;
                    }

                    newamountforpayer = current.initialdeposit - amount;
                    current.initialdeposit = newamountforpayer;
                }
                count++;
                current = current.next;
            }



            while(current2 != null) {
                //must keep consistency in case its vice versa
                if(payerid > linkedlistsize()) {
                    break;
                }
                //same goes for the above as well
                else if(payeeid > linkedlistsize()) {
                    break;
                }

                else if(count2 == payeeid) {

                    if(oldamountforpayer < amount) {
                        break;
                    }

                    newamountforpayee = current2.initialdeposit + amount;
                    current2.initialdeposit = newamountforpayee;

                }
                count2++;
                current2 = current2.next;
            }






        }

        //Thoroughly test mergeaccounts for any possible exceptions or when users are not the same etc.
        public static void mergeaccounts(int id1, int id2) {

            Node current = head;
            Node current2 = head;
            Node current3 = head;
            int count = 1;
            int count2 = 1;
            int count3 = 1;

            //traverses to location of first id.
            while(current != null) {

                if(count == id1) {

                    mergename = current.name;
                    mergeaddress = current.address;
                    mergesocialsecuritynumber = current.socialsecuritynumber;
                    mergeinitialdeposit = current.initialdeposit;
                    mergeid = current.id;


                }

                count++;
                current = current.next;
            }

            //traverses to location of id2.
            while(current2 != null) {

                if(count2 == id2) {
                    mergename2 = current2.name;
                    mergeaddress2 = current2.address;
                    mergesocialsecuritynumber2 = current2.socialsecuritynumber;
                    mergeinitialdeposit2 = current2.initialdeposit;
                    mergeid2 = current2.id;

                    if(mergename.equals(mergename2) && mergeaddress.equals(mergeaddress2) &&
                            mergesocialsecuritynumber.equals(mergesocialsecuritynumber2)) {

                        sumoftwobalances = mergeinitialdeposit + mergeinitialdeposit2;


                        if(mergeid > mergeid2) {

                            mergeinitialdeposit2 = sumoftwobalances;

                            current2.initialdeposit = mergeinitialdeposit2;

                            delete_user(mergeid);

                        }

                    }

                }

                count2++;
                current2 = current2.next;

            }

            //extra traversal loop in case the first id is less than the 2nd id.
            while(current3 != null) {

                if(count3 == id1)  {

                    if(mergename.equals(mergename2) && mergeaddress.equals(mergeaddress2) &&
                            mergesocialsecuritynumber.equals(mergesocialsecuritynumber2)) {

                        sumoftwobalances = mergeinitialdeposit + mergeinitialdeposit2;


                        if(mergeid < mergeid2) {

                            mergeinitialdeposit = sumoftwobalances;

                            current3.initialdeposit = mergeinitialdeposit;

                            delete_user(mergeid2);

                        }



                    }

                }

                count3++;
                current3 = current3.next;
            }

        }

        //Thoroughly test mergeaccounts for any possible exceptions or when users are not the same etc.
        //position1 = location of id that is being repeated on first linked list.
        //position2 = location of repeated id on second linked list.
        //changeid = is the specific number id you want to change on the second linked list.
        public static void changingidsformergingbanks(int position1, int position2, int changeid) {

            Node current = head;
            Node current2 = head;
            Node current3 = head;
            int pmergeid1 = 0;
            int pmergeid2 = 0;
            int count = 1;
            int count2 = 1;
            int count3 = 1;

            //traverses to location of first position.
            while(current != null) {

                if(count == position1) {

                    pmergeid1 = current.id;


                }

                count++;
                current = current.next;
            }

            //traverses to location of position2.
            while(current2 != null) {

                if(count2 == position2) {

                    pmergeid2 = current2.id;


                    if(pmergeid1 == pmergeid2) {
                        current2.id = changeid;
                    }

                }

                count2++;
                current2 = current2.next;

            }

        }
    }






    @SuppressWarnings({ "static-access" })
    public static void main(String[] args) {

        CustomLinkedList BankofOrangeCounty = new CustomLinkedList();
        CustomLinkedList BankofLosAngeles = new CustomLinkedList();
        CustomLinkedList BankofSouthernCalifornia = new CustomLinkedList();

        BankofOrangeCounty.add_user("Alex Brigham", "10684 Esterina Way", "44394930", 20000, 1);
        BankofOrangeCounty.add_user("Bobby Brown", "2393 Compton drive", "23494939", 2000, 2);
        BankofOrangeCounty.add_user("Jackie Brown", "48495 Crenshaw blvd", "4839405", 5000, 3);
        BankofOrangeCounty.add_user("Johnny Cage", "3294 Beverly Hills Drive", "33949590", 3000, 4);
        BankofOrangeCounty.add_user("Alex Brigham", "10684 Esterina Way", "44394930", 10000, 5);
        BankofOrangeCounty.add_user("Bobby Ricks", "34849 Crenshaw blvd", "4394059", 3000, 6);
        BankofOrangeCounty.add_user("Jack Williams", "3495 Brentwood park", "349395", 5000, 7);
        BankofOrangeCounty.add_user("Ricky Carlton", "2349 Park Drive", "32444545", 150000, 8);
        BankofOrangeCounty.add_user("Ricky Ricardo", "1343 Orange Drive", "3829120", 20000, 9);
        BankofOrangeCounty.add_user("Alfonso Brigham", "3843 San Francisco Rd", "955324249", 300000, 10);
        //BankofOrangeCounty.get_median_id();
        //System.out.println(BankofOrangeCounty.linkedlistsize());
        //BankofOrangeCounty.pay_user_to_user(10, 1, 1000000);
        //BankofOrangeCounty.delete_user(1);
        //BankofOrangeCounty.delete_user(2);
        //BankofOrangeCounty.delete_user(3);
        //BankofOrangeCounty.delete_user(4);
        //BankofOrangeCounty.delete_user(5);
        //BankofOrangeCounty.delete_user(6);
        //BankofOrangeCounty.delete_user(7);
        //BankofOrangeCounty.delete_user(8);
        //BankofOrangeCounty.delete_user(9);
        //BankofOrangeCounty.delete_user(10);
        //BankofOrangeCounty.add_useratanyposition("Bobby", "3985 Crenshaw blvd", "459459", 20000, 1);
        //BankofOrangeCounty.add_useratanyposition("Jack Williams", "2485 Crenshaw Park", "34958586", 50000, 2);
        //BankofOrangeCounty.add_useratanyposition("Jack Williams", "2485 Crenshaw Park", "34958586", 100000, 3);
        //BankofOrangeCounty.add_useratanyposition("Jackie Robinson", "3485 Brentwood park", "3485969", 30000, 4);
        //BankofOrangeCounty.add_useratanyposition("Eric Williams", "3485 Brentwood park", "3485969", 40000, 5);
        //BankofOrangeCounty.add_useratanyposition("Ricky Carlson", "2393 Cranks Drive", "239494849", 20000, 6);
        //BankofOrangeCounty.add_useratanyposition("Chris Dawson", "2349 Orange County drive", "32949950", 500000, 7);
        //BankofOrangeCounty.add_useratanyposition("Lebron James", "2349 Brentwood Park", "39329404", 950000, 10);
        //BankofOrangeCounty.pay_user_to_user(10, 1, 20000);
        //BankofOrangeCounty.pay_user_to_user(10, 5, 20000);
        //BankofOrangeCounty.pay_user_to_user(10, 6, 100000);
        //BankofOrangeCounty.pay_user_to_user(5, 7, 20000);
        //BankofOrangeCounty.mergeaccounts(1, 12);
        //BankofOrangeCounty.display();

        //BankofLosAngeles.add_userfromanotherbank("Eric Johnson", "1385 Malibu drive", "3194945", 15000, 3);
        //BankofLosAngeles.add_userfromanotherbank("Bobby Brown", "3493 Sportsman Park", "3249495", 5000, 2);
        //BankofOrangeCounty.changingidsformergingbanks(3, 11, 11);
        //BankofOrangeCounty.changingidsformergingbanks(2, 9, 9);
        //System.out.println(BankofOrangeCounty.linkedlistsize());

        //BankofLosAngeles.add_userfromanotherbank("Eric Johnson", "1385 Malibu drive", "3194945", 15000, 3);
        //BankofSouthernCalifornia.displaymergebanks(BankofOrangeCounty, BankofLosAngeles);
        //BankofLosAngeles.add_user("Roggie Wright", "3934 ChinaTown plaza", "392395", 16000, 2);
        //System.out.println(BankofLosAngeles.linkedlistsize());
        //BankofOrangeCounty.display();



    }
}

