public class ListNode<E>{
//instance variables
    private E data;
    private ListNode<E> link; //class of its self
//constructor
    public ListNode(){
        link=null;
        data=null;
    }
    public ListNode(String newData, ListNode linkValue){
        link = linkValue;
        data = newData;
    }
//setter and getter only "Data" methods
    public void setData(String newData){
        data = newData;
    }
    public String getData(){
        return data;
    }
//mathods
    public void setLink(ListNode newLink){
        link = newLink;
    }
    public ListNode getLink(){
        return link;
    }
}