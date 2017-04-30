
public abstract class ListItem {
	protected ListItem previousItem = null;;
	protected ListItem nextItem = null;;
	
	protected Object itemValue;
	
	public ListItem(Object itemValue) {
		this.itemValue = itemValue;
	}
	
	public abstract ListItem next() ;
	public abstract ListItem previous() ;
	public abstract void setPrevious(ListItem previousItem);
	public abstract void setNext(ListItem nextItem);
	
	public abstract int compareTo(Object compareValue);

}
