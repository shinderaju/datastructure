package bridgeLab.Datastructure;
public class Node<T>
{
 private T data;
 private Node<T> link;


//set value of data
 public void setData(T data)
 {
   this.data=data;
 }

//return the value of data
 public T getData()
 {
   return data;
 }

//set value of next link
 public void setLink(Node<T> link)
 {
   this.link=link;
 }

//return value of link
 public Node<T> getLink()
 {
   return link;
 }

}
