
public class ItemNode extends ListItem{

	public ItemNode(Object itemValue) {
		super(itemValue);
		// TODO Auto-generated constructor stub
	}

	@Override
	public ListItem next() {
		// TODO Auto-generated method stub
		return this.nextItem;	
	}

	@Override
	public ListItem previous() {
		// TODO Auto-generated method stub
		return this.previousItem;
	}

	@Override
	public void setPrevious(ListItem previousItem) {
		// TODO Auto-generated method stub
		this.previousItem = previousItem;
	}

	@Override
	public void setNext(ListItem nextItem) {
		// TODO Auto-generated method stub
		this.nextItem = nextItem;
	}

	@Override
	public int compareTo(Object compareValue) {
		// TODO Auto-generated method stub
		return ((String) this.itemValue).compareTo((String)compareValue);
	}
}
