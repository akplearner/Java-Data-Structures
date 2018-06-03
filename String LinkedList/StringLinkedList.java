public class StringLinkedList{
//instance variable
    private ListNode head;
//constructor
    public StringLinkedList(){
        head = null;
    }
//methods
    public void showList(){ 
        ListNode position = head; //"position" is temp variable
        while(position != null){ //while position is not head?
            System.out.println(position.getData());
            position = position.getLink();
        }
    }

    //return number of nodes on list
    public int length(){ //adds a o
        int count = 0;
        ListNode position = head;
        while(position != null){
            count++;
            position = position.getLink();
        }
        return count;
    }

    //adds a node containing he data addData at the start of the list.
    public void addANodeToStart(String addData){
        head = new ListNode(addData, head);
    }

    //deletes the first node on the list.
    public void deleteHeadNode(){
        if(head != null){
            head = head.getLink();
        }else {
            System.out.println("Deleting from an empty list.");
            System.exit(0);
        }
    }
    //Sees whether target is on the list.
    public boolean onList(String target){
        return find(target) != null;
    }

    //Return a reference to first node containing the target data.(search index)
    //If target not on the list, return null.
    private ListNode find(String target){ // from find ex. ListNode@15db9742
        boolean found = false;
        ListNode position = head;
        while( !found && (position !=null) ){
            String dataAtPosition = position.getData();
            if( dataAtPosition.equals(target)){//euals method check string
                found = true;
            }else{
                position = position.getLink();
            }
        }
        return position;
    }
}